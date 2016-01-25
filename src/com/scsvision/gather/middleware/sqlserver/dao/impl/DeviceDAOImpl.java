package com.scsvision.gather.middleware.sqlserver.dao.impl;

import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.DeviceDAO;
import com.scsvision.gather.middleware.sqlserver.dao.SqlFactory;
import com.scsvision.gather.middleware.sqlserver.model.Device;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.DeviceRowMapper;

/**
 * DeviceDAOImpl
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-22 下午2:28:37
 */
@Repository
public class DeviceDAOImpl implements DeviceDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Device> listDevice(String organId) {
		List<Device> devices = jdbcTemplate.query(SqlFactory.getInstance()
				.listDevice(), new String[] { organId },
				new int[] { Types.VARCHAR }, new DeviceRowMapper());
		return devices;
	}

}
