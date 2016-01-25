package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.Organ;
import com.scsvision.util.file.Configuration;

/**
 * OrganRoadRowMapper
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-22 下午4:53:26
 */
public class OrganRoadRowMapper implements RowMapper {
	@Override
	public Organ mapRow(ResultSet rs, int rowNum) throws SQLException {
		Organ root = new Organ();
		root.setId(rs.getString("RoadID"));
		root.setName(rs.getString("RoadName"));
		root.setSn(Configuration.getInstance().getProperties("parent_code"));
		root.setParent(null);
		return root;
	}
}
