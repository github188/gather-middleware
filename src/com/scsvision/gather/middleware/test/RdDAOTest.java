package com.scsvision.gather.middleware.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.scsvision.gather.middleware.sqlserver.dao.RdDAO;
import com.scsvision.gather.middleware.sqlserver.model.Rd;

/**
 * RdDAOTest
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午10:51:58
 */
public class RdDAOTest extends BaseTest {
	@Autowired
	private RdDAO rdDAO;

	@Test
	public void testListRd() {
		List<Rd> list = rdDAO.extract();
		System.out.println(list.size());
	}
}
