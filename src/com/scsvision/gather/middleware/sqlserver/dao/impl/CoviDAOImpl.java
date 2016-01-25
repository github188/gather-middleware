package com.scsvision.gather.middleware.sqlserver.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.CoviDAO;
import com.scsvision.gather.middleware.sqlserver.dao.SqlFactory;
import com.scsvision.gather.middleware.sqlserver.model.Cms;
import com.scsvision.gather.middleware.sqlserver.model.Covi;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.CmsRowMapper;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.CoviRowMapper;

/**
 * CoviDAOImpl
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午2:19:31
 */
@Repository
public class CoviDAOImpl implements CoviDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Covi> extract() {
		List<Covi> covis = jdbcTemplate.query(SqlFactory.getInstance()
				.listCovi(), new CoviRowMapper());
		return covis;
	}

}
