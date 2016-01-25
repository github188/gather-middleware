package com.scsvision.gather.middleware.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.scsvision.gather.middleware.sqlserver.dao.TslDAO;
import com.scsvision.gather.middleware.sqlserver.model.Tsl;

/**
 * TslDAOTest
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午10:34:16
 */
public class TslDAOTest extends BaseTest {
	@Autowired
	private TslDAO tslDAO;

	@Test
	public void testListTsl() {
		List<Tsl> list = tslDAO.extract();
		System.out.println(list.size());
	}
}
