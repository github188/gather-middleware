package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.Organ;
import com.scsvision.util.file.Configuration;

/**
 * OrganRowMapper
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-22 下午4:26:01
 */
public class OrganRowMapper implements RowMapper {

	@Override
	public Organ mapRow(ResultSet rs, int rowNum) throws SQLException {
		Organ organ = new Organ();
		organ.setId(rs.getString("StationID"));
		organ.setSn(rs.getString("RoadID") + rs.getString("StationID"));
		organ.setName(rs.getString("StationName"));
		organ.setParent(Configuration.getInstance()
				.getProperties("parent_code"));
		return organ;
	}

}
