/**
 * 
 */
package com.scsvision.gather.middleware.sqlserver.dao.xzimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.OrganDAO;
import com.scsvision.gather.middleware.sqlserver.dao.SqlFactory;
import com.scsvision.gather.middleware.sqlserver.model.Organ;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.OrganRoadRowMapper;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.OrganRowMapper;
import com.scsvision.gather.middleware.sqlserver.model.xzrowmapper.OrganRoadXZRowMapper;
import com.scsvision.gather.middleware.sqlserver.model.xzrowmapper.OrganXZRowMapper;

/**
 * @author znsx
 * 
 */
@Repository
public class OrganDAOImpl implements OrganDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Organ> listOrgan() {
		List<Organ> organs = jdbcTemplate.query(SqlXZFactory.getInstance()
				.listStation(), new OrganXZRowMapper());
		return organs;
	}

	@Override
	public Organ getParent() {
		return (Organ) jdbcTemplate.queryForObject(SqlXZFactory.getInstance()
				.getParent(), new OrganRoadXZRowMapper());
	}

}
