package com.scsvision.gather.middleware.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.scsvision.gather.middleware.sqlserver.dao.LiDAO;
import com.scsvision.gather.middleware.sqlserver.model.Loli;

/**
 * LiDAOTest
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午12:06:04
 */
public class LiDAOTest extends BaseTest {
	@Autowired
	private LiDAO liDAO;

	@Test
	public void listLi() {
		List<Loli> devices = liDAO.extract();
		System.out.println(devices.size());
	}
}
