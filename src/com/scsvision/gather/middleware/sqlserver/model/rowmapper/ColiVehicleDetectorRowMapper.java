package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.VehicleDetector;

/**
 * ColiVehicleDetectorRowMapper
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午5:09:00
 */
public class ColiVehicleDetectorRowMapper implements RowMapper {

	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	@Override
	public VehicleDetector mapRow(ResultSet rs, int rowNum) throws SQLException {
		VehicleDetector vd = new VehicleDetector();
		vd.setStandardNumber(rs.getString("DeviceID"));
		vd.setStatus(rs.getInt("iStatus"));
		vd.setFaultMessage(rs.getString("iFaultMessage"));
		vd.setUpFlux(rs.getInt("Flow") + "");// 车流量 不分上下行
		vd.setUpOcc(rs.getFloat("Occupancy") + "");// 占有率
		vd.setUpSpeed((int)rs.getFloat("Speed") + "");// 车速
		vd.setRecTime(rs.getTimestamp("ChgDate") != null ? sdf.format(rs
				.getTimestamp("ChgDate")) : "");
		return vd;
	}

}
