package com.scsvision.gather.middleware.sqlserver.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.LilDAO;
import com.scsvision.gather.middleware.sqlserver.dao.SqlFactory;
import com.scsvision.gather.middleware.sqlserver.model.Lil;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.LilRowMapper;

/**
 * LilDAOImpl
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午5:09:50
 */
@Repository
public class LilDAOImpl implements LilDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Lil> extract() {
		List<Lil> lils = jdbcTemplate.query(SqlFactory.getInstance().listLil(),
				new LilRowMapper());
		return lils;
	}
}
