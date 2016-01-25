package com.scsvision.gather.middleware.sqlserver.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.PushButtonDAO;
import com.scsvision.gather.middleware.sqlserver.dao.SqlFactory;
import com.scsvision.gather.middleware.sqlserver.model.Lil;
import com.scsvision.gather.middleware.sqlserver.model.PushButton;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.LilRowMapper;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.PushButtonRowMapper;

/**
 * PushButtonDAOImpl
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午4:25:12
 */
@Repository
public class PushButtonDAOImpl implements PushButtonDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<PushButton> extract() {
		List<PushButton> pbs = jdbcTemplate.query(SqlFactory.getInstance()
				.listPb(), new PushButtonRowMapper());
		return pbs;
	}

}
