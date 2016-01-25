package com.scsvision.gather.middleware.sqlserver.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.SqlFactory;
import com.scsvision.gather.middleware.sqlserver.dao.VehicleDetectorDAO;
import com.scsvision.gather.middleware.sqlserver.model.VehicleDetector;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.VehicleDetectorRowMapper;

/**
 * VehicleDetectorDAOImpl
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-10 下午4:47:48
 */
@Repository
public class VehicleDetectorDAOImpl implements VehicleDetectorDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<VehicleDetector> extract() {
		List<VehicleDetector> list = jdbcTemplate.query(SqlFactory
				.getInstance().listVd(), new VehicleDetectorRowMapper());
		return list;
	}
}
