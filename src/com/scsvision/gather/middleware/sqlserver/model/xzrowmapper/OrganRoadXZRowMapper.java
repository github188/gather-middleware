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
public class OrganRoadXZRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Organ root = new Organ();
		root.setId(rs.getInt("Road_Code") + "");
		root.setName(rs.getString("Road_Name"));
		root.setSn(Configuration.getInstance().getProperties("parent_code"));
		root.setParent(null);
		return root;
	}

}
