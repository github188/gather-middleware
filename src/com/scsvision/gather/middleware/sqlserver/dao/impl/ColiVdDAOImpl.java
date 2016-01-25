package com.scsvision.gather.middleware.sqlserver.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.ColiVdDAO;
import com.scsvision.gather.middleware.sqlserver.dao.SqlFactory;
import com.scsvision.gather.middleware.sqlserver.model.VehicleDetector;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.ColiVehicleDetectorRowMapper;

/**
 * ColiVdDAOImpl
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午5:17:17
 */
@Repository
public class ColiVdDAOImpl implements ColiVdDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<VehicleDetector> extract() {
		List<VehicleDetector> list = jdbcTemplate
				.query(SqlFactory.getInstance().listColiVd(),
						new ColiVehicleDetectorRowMapper());
		return list;
	}

}
