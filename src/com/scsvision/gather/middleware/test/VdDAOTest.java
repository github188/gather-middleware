package com.scsvision.gather.middleware.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.scsvision.gather.middleware.sqlserver.dao.VehicleDetectorDAO;
import com.scsvision.gather.middleware.sqlserver.model.VehicleDetector;

/**
 * VdManagerTest
 * @author huangbuji <p />
 * Create at 2014-9-18 下午2:56:52
 */
public class VdDAOTest extends BaseTest {
	
	@Autowired
	private VehicleDetectorDAO vdDAO;
	
	@Test
	public void testListVd() {
		List<VehicleDetector> list = vdDAO.extract();
		System.out.println(list.size());
	}
}
