package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.Covi;

/**
 * CoviRowMapper
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午2:15:15
 */
public class CoviRowMapper implements RowMapper {

	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	@Override
	public Covi mapRow(ResultSet rs, int rowNum) throws SQLException {
		Covi covi = new Covi();
		covi.setStandardNumber(rs.getString("DeviceID"));
		covi.setStatus(rs.getInt("iStatus"));
		covi.setFaultMessage(rs.getString("iFaultMessage"));
		covi.setCOConct(rs.getFloat("iCoValue") + "");
		covi.setVisibility(rs.getFloat("iViValue") + "");
		covi.setRecTime(rs.getTimestamp("ChgDate") != null ? sdf.format(rs
				.getTimestamp("ChgDate")) : "");
		return covi;
	}

}
