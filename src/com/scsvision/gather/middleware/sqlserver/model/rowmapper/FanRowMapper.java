package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.Fan;

/**
 * FanRowMapper
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午11:50:07
 */
public class FanRowMapper implements RowMapper {

	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	@Override
	public Fan mapRow(ResultSet rs, int rowNum) throws SQLException {
		Fan fan = new Fan();
		fan.setStandardNumber(rs.getString("DeviceID"));
		fan.setStatus(rs.getInt("iStatus"));
		fan.setFaultMessage(rs.getString("iFaultMessage"));
		fan.setAuto(rs.getBoolean("iAuto"));
		fan.setPower(rs.getBoolean("iPower"));
		fan.setCurrent(rs.getFloat("iCurrent"));
		fan.setWorkState(rs.getInt("iJetStatus"));
		fan.setSoftStartRun(rs.getBoolean("iSoftStartRun"));
		fan.setSoftStartStatus(rs.getBoolean("iSoftStartStatus"));
		fan.setSoftReStartStatus(rs.getBoolean("iSoftReStartStatus"));
		fan.setRecTime(rs.getTimestamp("ChgDate") != null ? sdf.format(rs
				.getTimestamp("ChgDate")) : "");
		return fan;
	}

}
