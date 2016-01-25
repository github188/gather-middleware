package com.scsvision.gather.middleware.sqlserver.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.SqlFactory;
import com.scsvision.gather.middleware.sqlserver.dao.WpDAO;
import com.scsvision.gather.middleware.sqlserver.model.Lil;
import com.scsvision.gather.middleware.sqlserver.model.Wp;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.LilRowMapper;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.WpRowMapper;

/**
 * WpDAOImpl
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午5:24:03
 */
@Repository
public class WpDAOImpl implements WpDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Wp> extract() {
		List<Wp> wps = jdbcTemplate.query(SqlFactory.getInstance().listWp(),
				new WpRowMapper());
		return wps;
	}

}
