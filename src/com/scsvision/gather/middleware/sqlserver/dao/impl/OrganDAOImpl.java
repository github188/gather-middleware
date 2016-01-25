package com.scsvision.gather.middleware.sqlserver.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.OrganDAO;
import com.scsvision.gather.middleware.sqlserver.dao.SqlFactory;
import com.scsvision.gather.middleware.sqlserver.model.Organ;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.OrganRoadRowMapper;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.OrganRowMapper;

/**
 * OrganDAOImpl
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-22 下午4:23:39
 */
@Repository
public class OrganDAOImpl implements OrganDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Organ> listOrgan() {
		List<Organ> organs = jdbcTemplate.query(SqlFactory.getInstance()
				.listStation(), new OrganRowMapper());
		return organs;
	}

	@Override
	public Organ getParent() {
		return (Organ) jdbcTemplate.queryForObject(SqlFactory.getInstance()
				.getParent(), new OrganRoadRowMapper());
	}

}
