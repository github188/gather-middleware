package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.Device;
import com.scsvision.gather.middleware.sqlserver.util.TypeUtil;

/**
 * DeviceRowMapper
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-22 下午2:32:34
 */
public class DeviceRowMapper implements RowMapper {

	@Override
	public Device mapRow(ResultSet rs, int rowNum) throws SQLException {
		Device device = new Device();
		String id = rs.getString("DeviceID");
		device.setId(id);
		device.setName(rs.getString("DeviceName"));

		int type = rs.getInt("DevTypeID");
		type = TypeUtil.switchType(type);
		// 氮氧和光强分开处理
		if (TypeUtil.DEVICE_TYPE_LOLI == type) {
			if (id.indexOf("NO") > 0) {
				type = TypeUtil.DEVICE_TYPE_NOD;
			}
		}
		device.setType(type);

		device.setAddress(rs.getFloat("DecAddress"));
		device.setStakeNumber(rs.getString("CharAddress"));

		String roadId = rs.getString("RoadID");
		device.setRoad(switchRoad(roadId));

		device.setParent(rs.getString("RoadID") + rs.getString("StationID"));
		device.setLaneNumber(rs.getInt("LaneAttributeID"));
		device.setNavigation(rs.getInt("DirectionID"));
		device.setCompany(rs.getString("CompanyID"));
		device.setPosition(rs.getInt("PositionID"));
		device.setTypeName(rs.getString("DeviceDesc"));
		device.setInstaller(rs.getString("Installer"));
		return device;
	}

	private String switchRoad(String roadId) {
		if ("010".equals(roadId)) {
			return "矮寨隧道管理所";
		} else if ("0202".equals(roadId)) {
			return "岩门界桥隧管理所";
		} else if ("0203".equals(roadId)) {
			return "吉首监控管理所";
		}
		return roadId;
	}
}
