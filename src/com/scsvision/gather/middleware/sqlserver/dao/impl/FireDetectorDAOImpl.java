package com.scsvision.gather.middleware.sqlserver.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.FireDetectorDAO;
import com.scsvision.gather.middleware.sqlserver.dao.SqlFactory;
import com.scsvision.gather.middleware.sqlserver.model.FireDetector;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.FireDetectorRowMapper;

/**
 * FireDetectorDAOImpl
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午2:19:35
 */
@Repository
public class FireDetectorDAOImpl implements FireDetectorDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<FireDetector> extract() {
		List<FireDetector> list = jdbcTemplate.query(SqlFactory.getInstance()
				.listFD(), new FireDetectorRowMapper());
		return list;
	}

}
