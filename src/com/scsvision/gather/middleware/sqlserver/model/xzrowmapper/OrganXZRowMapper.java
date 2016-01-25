/**
 * 
 */
package com.scsvision.gather.middleware.sqlserver.model.xzrowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.Organ;
import com.scsvision.util.file.Configuration;

/**
 * @author znsx
 * 
 */
public class OrganXZRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Organ organ = new Organ();
		organ.setId(rs.getString("StationNo"));
		organ.setSn(rs.getString("StationNo") + rs.getInt("RoadCode"));
		organ.setName(rs.getString("StationName"));
		organ.setParent(Configuration.getInstance()
				.getProperties("parent_code"));
		return organ;
	}

}
