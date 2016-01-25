package com.scsvision.gather.middleware.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.scsvision.gather.middleware.sqlserver.dao.WeatherStatDAO;
import com.scsvision.gather.middleware.sqlserver.model.WeatherStat;

/**
 * WeatherStatDAOTest
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午10:05:54
 */
public class WeatherStatDAOTest extends BaseTest {
	@Autowired
	private WeatherStatDAO weatherStatDAO;

	@Test
	public void testListWst() {
		List<WeatherStat> list = weatherStatDAO.extract();
		System.out.println(list.size());
	}
}
