package com.scsvision.gather.middleware.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.scsvision.gather.middleware.sqlserver.dao.CoviDAO;
import com.scsvision.gather.middleware.sqlserver.model.Covi;

/**
 * CoviDAOTest
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午2:21:24
 */
public class CoviDAOTest extends BaseTest {
	@Autowired
	private CoviDAO coviDAO;

	@Test
	public void testListCovi() {
		List<Covi> list = coviDAO.extract();
		System.out.println(list.size());
	}
}
