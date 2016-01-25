package com.scsvision.gather.middleware.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.scsvision.gather.middleware.sqlserver.dao.DeviceDAO;
import com.scsvision.gather.middleware.sqlserver.model.Device;

/**
 * DeviceDAOTest
 * @author huangbuji <p />
 * Create at 2014-9-22 下午3:43:23
 */
public class DeviceDAOTest extends BaseTest {
	@Autowired
	private DeviceDAO deviceDAO;
	
	@Test
	public void listDevices() {
		List<Device> devices = deviceDAO.listDevice("SHH03");
		System.out.println(devices.size());
	}
}
