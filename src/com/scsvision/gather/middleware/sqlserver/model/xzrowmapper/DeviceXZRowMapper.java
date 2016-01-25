/**
 * 
 */
package com.scsvision.gather.middleware.sqlserver.model.xzrowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.Device;
import com.scsvision.gather.middleware.sqlserver.util.TypeUtil;

/**
 * @author znsx
 * 
 */
public class DeviceXZRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Device device = new Device();
		String id = rs.getString("DeviceNo");
		device.setId(id);
		device.setName(rs.getString("Device_Name"));

		int type = rs.getInt("DeviceType_Code");
		type = TypeUtil.switchXZType(type);
		device.setType(type);

		device.setAddress(0f);
		device.setStakeNumber("");

		String roadId = rs.getString("Road_Code");
		device.setRoad(switchRoad(roadId));

		device.setParent(rs.getString("DeviceNo") + rs.getString("Road_Code"));
		device.setLaneNumber(0);
		Integer navigation = rs.getInt("Direction_Code");
		device.setNavigation(switchNavigation(navigation));
		device.setCompany(rs.getString("Manufacturer_Id"));
		device.setPosition(rs.getInt("Position_ID"));
		device.setTypeName("");
		device.setInstaller("");
		return device;
	}

	private int switchNavigation(Integer navigation) {
		int navigationI = 1;
		switch (navigation) {
		case 3:
			navigationI = 1;
			break;
		case 4:
			navigationI = 2;
			break;
		default:
			navigationI = 1;
			break;
		}
		return navigationI;
	}

	private String switchRoad(String roadId) {
		if ("1".equals(roadId)) {
			return "吉怀高速";
		}
		return roadId;
	}
}
