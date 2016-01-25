package com.scsvision.gather.middleware.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.scsvision.gather.middleware.sqlserver.dao.PushButtonDAO;
import com.scsvision.gather.middleware.sqlserver.model.PushButton;

/**
 * PushButtonDAOTest
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午4:36:53
 */
public class PushButtonDAOTest extends BaseTest {
	@Autowired
	private PushButtonDAO pushButtonDAO;

	@Test
	public void testListPb() {
		List<PushButton> list = pushButtonDAO.extract();
		System.out.println(list.size());
	}
}
