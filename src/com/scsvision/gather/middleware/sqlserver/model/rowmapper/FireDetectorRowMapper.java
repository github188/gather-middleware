package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.FireDetector;

/**
 * FireDetectorRowMapper
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午2:14:28
 */
public class FireDetectorRowMapper implements RowMapper {

	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	@Override
	public FireDetector mapRow(ResultSet rs, int rowNum) throws SQLException {
		FireDetector fd = new FireDetector();
		fd.setStandardNumber(rs.getString("DeviceID"));
		fd.setStatus(rs.getInt("iStatus"));
		fd.setFaultMessage(rs.getString("iFaultMessage"));
		fd.setRecTime(rs.getTimestamp("ChgDate") != null ? sdf.format(rs
				.getTimestamp("ChgDate")) : "");
		fd.setCdStatus(rs.getInt("iCDStatus"));
		fd.setTemperature(rs.getFloat("iTemperature"));
		return fd;
	}

}
