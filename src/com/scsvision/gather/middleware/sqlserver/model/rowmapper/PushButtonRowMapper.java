package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.PushButton;

/**
 * PushButtonRowMapper
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午4:21:01
 */
public class PushButtonRowMapper implements RowMapper {

	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	@Override
	public PushButton mapRow(ResultSet rs, int rowNum) throws SQLException {
		PushButton pb = new PushButton();
		pb.setStandardNumber(rs.getString("DeviceID"));
		pb.setStatus(rs.getInt("iStatus"));
		pb.setFaultMessage(rs.getString("iFaultMessage"));
		pb.setWorkState(rs.getString("iFBStatus"));
		pb.setRecTime(rs.getTimestamp("ChgDate") != null ? sdf.format(rs
				.getTimestamp("ChgDate")) : "");
		return pb;
	}

}
