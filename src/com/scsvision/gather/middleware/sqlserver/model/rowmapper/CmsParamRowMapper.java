package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.CmsParam;

/**
 * CmsParamRowMapper
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-28 上午10:57:39
 */
public class CmsParamRowMapper implements RowMapper {
	@Override
	public CmsParam mapRow(ResultSet rs, int rowNum) throws SQLException {
		CmsParam cms = new CmsParam();
		cms.setStandardNum(rs.getString("CMSID"));
		cms.setWidth(rs.getString("PixelWidth"));
		cms.setHeight(rs.getString("PixelHeight"));
		return cms;
	}
}
