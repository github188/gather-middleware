/**
 * 
 */
package com.scsvision.gather.middleware.sqlserver.dao.ymjimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.VehicleDetectorDAO;
import com.scsvision.gather.middleware.sqlserver.model.VehicleDetector;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.VehicleDetectorRowMapper;

/**
 * @author znsx
 *
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
