package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.Loli;

/**
 * LoRowMapper
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午11:52:45
 */
public class LoRowMapper implements RowMapper {

	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	@Override
	public Loli mapRow(ResultSet rs, int rowNum) throws SQLException {
		Loli lo = new Loli();
		lo.setStandardNumber(rs.getString("DeviceID"));
		lo.setStatus(rs.getInt("iStatus"));
		lo.setFaultMessage(rs.getString("iFaultMessage"));
		lo.setLOLumi(rs.getFloat("iLuxValue"));
		lo.setRecTime(rs.getTimestamp("ChgDate") != null ? sdf.format(rs
				.getTimestamp("ChgDate")) : "");
		return lo;
	}
}
