package com.scsvision.gather.middleware.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.scsvision.gather.middleware.sqlserver.dao.LoDAO;
import com.scsvision.gather.middleware.sqlserver.model.Loli;

/**
 * LoDAOTest
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午11:59:44
 */
public class LoDAOTest extends BaseTest {
	@Autowired
	private LoDAO loDAO;

	@Test
	public void testListLo() {
		List<Loli> list = loDAO.extract();
		System.out.println(list.size());
	}
}
