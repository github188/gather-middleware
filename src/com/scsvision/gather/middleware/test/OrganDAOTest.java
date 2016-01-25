/**
 * 
 */
package com.scsvision.gather.middleware.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.scsvision.gather.middleware.sqlserver.dao.OrganDAO;
import com.scsvision.gather.middleware.sqlserver.model.Organ;

/**
 * @author znsx
 * 
 */
public class OrganDAOTest extends BaseTest {
	@Autowired
	private OrganDAO organDAO;

	@Test
	public void testGetParent() {
		Organ organ = organDAO.getParent();
		System.out.println(organ);
	}

	@Test
	public void testListOrgan() {
		List<Organ> list = organDAO.listOrgan();
		System.out.println(list.size());
	}
}
