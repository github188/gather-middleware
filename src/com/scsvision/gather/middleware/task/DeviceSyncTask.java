package com.scsvision.gather.middleware.task;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.SimpleHttpConnectionManager;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpClientParams;
import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.scsvision.gather.middleware.sqlserver.dao.CmsDAO;
import com.scsvision.gather.middleware.sqlserver.dao.DeviceDAO;
import com.scsvision.gather.middleware.sqlserver.dao.OrganDAO;
import com.scsvision.gather.middleware.sqlserver.model.CmsParam;
import com.scsvision.gather.middleware.sqlserver.model.Device;
import com.scsvision.gather.middleware.sqlserver.model.Organ;
import com.scsvision.gather.middleware.sqlserver.util.TypeUtil;
import com.scsvision.gather.middleware.task.model.DeviceDTO;
import com.scsvision.util.file.Configuration;
import com.scsvision.util.xml.ElementUtil;

/**
 * 设备数据同步任务
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-22 上午11:38:35
 */
@Component
public class DeviceSyncTask {

	private static Logger logger = Logger.getLogger(DeviceSyncTask.class);

	@Autowired
	private DeviceDAO deviceDAO;
	@Autowired
	private OrganDAO organDAO;
	@Autowired
	private CmsDAO cmsDAO;
	private Organ parent;

	/**
	 * 机构同步
	 * 
	 * @author huangbuji
	 *         <p />
	 *         Create at 2014-9-22 下午4:35:01
	 */
	public void organSync() {
		parent = organDAO.getParent();
		List<Organ> organs = organDAO.listOrgan();

		String url = "http://"
				+ Configuration.getInstance().getProperties("center_ip") + ":"
				+ Configuration.getInstance().getProperties("center_port")
				+ "/cms" + Constants.PUSH_RESOURCE_28059;

		sendRequest(organRequestBody(organs), url);
	}

	/**
	 * 设备同步
	 * 
	 * @author huangbuji
	 *         <p />
	 *         Create at 2014-9-22 下午4:35:14
	 */
	@Scheduled(cron = "0 0/10 * * * ?")
	public void deviceSync() {
		try {
			List<Organ> organs = organDAO.listOrgan();
			for (Organ organ : organs) {
				List<Device> devices = deviceDAO.listDevice(organ.getId());

				String url = "http://"
						+ Configuration.getInstance()
								.getProperties("center_ip")
						+ ":"
						+ Configuration.getInstance().getProperties(
								"center_port") + "/cms"
						+ Constants.PUSH_RESOURCE_28059;

				sendRequest(deviceRequestBody(devices, organ), url);
			}
		} catch (Exception e) {
			logger.error(null, e);
		}
	}

	/**
	 * 生成资源上报请求消息体
	 * 
	 * @param devices
	 *            资源列表
	 * @return
	 * @author huangbuji
	 *         <p />
	 *         Create at 2014-9-22 下午3:55:38
	 */
	private String deviceRequestBody(List<Device> devices, Organ organ) {
		if (null == parent) {
			parent = organDAO.getParent();
		}

		Document doc = new Document();
		Element root = new Element("Action");
		doc.setRootElement(root);

		Element variable = new Element("Variable");
		variable.setText("Catalog");
		root.addContent(variable);

		Element name = new Element("Name");
		name.setText(organ.getName());
		root.addContent(name);

		Element coding = new Element("Coding");
		coding.setText(organ.getSn());
		root.addContent(coding);

		Element p = new Element("Parent");
		p.setText(parent.getSn());
		root.addContent(p);

		Element status = new Element("Status");
		status.setText("1");
		root.addContent(status);

		Element subNum = new Element("Subnum");
		subNum.setText(devices != null ? devices.size() + "" : "");
		root.addContent(subNum);

		Element subList = new Element("Sublist");
		root.addContent(subList);

		List<String> childProperties = Arrays.asList("name", "coding",
				"privilege", "parent", "status", "longitude", "latitude",
				"roadway", "pileno", "type", "navigation", "width", "height");

		// 查询全部的情报板
		List<CmsParam> cmsParams = cmsDAO.listCmsParam();

		try {
			for (Device device : devices) {
				DeviceDTO dto = new DeviceDTO();
				dto.setCoding(device.getId());
				dto.setName(device.getName());
				dto.setParent(device.getParent());
				dto.setPileNo(device.getStakeNumber());
				dto.setPrivilege("1");
				dto.setRoadway(parent.getName());
				dto.setStatus("1");
				dto.setType(device.getType() + "");
				dto.setNavigation(device.getNavigation() + "");
				// 情报板设置高度和宽度属性
				if (device.getType() == TypeUtil.DEVICE_TYPE_CMS) {
					for (CmsParam cms : cmsParams) {
						if (cms.getStandardNum().equals(device.getId())) {
							dto.setWidth(cms.getWidth());
							dto.setHeight(cms.getHeight());
							break;
						}
					}
				}

				Element item = ElementUtil.createElement("Item", dto,
						childProperties, null);
				subList.addContent(item);
			}
		} catch (Exception e) {
			logger.error(null, e);
		}

		String body = ElementUtil.doc2String(doc);
		if (logger.isDebugEnabled()) {
			logger.debug(body);
		}
		return body;
	}

	/**
	 * 生成机构资源上报请求消息体
	 * 
	 * @return
	 * @author huangbuji
	 *         <p />
	 *         Create at 2014-9-22 下午4:36:45
	 */
	private String organRequestBody(List<Organ> organs) {
		Document doc = new Document();
		Element root = new Element("Action");
		doc.setRootElement(root);

		Element variable = new Element("Variable");
		variable.setText("Catalog");
		root.addContent(variable);

		Element name = new Element("Name");
		name.setText(parent.getName());
		root.addContent(name);

		Element coding = new Element("Coding");
		coding.setText(parent.getSn());
		root.addContent(coding);

		Element p = new Element("Parent");
		p.setText("");
		root.addContent(p);

		Element status = new Element("Status");
		status.setText("1");
		root.addContent(status);

		Element subNum = new Element("Subnum");
		subNum.setText(organs.size() + "");
		root.addContent(subNum);

		Element subList = new Element("Sublist");
		root.addContent(subList);

		List<String> childProperties = Arrays.asList("name", "coding",
				"privilege", "parent", "status", "longitude", "latitude",
				"roadway", "pileno", "type");

		try {
			for (Organ organ : organs) {
				DeviceDTO dto = new DeviceDTO();
				dto.setCoding(organ.getSn());
				dto.setName(organ.getName());
				dto.setParent(organ.getParent());
				dto.setStatus("1");
				dto.setType("100");

				Element item = ElementUtil.createElement("Item", dto,
						childProperties, null);
				subList.addContent(item);
			}
		} catch (Exception e) {
			logger.error(null, e);
		}

		String body = ElementUtil.doc2String(doc);
		if (logger.isDebugEnabled()) {
			logger.debug(body);
		}
		return body;
	}

	private void sendRequest(String body, String url) {
		HttpClient client = new HttpClient(new HttpClientParams(),
				new SimpleHttpConnectionManager(true));
		PostMethod method = new PostMethod(url);
		try {
			RequestEntity entity = new StringRequestEntity(body,
					"application/xml", "utf8");
			method.setRequestEntity(entity);
			client.executeMethod(method);
			// 返回
			SAXBuilder builder = new SAXBuilder();
			Document respDoc = builder.build(method.getResponseBodyAsStream());
			String code = respDoc.getRootElement().getAttributeValue("Code");
			if (!"200".equals(code)) {
				logger.error(ElementUtil.doc2String(respDoc));
			}
		} catch (Exception e) {
			logger.error(null, e);
		} finally {
			method.releaseConnection();
		}
	}
}
