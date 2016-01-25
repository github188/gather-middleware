package com.scsvision.gather.middleware.sqlserver.dao;

import java.util.List;

import com.scsvision.gather.middleware.sqlserver.model.Device;

/**
 * DeviceDAO
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-22 下午2:03:28
 */
public interface DeviceDAO {
	/**
	 * 查询数据库中所有设备
	 * 
	 * @return
	 * @author huangbuji
	 *         <p />
	 *         Create at 2014-9-22 下午2:04:34
	 */
	public List<Device> listDevice(String organId);
}
