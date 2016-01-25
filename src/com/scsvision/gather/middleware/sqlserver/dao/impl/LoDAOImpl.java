package com.scsvision.gather.middleware.sqlserver.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.LoDAO;
import com.scsvision.gather.middleware.sqlserver.dao.SqlFactory;
import com.scsvision.gather.middleware.sqlserver.model.Loli;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.LoRowMapper;

/**
 * LoDAOImpl
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午11:55:05
 */
@Repository
public class LoDAOImpl implements LoDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Loli> extract() {
		List<Loli> list = jdbcTemplate.query(SqlFactory.getInstance().listLo(),
				new LoRowMapper());
		return list;
	}
}
