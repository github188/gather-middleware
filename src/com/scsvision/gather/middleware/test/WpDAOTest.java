package com.scsvision.gather.middleware.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.scsvision.gather.middleware.sqlserver.dao.WpDAO;
import com.scsvision.gather.middleware.sqlserver.model.Wp;

/**
 * WpDAOTest
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午5:28:43
 */
public class WpDAOTest extends BaseTest {
	@Autowired
	private WpDAO wpDAO;

	@Test
	public void testListWp() {
		List<Wp> list = wpDAO.extract();
		System.out.println(list.size());
	}
}
