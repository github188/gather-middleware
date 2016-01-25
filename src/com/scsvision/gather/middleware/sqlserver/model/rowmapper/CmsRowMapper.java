package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.Cms;

/**
 * CmsRowMapper
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午2:01:03
 */
public class CmsRowMapper implements RowMapper {

	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	@Override
	public Cms mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cms cms = new Cms();
		cms.setStandardNumber(rs.getString("DeviceID"));
		cms.setStatus(rs.getInt("iStatus"));
		cms.setFaultMessage(rs.getString("iFaultMessage"));
		cms.setDispText(rs.getString("PlayItemText"));
		cms.setRecTime(rs.getTimestamp("ChgDate") != null ? sdf.format(rs
				.getTimestamp("ChgDate")) : sdf.format(new Timestamp(System
				.currentTimeMillis())));
		cms.setFontName(rs.getString("FontName"));
		cms.setSize(rs.getInt("FontSize"));
		cms.setDispTime(rs.getInt("Stay") + "");
		cms.setColor(rs.getInt("ForeColor"));
		return cms;
	}
}
