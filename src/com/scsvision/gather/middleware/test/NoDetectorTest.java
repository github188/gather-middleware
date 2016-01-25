package com.scsvision.gather.middleware.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.scsvision.gather.middleware.sqlserver.dao.NoDetectorDAO;
import com.scsvision.gather.middleware.sqlserver.model.NoDetector;

/**
 * NoDetectorTest
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午10:50:11
 */
public class NoDetectorTest extends BaseTest {
	@Autowired
	private NoDetectorDAO noDetectorDAO;

	@Test
	public void testListNo() {
		List<NoDetector> list = noDetectorDAO.extract();
		System.out.println(list.size());
	}
}
