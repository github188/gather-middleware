package com.scsvision.gather.middleware.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.scsvision.gather.middleware.sqlserver.dao.LilDAO;
import com.scsvision.gather.middleware.sqlserver.model.Lil;

/**
 * LilDAOTest
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午5:33:07
 */
public class LilDAOTest extends BaseTest {
	@Autowired
	private LilDAO lilDAO;

	@Test
	public void testListLil() {
		List<Lil> list = lilDAO.extract();
		System.out.println(list.size());
	}
}
