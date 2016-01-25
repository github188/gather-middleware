package com.scsvision.gather.middleware.sqlserver.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 气象检测器
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午11:21:27
 */
public class WeatherStat implements Serializable {

	private static final long serialVersionUID = 3750777746774666747L;

	private String standardNumber;
	private int status;
	private String faultMessage;
	private String visMax;
	private String visMin;
	private String visAvg;
	private String windSpeedMax;
	private String windSpeedMin;
	private String windSpeedAvg;
	private String windDir;
	private String airTempMax;
	private String airTempMin;
	private String airTempAvg;
	private String roadTempMax;
	private String roadTempMin;
	private String roadTempAvg;
	private String humiMax;
	private String humiMin;
	private String humiAvg;
	private String rainVol;
	private String snowVol;
	private String roadState;
	private String saltConcentration;
	private String mist;
	private String iceTemperature;
	private String commStatus;
	private String recTime;

	public String getStandardNumber() {
		return standardNumber;
	}

	public void setStandardNumber(String standardNumber) {
		this.standardNumber = standardNumber;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getFaultMessage() {
		return faultMessage;
	}

	public void setFaultMessage(String faultMessage) {
		this.faultMessage = faultMessage;
	}

	public String getVisMax() {
		return visMax;
	}

	public void setVisMax(String visMax) {
		this.visMax = visMax;
	}

	public String getVisMin() {
		return visMin;
	}

	public void setVisMin(String visMin) {
		this.visMin = visMin;
	}

	public String getVisAvg() {
		return visAvg;
	}

	public void setVisAvg(String visAvg) {
		this.visAvg = visAvg;
	}

	public String getWindSpeedMax() {
		return windSpeedMax;
	}

	public void setWindSpeedMax(String windSpeedMax) {
		this.windSpeedMax = windSpeedMax;
	}

	public String getWindSpeedMin() {
		return windSpeedMin;
	}

	public void setWindSpeedMin(String windSpeedMin) {
		this.windSpeedMin = windSpeedMin;
	}

	public String getWindSpeedAvg() {
		return windSpeedAvg;
	}

	public void setWindSpeedAvg(String windSpeedAvg) {
		this.windSpeedAvg = windSpeedAvg;
	}

	public String getWindDir() {
		return windDir;
	}

	public void setWindDir(String windDir) {
		this.windDir = windDir;
	}

	public String getAirTempMax() {
		return airTempMax;
	}

	public void setAirTempMax(String airTempMax) {
		this.airTempMax = airTempMax;
	}

	public String getAirTempMin() {
		return airTempMin;
	}

	public void setAirTempMin(String airTempMin) {
		this.airTempMin = airTempMin;
	}

	public String getAirTempAvg() {
		return airTempAvg;
	}

	public void setAirTempAvg(String airTempAvg) {
		this.airTempAvg = airTempAvg;
	}

	public String getRoadTempMax() {
		return roadTempMax;
	}

	public void setRoadTempMax(String roadTempMax) {
		this.roadTempMax = roadTempMax;
	}

	public String getRoadTempMin() {
		return roadTempMin;
	}

	public void setRoadTempMin(String roadTempMin) {
		this.roadTempMin = roadTempMin;
	}

	public String getRoadTempAvg() {
		return roadTempAvg;
	}

	public void setRoadTempAvg(String roadTempAvg) {
		this.roadTempAvg = roadTempAvg;
	}

	public String getHumiMax() {
		return humiMax;
	}

	public void setHumiMax(String humiMax) {
		this.humiMax = humiMax;
	}

	public String getHumiMin() {
		return humiMin;
	}

	public void setHumiMin(String humiMin) {
		this.humiMin = humiMin;
	}

	public String getHumiAvg() {
		return humiAvg;
	}

	public void setHumiAvg(String humiAvg) {
		this.humiAvg = humiAvg;
	}

	public String getRainVol() {
		return rainVol;
	}

	public void setRainVol(String rainVol) {
		this.rainVol = rainVol;
	}

	public String getSnowVol() {
		return snowVol;
	}

	public void setSnowVol(String snowVol) {
		this.snowVol = snowVol;
	}

	public String getRoadState() {
		return roadState;
	}

	public void setRoadState(String roadState) {
		this.roadState = roadState;
	}

	public String getSaltConcentration() {
		return saltConcentration;
	}

	public void setSaltConcentration(String saltConcentration) {
		this.saltConcentration = saltConcentration;
	}

	public String getMist() {
		return mist;
	}

	public void setMist(String mist) {
		this.mist = mist;
	}

	public String getIceTemperature() {
		return iceTemperature;
	}

	public void setIceTemperature(String iceTemperature) {
		this.iceTemperature = iceTemperature;
	}

	public String getCommStatus() {
		return commStatus;
	}

	public void setCommStatus(String commStatus) {
		this.commStatus = commStatus;
	}

	public String getRecTime() {
		return recTime;
	}

	public void setRecTime(String recTime) {
		this.recTime = recTime;
	}

}
