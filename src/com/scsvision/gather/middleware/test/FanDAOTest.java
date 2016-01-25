package com.scsvision.gather.middleware.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.scsvision.gather.middleware.sqlserver.dao.FanDAO;
import com.scsvision.gather.middleware.sqlserver.model.Fan;

/**
 * FanDAOTest
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午11:57:12
 */
public class FanDAOTest extends BaseTest {
	@Autowired
	private FanDAO fanDAO;

	@Test
	public void testListFan() {
		List<Fan> list = fanDAO.extract();
		System.out.println(list.size());
	}
}
