package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.Loli;

/**
 * LiRowMapper
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午12:01:55
 */
public class LiRowMapper implements RowMapper {

	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	@Override
	public Loli mapRow(ResultSet rs, int rowNum) throws SQLException {
		Loli li = new Loli();
		li.setStandardNumber(rs.getString("DeviceID"));
		li.setStatus(rs.getInt("iStatus"));
		li.setFaultMessage(rs.getString("iFaultMessage"));
		li.setLILumi(rs.getFloat("iLuxValue"));
		li.setRecTime(rs.getTimestamp("ChgDate") != null ? sdf.format(rs
				.getTimestamp("ChgDate")) : "");
		return li;
	}

}
