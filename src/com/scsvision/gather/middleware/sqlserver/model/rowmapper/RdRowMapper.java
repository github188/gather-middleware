package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.Rd;

/**
 * RdRowMapper
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午10:45:50
 */
public class RdRowMapper implements RowMapper {

	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	@Override
	public Rd mapRow(ResultSet rs, int rowNum) throws SQLException {
		Rd rd = new Rd();
		rd.setStandardNumber(rs.getString("DeviceID"));
		rd.setStatus(rs.getInt("iStatus"));
		rd.setFaultMessage(rs.getString("iFaultMessage"));
		rd.setAuto(rs.getBoolean("iAuto"));
		rd.setWorkState(rs.getInt("iHTStatus"));
		rd.setRecTime(rs.getTimestamp("ChgDate") != null ? sdf.format(rs
				.getTimestamp("ChgDate")) : "");
		return rd;
	}

}
