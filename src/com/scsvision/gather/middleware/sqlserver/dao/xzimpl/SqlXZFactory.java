package com.scsvision.gather.middleware.sqlserver.dao.xzimpl;

public class SqlXZFactory {
	private static final SqlXZFactory instance = new SqlXZFactory();

	private SqlXZFactory() {

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
	public static SqlXZFactory getInstance() {
		return instance;
	}

	/**
	 * 查询常吉所有子机构
	 * 
	 * @return
	 */
	public String listStation() {
		return "select * from Station";

	}

	/**
	 * 查询常吉根基构
	 * 
	 * @return
	 */
	public String getParent() {
		return "select TOP 1 * from ExpressWay";
	}

	/**
	 * 根据机构查询设备
	 * 
	 * @return
	 */
	public String listDevice() {
		return "select * from Device where StationNo = ? and DeviceType_Code != '13' and DeviceType_Code != '20'";
	}

	public String listCmsParam() {
		return "select a.DeviceNo,b.SizeTypeValue from (SELECT * FROM Device where DeviceType_Code = 1) as a left join CmsSizeType as b on a.CmsSizeType_Id = b.Id";
	}
}
