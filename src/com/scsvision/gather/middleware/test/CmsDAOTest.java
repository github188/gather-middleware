package com.scsvision.gather.middleware.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.scsvision.gather.middleware.sqlserver.dao.CmsDAO;
import com.scsvision.gather.middleware.sqlserver.model.Cms;
import com.scsvision.gather.middleware.sqlserver.model.CmsParam;

/**
 * CmsDAOTest
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午2:06:31
 */
public class CmsDAOTest extends BaseTest {
	@Autowired
	private CmsDAO cmsDAO;

	@Test
	public void testListCms() {
		List<Cms> list = cmsDAO.extract();
		System.out.println(list.size());
	}

	@Test
	public void testListCms1() {
		List<CmsParam> list = cmsDAO.listCmsParam();
		System.out.print(list.size());
	}
}
