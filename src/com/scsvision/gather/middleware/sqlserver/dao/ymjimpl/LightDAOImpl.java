/**
 * 
 */
package com.scsvision.gather.middleware.sqlserver.dao.ymjimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.LightDAO;
import com.scsvision.gather.middleware.sqlserver.model.Light;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.LightRowMapper;

/**
 * @author znsx
 *
 */
@Repository
public class LightDAOImpl implements LightDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Light> extract() {
		List<Light> lights = jdbcTemplate.query(SqlFactory.getInstance()
				.listLight(), new LightRowMapper());
		return lights;
	}

}
