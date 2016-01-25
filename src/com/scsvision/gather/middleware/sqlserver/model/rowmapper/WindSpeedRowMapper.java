package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.WindSpeed;

/**
 * WindSpeedRowMapper
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午2:31:45
 */
public class WindSpeedRowMapper implements RowMapper {

	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	@Override
	public WindSpeed mapRow(ResultSet rs, int rowNum) throws SQLException {
		WindSpeed ws = new WindSpeed();
		ws.setStandardNumber(rs.getString("DeviceID"));
		ws.setStatus(rs.getInt("iStatus"));
		ws.setFaultMessage(rs.getString("iFaultMessage"));
		ws.setDirection(rs.getBoolean("iWindOrien") == true ? "1" : "2");
		float speed = rs.getFloat("iWindSpeed");
		ws.setSpeed(Math.round(speed) + "");
		ws.setRecTime(rs.getTimestamp("ChgDate") != null ? sdf.format(rs
				.getTimestamp("ChgDate")) : "");
		return ws;
	}

}
