package com.scsvision.gather.middleware.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

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

import com.scsvision.gather.middleware.data.service.DataService;
import com.scsvision.gather.middleware.sqlserver.model.Cms;
import com.scsvision.gather.middleware.sqlserver.model.Covi;
import com.scsvision.gather.middleware.sqlserver.model.Fan;
import com.scsvision.gather.middleware.sqlserver.model.FireDetector;
import com.scsvision.gather.middleware.sqlserver.model.Light;
import com.scsvision.gather.middleware.sqlserver.model.Lil;
import com.scsvision.gather.middleware.sqlserver.model.Loli;
import com.scsvision.gather.middleware.sqlserver.model.NoDetector;
import com.scsvision.gather.middleware.sqlserver.model.PushButton;
import com.scsvision.gather.middleware.sqlserver.model.Rd;
import com.scsvision.gather.middleware.sqlserver.model.Tsl;
import com.scsvision.gather.middleware.sqlserver.model.VehicleDetector;
import com.scsvision.gather.middleware.sqlserver.model.WeatherStat;
import com.scsvision.gather.middleware.sqlserver.model.WindSpeed;
import com.scsvision.gather.middleware.sqlserver.model.Wp;
import com.scsvision.gather.middleware.sqlserver.util.TypeUtil;
import com.scsvision.util.file.Configuration;
import com.scsvision.util.xml.ElementUtil;

/**
 * 数据上报任务
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-18 下午3:52:28
 */
@Component
public class ReportTask {

	private static Logger logger = Logger.getLogger(ReportTask.class);
	@Autowired
	private DataService dataService;

	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	@Scheduled(cron = "10 0/2 * * * ?")
	public void report() {
		try {
			logger.info("do report...");
			// 上报xml构建
			Document doc = new Document();
			Element root = new Element("Request");
			root.setAttribute("Method", "DAS_Report");
			root.setAttribute("Cmd", "3101");
			doc.setRootElement(root);

			// 小于系统一天时间的采集数据视作通信失败
//			long failTime = System.currentTimeMillis() - 86400000;
			String now = sdf.format(new Date());

			// 读取缓存数据
			// VD
			String vdType = TypeUtil.DEVICE_TYPE_VD + "";
			Collection<VehicleDetector> vds = dataService.listVd();
			if (null != vds) {
				for (VehicleDetector vd : vds) {
//					if (sdf.parse(vd.getRecTime()).getTime() < failTime) {
//						vd.setCommStatus("1");
//						vd.setRecTime(now);
//					} else {
//						vd.setCommStatus("0");
//					}
					vd.setCommStatus("0");
					vd.setRecTime(now);
					Element device = ElementUtil.createElement("Device", vd);
					device.setAttribute("Type", vdType);
					root.addContent(device);
				}
			}
			// Covi
			String coviType = TypeUtil.DEVICE_TYPE_COVI + "";
			Collection<Covi> covis = dataService.listCovi();
			if (null != covis) {
				for (Covi covi : covis) {
//					if (sdf.parse(covi.getRecTime()).getTime() < failTime) {
//						covi.setCommStatus("1");
//						covi.setRecTime(now);
//					} else {
//						covi.setCommStatus("0");
//					}
					covi.setCommStatus("0");
					covi.setRecTime(now);
					Element device = ElementUtil.createElement("Device", covi);
					device.setAttribute("Type", coviType);
					root.addContent(device);
				}
			}
			// Fan
			String fanType = TypeUtil.DEVICE_TYPE_FAN + "";
			Collection<Fan> fans = dataService.listFan();
			if (null != fans) {
				for (Fan fan : fans) {
//					if (sdf.parse(fan.getRecTime()).getTime() < failTime) {
//						fan.setCommStatus("1");
//						fan.setRecTime(now);
//					} else {
//						fan.setCommStatus("0");
//					}
					fan.setCommStatus("0");
					fan.setRecTime(now);
					Element device = ElementUtil.createElement("Device", fan);
					device.setAttribute("Type", fanType);
					root.addContent(device);
				}
			}
			// FD
			String fdType = TypeUtil.DEVICE_TYPE_FD + "";
			Collection<FireDetector> fds = dataService.listFd();
			if (null != fds) {
				for (FireDetector fd : fds) {
//					if (sdf.parse(fd.getRecTime()).getTime() < failTime) {
//						fd.setCommStatus("1");
//						fd.setRecTime(now);
//					} else {
//						fd.setCommStatus("0");
//					}
					fd.setCommStatus("0");
					fd.setRecTime(now);
					Element device = ElementUtil.createElement("Device", fd);
					device.setAttribute("Type", fdType);
					root.addContent(device);
				}
			}
			// Light
			String lightType = TypeUtil.DEVICE_TYPE_LIGHT + "";
			Collection<Light> lights = dataService.listLight();
			if (null != lights) {
				for (Light light : lights) {
//					if (sdf.parse(light.getRecTime()).getTime() < failTime) {
//						light.setCommStatus("1");
//						light.setRecTime(now);
//					} else {
//						light.setCommStatus("0");
//					}
					light.setCommStatus("0");
					light.setRecTime(now);
					Element device = ElementUtil.createElement("Device", light);
					device.setAttribute("Type", lightType);
					root.addContent(device);
				}
			}
			// LIL
			String lilType = TypeUtil.DEVICE_TYPE_LIL + "";
			Collection<Lil> lils = dataService.listLil();
			if (null != lils) {
				for (Lil lil : lils) {
//					if (sdf.parse(lil.getRecTime()).getTime() < failTime) {
//						lil.setCommStatus("1");
//						lil.setRecTime(now);
//					} else {
//						lil.setCommStatus("0");
//					}
					lil.setCommStatus("0");
					lil.setRecTime(now);
					Element device = ElementUtil.createElement("Device", lil);
					device.setAttribute("Type", lilType);
					root.addContent(device);
				}
			}
			// LOLI
			String loliType = TypeUtil.DEVICE_TYPE_LOLI + "";
			Collection<Loli> los = dataService.listLo();
			Collection<Loli> lis = dataService.listLi();
			if (null != los) {
				for (Loli loli : los) {
//					if (sdf.parse(loli.getRecTime()).getTime() < failTime) {
//						loli.setCommStatus("1");
//						loli.setRecTime(now);
//					} else {
//						loli.setCommStatus("0");
//					}
					loli.setCommStatus("0");
					loli.setRecTime(now);
					Element device = ElementUtil.createElement("Device", loli);
					device.setAttribute("Type", loliType);
					root.addContent(device);
				}
			}
			if (null != lis) {
				for (Loli loli : lis) {
//					if (sdf.parse(loli.getRecTime()).getTime() < failTime) {
//						loli.setCommStatus("1");
//						loli.setRecTime(now);
//					} else {
//						loli.setCommStatus("0");
//					}
					loli.setCommStatus("0");
					loli.setRecTime(now);
					Element device = ElementUtil.createElement("Device", loli);
					device.setAttribute("Type", loliType);
					root.addContent(device);
				}
			}
			// NOD
			String nodType = TypeUtil.DEVICE_TYPE_NOD + "";
			Collection<NoDetector> nods = dataService.listNo();
			if (null != nods) {
				for (NoDetector nod : nods) {
//					if (sdf.parse(nod.getRecTime()).getTime() < failTime) {
//						nod.setCommStatus("1");
//						nod.setRecTime(now);
//					} else {
//						nod.setCommStatus("0");
//					}
					nod.setCommStatus("0");
					nod.setRecTime(now);
					Element device = ElementUtil.createElement("Device", nod);
					device.setAttribute("Type", nodType);
					root.addContent(device);
				}
			}
			// PB
			String pbType = TypeUtil.DEVICE_TYPE_PB + "";
			Collection<PushButton> pbs = dataService.listPushButton();
			if (null != pbs) {
				for (PushButton pb : pbs) {
//					if (sdf.parse(pb.getRecTime()).getTime() < failTime) {
//						pb.setCommStatus("1");
//						pb.setRecTime(now);
//					} else {
//						pb.setCommStatus("0");
//					}
					pb.setCommStatus("0");
					pb.setRecTime(now);
					Element device = ElementUtil.createElement("Device", pb);
					device.setAttribute("Type", pbType);
					root.addContent(device);
				}
			}
			// RD
			String rdType = TypeUtil.DEVICE_TYPE_RD + "";
			Collection<Rd> rds = dataService.listRd();
			if (null != rds) {
				for (Rd rd : rds) {
//					if (sdf.parse(rd.getRecTime()).getTime() < failTime) {
//						rd.setCommStatus("1");
//						rd.setRecTime(now);
//					} else {
//						rd.setCommStatus("0");
//					}
					rd.setCommStatus("0");
					rd.setRecTime(now);
					Element device = ElementUtil.createElement("Device", rd);
					device.setAttribute("Type", rdType);
					root.addContent(device);
				}
			}
			// TSL
			String tslType = TypeUtil.DEVICE_TYPE_TSL + "";
			Collection<Tsl> tsls = dataService.listTsl();
			if (null != tsls) {
				for (Tsl tsl : tsls) {
//					if (sdf.parse(tsl.getRecTime()).getTime() < failTime) {
//						tsl.setCommStatus("1");
//						tsl.setRecTime(now);
//					} else {
//						tsl.setCommStatus("0");
//					}
					tsl.setCommStatus("0");
					tsl.setRecTime(now);
					Element device = ElementUtil.createElement("Device", tsl);
					device.setAttribute("Type", tslType);
					root.addContent(device);
				}
			}
			// WST
			String wstType = TypeUtil.DEVICE_TYPE_WST + "";
			Collection<WeatherStat> wsts = dataService.listWst();
			if (null != wsts) {
				for (WeatherStat wst : wsts) {
//					if (sdf.parse(wst.getRecTime()).getTime() < failTime) {
//						wst.setCommStatus("1");
//						wst.setRecTime(now);
//					} else {
//						wst.setCommStatus("0");
//					}
					wst.setCommStatus("0");
					wst.setRecTime(now);
					Element device = ElementUtil.createElement("Device", wst);
					device.setAttribute("Type", wstType);
					root.addContent(device);
				}
			}
			// WS
			String wsType = TypeUtil.DEVICE_TYPE_WS + "";
			Collection<WindSpeed> wss = dataService.listWindSpeed();
			if (null != wss) {
				for (WindSpeed ws : wss) {
//					if (sdf.parse(ws.getRecTime()).getTime() < failTime) {
//						ws.setCommStatus("1");
//						ws.setRecTime(now);
//					} else {
//						ws.setCommStatus("0");
//					}
					ws.setCommStatus("0");
					ws.setRecTime(now);
					Element device = ElementUtil.createElement("Device", ws);
					device.setAttribute("Type", wsType);
					root.addContent(device);
				}
			}
			// WP
			String wpType = TypeUtil.DEVICE_TYPE_WP + "";
			Collection<Wp> wps = dataService.listWp();
			if (null != wps) {
				for (Wp wp : wps) {
//					if (sdf.parse(wp.getRecTime()).getTime() < failTime) {
//						wp.setCommStatus("1");
//						wp.setRecTime(now);
//					} else {
//						wp.setCommStatus("0");
//					}
					wp.setCommStatus("0");
					wp.setRecTime(now);
					Element device = ElementUtil.createElement("Device", wp);
					device.setAttribute("Type", wpType);
					root.addContent(device);
				}
			}
			// CMS
			String cmsType = TypeUtil.DEVICE_TYPE_CMS + "";
			Collection<Cms> cmss = dataService.listCms();
			if (null != cmss) {
				for (Cms cms : cmss) {
//					if (sdf.parse(cms.getRecTime()).getTime() < failTime) {
//						cms.setCommStatus("1");
//						cms.setRecTime(now);
//					} else {
//						cms.setCommStatus("0");
//					}
					cms.setCommStatus("0");
					cms.setRecTime(now);
					Element device = ElementUtil.createElement("Device", cms);
					device.setAttribute("Type", cmsType);
					root.addContent(device);
				}
			}
			// 上报中心
			String body = ElementUtil.doc2String(doc);
			String url = "http://"
					+ Configuration.getInstance().getProperties("center_ip")
					+ ":"
					+ Configuration.getInstance().getProperties("center_port")
					+ "/cms" + Constants.DAS_REPORT;
			sendRequest(body, url);
		} catch (Exception e) {
			logger.error(null, e);
		}
	}

	/**
	 * 发送HTTP请求
	 * 
	 * @param body
	 *            请求body
	 * @param url
	 *            请求url
	 * @author huangbuji
	 *         <p />
	 *         Create at 2014-9-25 下午5:28:59
	 */
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
			logger.info("report success!");
		} catch (Exception e) {
			logger.error(null, e);
		} finally {
			method.releaseConnection();
		}
	}
}
