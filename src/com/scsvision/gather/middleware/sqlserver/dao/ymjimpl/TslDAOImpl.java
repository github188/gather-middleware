/**
 * 
 */
package com.scsvision.gather.middleware.sqlserver.dao.ymjimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.TslDAO;
import com.scsvision.gather.middleware.sqlserver.model.Tsl;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.TslRowMapper;

/**
 * @author znsx
 *
 */
@Repository
public class TslDAOImpl implements TslDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Tsl> extract() {
		List<Tsl> tsls = jdbcTemplate.query(SqlFactory.getInstance().listTsl(),
				new TslRowMapper());
		return tsls;
	}

}
