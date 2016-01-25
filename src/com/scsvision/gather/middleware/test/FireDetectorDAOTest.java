package com.scsvision.gather.middleware.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.scsvision.gather.middleware.sqlserver.dao.FireDetectorDAO;
import com.scsvision.gather.middleware.sqlserver.model.FireDetector;

/**
 * FireDetectorDAOTest
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午2:23:15
 */
public class FireDetectorDAOTest extends BaseTest {
	@Autowired
	private FireDetectorDAO fireDetectorDAO;

	@Test
	public void testListFD() {
		List<FireDetector> list = fireDetectorDAO.extract();
		System.out.println(list.size());
	}
}
