/**
 * 
 */
package com.scsvision.gather.middleware.sqlserver.dao.ymjimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.ColiVdDAO;
import com.scsvision.gather.middleware.sqlserver.model.VehicleDetector;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.ColiVehicleDetectorRowMapper;

/**
 * @author znsx
 *
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
