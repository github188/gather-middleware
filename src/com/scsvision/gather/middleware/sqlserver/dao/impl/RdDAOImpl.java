package com.scsvision.gather.middleware.sqlserver.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.RdDAO;
import com.scsvision.gather.middleware.sqlserver.dao.SqlFactory;
import com.scsvision.gather.middleware.sqlserver.model.Rd;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.RdRowMapper;

/**
 * RdDAOImpl
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午10:49:08
 */
@Repository
public class RdDAOImpl implements RdDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Rd> extract() {
		List<Rd> rds = jdbcTemplate.query(SqlFactory.getInstance().listRd(),
				new RdRowMapper());
		return rds;
	}

}
