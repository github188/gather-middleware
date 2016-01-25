package com.scsvision.gather.middleware.sqlserver.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.SqlFactory;
import com.scsvision.gather.middleware.sqlserver.dao.TslDAO;
import com.scsvision.gather.middleware.sqlserver.model.Tsl;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.TslRowMapper;

/**
 * TslDAOImpl
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午10:31:12
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
