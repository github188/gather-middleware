package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.NoDetector;

/**
 * NoDetectorRowMapper
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午10:35:01
 */
public class NoDetectorRowMapper implements RowMapper {

	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	@Override
	public NoDetector mapRow(ResultSet rs, int rowNum) throws SQLException {
		NoDetector no = new NoDetector();
		no.setStandardNumber(rs.getString("DeviceID"));
		no.setStatus(rs.getInt("iStatus"));
		no.setFaultMessage(rs.getString("iFaultMessage"));
		no.setNOConct(rs.getFloat("iLuxValue"));
		no.setRecTime(rs.getTimestamp("ChgDate") != null ? sdf.format(rs
				.getTimestamp("ChgDate")) : "");
		return no;
	}

}
