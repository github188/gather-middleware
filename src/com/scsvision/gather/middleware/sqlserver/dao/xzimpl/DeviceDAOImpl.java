/**
 * 
 */
package com.scsvision.gather.middleware.sqlserver.dao.xzimpl;

import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.DeviceDAO;
import com.scsvision.gather.middleware.sqlserver.model.Device;
import com.scsvision.gather.middleware.sqlserver.model.xzrowmapper.DeviceXZRowMapper;

/**
 * @author znsx
 * 
 */
@Repository
public class DeviceDAOImpl implements DeviceDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Device> listDevice(String organId) {
		List<Device> devices = jdbcTemplate.query(SqlXZFactory.getInstance()
				.listDevice(), new String[] { organId },
				new int[] { Types.VARCHAR }, new DeviceXZRowMapper());
		return devices;
	}
}
