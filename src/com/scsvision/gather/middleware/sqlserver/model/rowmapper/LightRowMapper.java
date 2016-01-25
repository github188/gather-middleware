package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.Light;

/**
 * LightRowMapper
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午3:00:01
 */
public class LightRowMapper implements RowMapper {

	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	@Override
	public Light mapRow(ResultSet rs, int rowNum) throws SQLException {
		Light light = new Light();
		light.setStandardNumber(rs.getString("DeviceID"));
		light.setStatus(rs.getInt("iStatus"));
		light.setFaultMessage(rs.getString("iFaultMessage"));
		boolean lightStatus = rs.getBoolean("iLightStatus");
		light.setWorkState(lightStatus ? "1" : "0");
		light.setCurrent(rs.getFloat("iCurrent"));
		light.setAuto(rs.getBoolean("iAuto"));
		light.setPower(rs.getBoolean("iPower"));
		light.setRecTime(rs.getTimestamp("ChgDate") != null ? sdf.format(rs
				.getTimestamp("ChgDate")) : "");
		return light;
	}

}
