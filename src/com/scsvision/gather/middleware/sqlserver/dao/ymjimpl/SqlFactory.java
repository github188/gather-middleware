/**
 * 
 */
package com.scsvision.gather.middleware.sqlserver.dao.ymjimpl;

/**
 * @author znsx
 * 
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
	 * 查询所有机构
	 * 
	 * @return
	 * @author huangbuji
	 *         <p />
	 *         Create at 2014-9-22 下午4:25:22
	 */
	public String listStation() {
		return "select b.* from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' )as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID";
	}

	public String getParent() {
		return "SELECT TOP 1 * from OmRoad where RoadName like '%岩门界%'";
	}

	public String listVd() {
		return "select c.* from OmSmartSensorVD_Real as c inner join (select * from OmDevice where StationID in( select b.StationID from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' ) as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID)) as d on c.DeviceID = d.DeviceID";
	}

	public String listCovi() {
		return "select c.* from OmCOVI_Real as c inner join (select * from OmDevice where StationID in( select b.StationID from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' ) as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID)) as d on c.DeviceID = d.DeviceID";
	}

	public String listCms() {
		return "select p.* from (select e.DeviceID,e.iFaultMessage,e.iStatus,f.CmsID,f.FontName,f.FontSize,f.PlayItemText,f.Stay,f.ChgDate from OmCMS_Real e left join (select c.CmsID,c.ChgDate,c.PlayItemText,d.FontName,d.FontSize,d.Stay from (select b.CmsID , b.CmsDesc,b.PlayItemID,b.PlayItemName,b.PlayItemText,b.ChgDate from OmCmsPlayListRecord b, (select CmsID, max(ChgDate) as chgdate1 from OmCmsPlayListRecord a group by CmsID) tmp where b.cmsId = tmp.CmsID and b.ChgDate = tmp.chgdate1) c left join OmPlayItem d on c.PlayItemID = d.PlayItemId) f on e.DeviceID = f.CmsID) as p inner join (select * from OmDevice where StationID in( select b.StationID from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' ) as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID)) as d on p.DeviceID = d.DeviceID";
	}

	public String listFan() {
		return "select c.* from OmJet_Real as c inner join (select * from OmDevice where StationID in( select b.StationID from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' ) as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID)) as d on c.DeviceID = d.DeviceID";
	}

	public String listFD() {
		return "select c.* from OmCD_Real as c inner join (select * from OmDevice where StationID in( select b.StationID from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' ) as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID)) as d on c.DeviceID = d.DeviceID";
	}

	public String listLi() {
		return "select f.* from (select c.* from OmLux_Real as c inner join (select * from OmDevice where StationID in( select b.StationID from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' ) as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID)) as d on c.DeviceID = d.DeviceID) as f where f.DeviceId like '%LI%'";
		
	}

	public String listLight() {
		return "select c.* from OmLight_Real as c inner join (select * from OmDevice where StationID in( select b.StationID from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' ) as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID)) as d on c.DeviceID = d.DeviceID";
	}

	public String listLil() {
		return "select c.* from OmLS_Real as c inner join (select * from OmDevice where StationID in( select b.StationID from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' ) as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID)) as d on c.DeviceID = d.DeviceID";
	}

	public String listLo() {
		return "select f.* from (select c.* from OmLux_Real as c inner join (select * from OmDevice where StationID in( select b.StationID from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' ) as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID)) as d on c.DeviceID = d.DeviceID) as f where f.DeviceId like '%LO%'";
	}

	public String listNo() {
		return "select f.* from (select c.* from OmLux_Real as c inner join (select * from OmDevice where StationID in( select b.StationID from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' ) as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID)) as d on c.DeviceID = d.DeviceID) as f where f.DeviceId like '%NO%'";
	}

	public String listPb() {
		return "select c.* from OmFB_Real as c inner join (select * from OmDevice where StationID in( select b.StationID from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' ) as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID)) as d on c.DeviceID = d.DeviceID";
	}

	public String listRd() {
		return "select c.* from OmHT_Real as c inner join (select * from OmDevice where StationID in( select b.StationID from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' ) as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID)) as d on c.DeviceID = d.DeviceID";
	}

	public String listTsl() {
		return "select c.* from OmTL_Real as c inner join (select * from OmDevice where StationID in( select b.StationID from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' ) as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID)) as d on c.DeviceID = d.DeviceID";
	}

	public String listWst() {
		return "select c.* from OmRWS_Real_SICKMAIHAK_SMC903 as c inner join (select * from OmDevice where StationID in( select b.StationID from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' ) as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID)) as d on c.DeviceID = d.DeviceID";
	}

	public String listWs() {
		return "select c.* from OmTW_Real as c inner join (select * from OmDevice where StationID in( select b.StationID from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' ) as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID)) as d on c.DeviceID = d.DeviceID";
	}

	public String listWp() {
		return "select c.* from OmWaterPump_Real as c inner join (select * from OmDevice where StationID in( select b.StationID from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' ) as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID)) as d on c.DeviceID = d.DeviceID";
	}

	public String listColiVd() {
		return "select c.* from OmCoilVD_Real as c inner join (select * from OmDevice where StationID in( select b.StationID from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' ) as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID)) as d on c.DeviceID = d.DeviceID";
	}

	public String listCmsParam() {
		return "select c.* from OmCMSCommunicationParam as c inner join (select * from OmDevice where StationID in( select b.StationID from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' ) as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID)) as d on c.CMSID = d.DeviceID";
	}

	public String listDevice() {
		return "select * from OmDevice where StationID in( select b.StationID from (SELECT * FROM OmRoad where RoadName like '%岩门界%' or RoadName like '%吉首%' ) as a left join (select * from OmStation where StationName like '%隧道%') as b on a.RoadID = b.RoadID) and StationID = ? and DevTypeID != '26'";
	}
}
