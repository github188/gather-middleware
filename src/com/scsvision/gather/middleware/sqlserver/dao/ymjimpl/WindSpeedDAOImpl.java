/**
 * 
 */
package com.scsvision.gather.middleware.sqlserver.dao.ymjimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.WindSpeedDAO;
import com.scsvision.gather.middleware.sqlserver.model.WindSpeed;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.WindSpeedRowMapper;

/**
 * @author znsx
 *
 */
@Repository
public class WindSpeedDAOImpl implements WindSpeedDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<WindSpeed> extract() {
		List<WindSpeed> wss = jdbcTemplate.query(SqlFactory.getInstance()
				.listWs(), new WindSpeedRowMapper());
		return wss;
	}

}
