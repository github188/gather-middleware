package com.scsvision.gather.middleware.sqlserver.dao;

/**
 * SqlFactory
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-18 下午1:39:23
 */
public class SqlFactory {
	private static final SqlFactory instance = new SqlFactory();

	private SqlFactory() {

	}

	/**
	 * 
	 * 单列模式获取类的实例
	 * 
	 * @return 类的实例
	 * @author huangbuji
	 *         <p />
	 *         Create at 2014-9-18 下午1:39:23
	 */
	public static SqlFactory getInstance() {
		return instance;
	}

	/**
	 * 查询车检器数据
	 * 
	 * @return
	 * @author huangbuji
	 *         <p />
	 *         Create at 2014-9-18 下午1:40:59
	 */
	public String listVd() {
		return "select * from OmSmartSensorVD_Real";
	}

	/**
	 * 查询车道指示灯
	 * 
	 * @return
	 * @author wangbinyu
	 *         <p />
	 *         Create at 2014 下午5:11:33
	 */
	public String listLil() {
		return "select * from OmLS_Real";
	}

	/**
	 * 查询交通信号灯
	 * 
	 * @return
	 * @author wangbinyu
	 *         <p />
	 *         Create at 2014 上午10:33:01
	 */
	public String listTsl() {
		return "select * from OmTL_Real";
	}

	/**
	 * 查询横洞门
	 * 
	 * @return
	 * @author wangbinyu
	 *         <p />
	 *         Create at 2014 上午10:50:41
	 */
	public String listRd() {
		return "select * from OmHT_Real";
	}

	/**
	 * 查询射流风机
	 * 
	 * @return
	 * @author wangbinyu
	 *         <p />
	 *         Create at 2014 上午11:56:36
	 */
	public String listFan() {
		return "select * from OmJet_Real";
	}

	/**
	 * 查询情报板
	 * 
	 * @return
	 * @author wangbinyu
	 *         <p />
	 *         Create at 2014 下午2:05:22
	 */
	public String listCms() {
		return "select e.DeviceID,e.iFaultMessage,e.iStatus,f.CmsID,f.FontName,f.FontSize,f.ForeColor,f.PlayItemText,f.Stay,f.ChgDate from OmCMS_Real e left join (select c.CmsID,c.ChgDate,c.PlayItemText,d.FontName,d.FontSize,d.Stay,d.ForeColor from (select b.CmsID , b.CmsDesc,b.PlayItemID,b.PlayItemName,b.PlayItemText,b.ChgDate from OmCmsPlayListRecord b, (select CmsID, max(ChgDate) as chgdate1 from OmCmsPlayListRecord a group by CmsID) tmp where b.cmsId = tmp.CmsID and b.ChgDate = tmp.chgdate1) c left join OmPlayItem d on c.PlayItemID = d.PlayItemId) f on e.DeviceID = f.CmsID";
	}

	/**
	 * 查询一氧化碳\能见度
	 * 
	 * @return
	 * @author wangbinyu
	 *         <p />
	 *         Create at 2014 下午2:20:18
	 */
	public String listCovi() {
		return "select * from OmCOVI_Real";
	}

	/**
	 * 查询风速风向检测器
	 * 
	 * @return
	 * @author wangbinyu
	 *         <p />
	 *         Create at 2014 下午2:35:25
	 */
	public String listWs() {
		return "select * from OmTW_Real";
	}

	/**
	 * 查询照明回路
	 * 
	 * @return
	 * @author wangbinyu
	 *         <p />
	 *         Create at 2014 下午3:05:33
	 */
	public String listLight() {
		return "select * from OmLight_Real";
	}

	/**
	 * 查询手动报警按钮
	 * 
	 * @return
	 * @author wangbinyu
	 *         <p />
	 *         Create at 2014 下午4:26:06
	 */
	public String listPb() {
		return "select * from OmFB_Real";
	}

	/**
	 * 查询消防水泵
	 * 
	 * @return
	 * @author wangbinyu
	 *         <p />
	 *         Create at 2014 下午5:26:29
	 */
	public String listWp() {
		return "select * from OmWaterPump_Real";
	}

	/**
	 * 查询气象检测器
	 * 
	 * @return
	 * @author wangbinyu
	 *         <p />
	 *         Create at 2014 上午10:01:19
	 */
	public String listWst() {
		return "select * from OmRWS_Real_SICKMAIHAK_SMC903";
	}

	/**
	 * 查询所有设备
	 * 
	 * @return
	 * @author huangbuji
	 *         <p />
	 *         Create at 2014-9-22 下午2:30:38
	 */
	public String listDevice() {
		return "select * from OmDevice where StationID = ? and DevTypeID != '26'";
	}

	/**
	 * 查询所有机构
	 * 
	 * @return
	 * @author huangbuji
	 *         <p />
	 *         Create at 2014-9-22 下午4:25:22
	 */
	public String listStation() {
		return "select * from OmStation";
	}

	/**
	 * 获取吉茶根机构
	 * 
	 * @return
	 * @author huangbuji
	 *         <p />
	 *         Create at 2014-9-22 下午4:48:24
	 */
	public String getParent() {
		return "SELECT TOP 1 * from OmRoad";
	}
	
	/**
	 * 获取常吉跟机构
	 * 
	 * @return
	 */
//	public String getParent() {
//		return "SELECT TOP 1 * from OmRoad where RoadName like '%岩门界%'";
//	}

	/**
	 * 查询氮氧化物
	 * 
	 * @return
	 * @author wangbinyu
	 *         <p />
	 *         Create at 2014 上午10:45:53
	 */
	public String listNo() {
		return "select * from OmLux_Real where DeviceId like '%NO%'";
	}

	/**
	 * 查询洞外照度
	 * 
	 * @return
	 * @author wangbinyu
	 *         <p />
	 *         Create at 2014 上午11:56:59
	 */
	public String listLo() {
		return "select * from OmLux_Real where DeviceId like '%LO%'";
	}

	/**
	 * 查询洞内照度
	 * 
	 * @return
	 * @author wangbinyu
	 *         <p />
	 *         Create at 2014 下午12:04:42
	 */
	public String listLi() {
		return "select * from OmLux_Real where DeviceId like '%LI%'";
	}

	/**
	 * 查询火灾检测器
	 * 
	 * @return
	 * @author wangbinyu
	 *         <p />
	 *         Create at 2014 下午2:20:51
	 */
	public String listFD() {
		return "select * from OmCD_Real";
	}

	/**
	 * 查询线圈车检器
	 * 
	 * @return
	 * @author wangbinyu
	 *         <p />
	 *         Create at 2014 下午5:18:32
	 */
	public String listColiVd() {
		return "select * from OmCoilVD_Real";
	}

	/**
	 * 查询情报板属性
	 * 
	 * @return
	 * @author huangbuji
	 *         <p />
	 *         Create at 2014-9-28 上午10:57:01
	 */
	public String listCmsParam() {
		return "select * from OmCMSCommunicationParam";
	}
}
