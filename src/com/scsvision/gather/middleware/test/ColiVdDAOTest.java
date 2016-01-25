package com.scsvision.gather.middleware.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.scsvision.gather.middleware.sqlserver.dao.ColiVdDAO;
import com.scsvision.gather.middleware.sqlserver.model.VehicleDetector;

/**
 * ColiVdDAOTest
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午5:32:03
 */
public class ColiVdDAOTest extends BaseTest {
	@Autowired
	private ColiVdDAO coliVdDAO;

	@Test
	public void testListVd() {
		List<VehicleDetector> list = coliVdDAO.extract();
		System.out.println(list.size());
	}
}
