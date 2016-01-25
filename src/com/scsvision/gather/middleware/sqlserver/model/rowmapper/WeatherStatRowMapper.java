package com.scsvision.gather.middleware.sqlserver.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.WeatherStat;

/**
 * WeatherStatRowMapper
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午3:45:02
 */
public class WeatherStatRowMapper implements RowMapper {

	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	@Override
	public WeatherStat mapRow(ResultSet rs, int rowNum) throws SQLException {
		WeatherStat wst = new WeatherStat();
		wst.setStandardNumber(rs.getString("DeviceID"));
		wst.setStatus(rs.getInt("iStatus"));
		wst.setFaultMessage(rs.getString("iFaultMessage"));
		float vis = rs.getFloat("VM_N1");
		wst.setVisAvg(Math.round(vis) + "");// 当前能见度
		wst.setRoadTempMax(rs.getFloat("GS_N1") + "");// 表面温度1
		wst.setRoadTempMin(rs.getFloat("GS_N2") + "");// 表面温度2
		wst.setRoadTempAvg(rs.getFloat("GS_N3") + "");// 内部温度
		wst.setSaltConcentration(rs.getFloat("GS_N4") + "");// 盐浓度
		wst.setIceTemperature(rs.getInt("GS_N5") + "");// 冰点温度
		wst.setMist(rs.getInt("GS_N6") + "");// 水雾
		wst.setRoadState(rs.getInt("GS_N7") + "");// 路面状态
		wst.setCommStatus(rs.getInt("GS_N8") + "");// 设备状况反馈
		wst.setRainVol(rs.getFloat("RS_N") + "");// 降雨量
		wst.setWindSpeedAvg(rs.getFloat("WS_N1") + "");// 风速值
		float windDir = rs.getFloat("WS_N2");
		wst.setWindDir(Math.round(windDir) + "");// 风向值
		wst.setAirTempAvg(rs.getFloat("TS_N1") + "");// 温度值
		float humi = rs.getFloat("TS_N2");
		wst.setHumiAvg(Math.round(humi) + "");// 湿度值
		wst.setRecTime(rs.getTimestamp("ChgDate") != null ? sdf.format(rs
				.getTimestamp("ChgDate")) : "");
		return wst;
	}
}
