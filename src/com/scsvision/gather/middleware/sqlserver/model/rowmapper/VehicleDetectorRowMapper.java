package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.VehicleDetector;

/**
 * VehicleDetectorRowMapper
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-18 上午11:48:45
 */
public class VehicleDetectorRowMapper implements RowMapper {

	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	@Override
	public VehicleDetector mapRow(ResultSet rs, int rowNum) throws SQLException {
		VehicleDetector vd = new VehicleDetector();
		vd.setStandardNumber(rs.getString("DeviceID"));
		vd.setStatus(rs.getInt("iStatus"));
		vd.setFaultMessage(rs.getString("iFaultMessage"));
		vd.setDwFlux(rs.getInt("DownFlow") + "");
		vd.setDwSpeed(rs.getInt("DownSpeed") + "");
		vd.setDwOcc(rs.getFloat("DownOccupancy") + "");
		vd.setUpFlux(rs.getInt("UpFlow") + "");
		vd.setUpOcc(rs.getFloat("UpOccupancy") + "");
		vd.setUpSpeed(rs.getInt("UpSpeed") + "");
		vd.setUpHeadWay(rs.getFloat("UpHeadWay") + "");
		vd.setDwHeadWay(rs.getFloat("DownHeadWay") + "");
		vd.setRecTime(rs.getTimestamp("ChgDate") != null ? sdf.format(rs
				.getTimestamp("ChgDate")) : "");
		return vd;
	}
}
