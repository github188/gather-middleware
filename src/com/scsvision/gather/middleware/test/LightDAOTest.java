package com.scsvision.gather.middleware.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.scsvision.gather.middleware.sqlserver.dao.LightDAO;
import com.scsvision.gather.middleware.sqlserver.model.Light;

/**
 * LightDAOTest
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午3:06:51
 */
public class LightDAOTest extends BaseTest {
	@Autowired
	private LightDAO lightDAO;

	@Test
	public void testListLight() {
		List<Light> list = lightDAO.extract();
		System.out.println(list.size());
	}

}
