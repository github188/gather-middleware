package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.Lil;

/**
 * LilRowMapper
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午5:20:40
 */
public class LilRowMapper implements RowMapper {

	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	@Override
	public Lil mapRow(ResultSet rs, int rowNum) throws SQLException {
		Lil lil = new Lil();
		lil.setStandardNumber(rs.getString("DeviceID"));
		lil.setStatus(rs.getInt("iStatus"));
		lil.setFaultMessage(rs.getString("iFaultMessage"));
		lil.setBackArrowStatus(rs.getBoolean("iBackArrowStatus"));
		lil.setBackXStatus(rs.getBoolean("iBackXStatus"));
		lil.setFrontArrowStatus(rs.getBoolean("iFrontArrowStatus"));
		lil.setFrontXStatus(rs.getBoolean("iFrontXStatus"));
		lil.setRecTime(rs.getTimestamp("ChgDate") != null ? sdf.format(rs
				.getTimestamp("ChgDate")) : "");
		return lil;
	}

}
