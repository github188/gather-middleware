package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.Tsl;

/**
 * TslRowMapper
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午10:25:19
 */
public class TslRowMapper implements RowMapper {

	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	@Override
	public Tsl mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tsl tsl = new Tsl();
		tsl.setStandardNumber(rs.getString("DeviceID"));
		tsl.setStatus(rs.getInt("iStatus"));
		tsl.setFaultMessage(rs.getString("iFaultMessage"));
		tsl.setGreenStatus(rs.getBoolean("iGreenStatus"));
		tsl.setRedStatus(rs.getBoolean("iRedStatus"));
		tsl.setYellowStatus(rs.getBoolean("iYellowStatus"));
		tsl.setTurnStatus(rs.getBoolean("iTurnStatus"));
		tsl.setRecTime(rs.getTimestamp("ChgDate") != null ? sdf.format(rs
				.getTimestamp("ChgDate")) : "");
		return tsl;
	}

}
