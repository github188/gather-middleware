package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.Wp;

/**
 * WpRowMapper
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午5:19:52
 */
public class WpRowMapper implements RowMapper {

	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	@Override
	public Wp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Wp wp = new Wp();
		wp.setStandardNumber(rs.getString("DeviceID"));
		wp.setStatus(rs.getInt("iStatus"));
		wp.setFaultMessage(rs.getString("iFaultMessage"));
		wp.setPumpAuto(rs.getBoolean("iPumpAuto"));
		boolean pumpStatus = rs.getBoolean("iPumpStatus");
		wp.setWorkState(pumpStatus ? "1" : "0");
		wp.setRecTime(rs.getTimestamp("ChgDate") != null ? sdf.format(rs
				.getTimestamp("ChgDate")) : "");
		return wp;
	}

}
