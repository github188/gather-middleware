package com.scsvision.gather.middleware.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.scsvision.gather.middleware.sqlserver.dao.WindSpeedDAO;
import com.scsvision.gather.middleware.sqlserver.model.WindSpeed;

/**
 * WindSpeedDAOTest
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午2:36:16
 */
public class WindSpeedDAOTest extends BaseTest {
	@Autowired
	private WindSpeedDAO windSpeedDAO;

	@Test
	public void testListWs() {
		List<WindSpeed> list = windSpeedDAO.extract();
		System.out.println(list.size());
	}
}
