package com.scsvision.gather.middleware.sqlserver.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * VehicleDetector
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-10 下午5:29:40
 */
public class VehicleDetector implements Serializable {
	private static final long serialVersionUID = 6466029877396887682L;
	private String standardNumber;
	private int status;
	private String faultMessage;
	private String upFluxB;
	private String upFluxM;
	private String upFluxMS;
	private String upFluxS;
	private String upFlux;
	private String upHeadWay;
	private String dwFluxB;
	private String dwFluxM;
	private String dwFluxMS;
	private String dwFluxS;
	private String dwFlux;
	private String upSpeed;
	private String upSpeedB;
	private String upSpeedM;
	private String upSpeedMS;
	private String upSpeedS;
	private String dwSpeed;
	private String dwSpeedB;
	private String dwSpeedM;
	private String dwSpeedMs;
	private String dwSpeedS;
	private String upOcc;
	private String upOccB;
	private String upOccM;
	private String upOccMS;
	private String upOccS;
	private String dwOcc;
	private String dwOccB;
	private String dwOccM;
	private String dwOccMS;
	private String dwOccS;
	private String dwHeadWay;
	private String laneNum;
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

	public String getUpFluxB() {
		return upFluxB;
	}

	public void setUpFluxB(String upFluxB) {
		this.upFluxB = upFluxB;
	}

	public String getUpFluxM() {
		return upFluxM;
	}

	public void setUpFluxM(String upFluxM) {
		this.upFluxM = upFluxM;
	}

	public String getUpFluxMS() {
		return upFluxMS;
	}

	public void setUpFluxMS(String upFluxMS) {
		this.upFluxMS = upFluxMS;
	}

	public String getUpFluxS() {
		return upFluxS;
	}

	public void setUpFluxS(String upFluxS) {
		this.upFluxS = upFluxS;
	}

	public String getUpFlux() {
		return upFlux;
	}

	public void setUpFlux(String upFlux) {
		this.upFlux = upFlux;
	}

	public String getUpHeadWay() {
		return upHeadWay;
	}

	public void setUpHeadWay(String upHeadWay) {
		this.upHeadWay = upHeadWay;
	}

	public String getDwFluxB() {
		return dwFluxB;
	}

	public void setDwFluxB(String dwFluxB) {
		this.dwFluxB = dwFluxB;
	}

	public String getDwFluxM() {
		return dwFluxM;
	}

	public void setDwFluxM(String dwFluxM) {
		this.dwFluxM = dwFluxM;
	}

	public String getDwFluxMS() {
		return dwFluxMS;
	}

	public void setDwFluxMS(String dwFluxMS) {
		this.dwFluxMS = dwFluxMS;
	}

	public String getDwFluxS() {
		return dwFluxS;
	}

	public void setDwFluxS(String dwFluxS) {
		this.dwFluxS = dwFluxS;
	}

	public String getDwFlux() {
		return dwFlux;
	}

	public void setDwFlux(String dwFlux) {
		this.dwFlux = dwFlux;
	}

	public String getUpSpeed() {
		return upSpeed;
	}

	public void setUpSpeed(String upSpeed) {
		this.upSpeed = upSpeed;
	}

	public String getUpSpeedB() {
		return upSpeedB;
	}

	public void setUpSpeedB(String upSpeedB) {
		this.upSpeedB = upSpeedB;
	}

	public String getUpSpeedM() {
		return upSpeedM;
	}

	public void setUpSpeedM(String upSpeedM) {
		this.upSpeedM = upSpeedM;
	}

	public String getUpSpeedMS() {
		return upSpeedMS;
	}

	public void setUpSpeedMS(String upSpeedMS) {
		this.upSpeedMS = upSpeedMS;
	}

	public String getUpSpeedS() {
		return upSpeedS;
	}

	public void setUpSpeedS(String upSpeedS) {
		this.upSpeedS = upSpeedS;
	}

	public String getDwSpeed() {
		return dwSpeed;
	}

	public void setDwSpeed(String dwSpeed) {
		this.dwSpeed = dwSpeed;
	}

	public String getDwSpeedB() {
		return dwSpeedB;
	}

	public void setDwSpeedB(String dwSpeedB) {
		this.dwSpeedB = dwSpeedB;
	}

	public String getDwSpeedM() {
		return dwSpeedM;
	}

	public void setDwSpeedM(String dwSpeedM) {
		this.dwSpeedM = dwSpeedM;
	}

	public String getDwSpeedMs() {
		return dwSpeedMs;
	}

	public void setDwSpeedMs(String dwSpeedMs) {
		this.dwSpeedMs = dwSpeedMs;
	}

	public String getDwSpeedS() {
		return dwSpeedS;
	}

	public void setDwSpeedS(String dwSpeedS) {
		this.dwSpeedS = dwSpeedS;
	}

	public String getUpOcc() {
		return upOcc;
	}

	public void setUpOcc(String upOcc) {
		this.upOcc = upOcc;
	}

	public String getUpOccB() {
		return upOccB;
	}

	public void setUpOccB(String upOccB) {
		this.upOccB = upOccB;
	}

	public String getUpOccM() {
		return upOccM;
	}

	public void setUpOccM(String upOccM) {
		this.upOccM = upOccM;
	}

	public String getUpOccMS() {
		return upOccMS;
	}

	public void setUpOccMS(String upOccMS) {
		this.upOccMS = upOccMS;
	}

	public String getUpOccS() {
		return upOccS;
	}

	public void setUpOccS(String upOccS) {
		this.upOccS = upOccS;
	}

	public String getDwOcc() {
		return dwOcc;
	}

	public void setDwOcc(String dwOcc) {
		this.dwOcc = dwOcc;
	}

	public String getDwOccB() {
		return dwOccB;
	}

	public void setDwOccB(String dwOccB) {
		this.dwOccB = dwOccB;
	}

	public String getDwOccM() {
		return dwOccM;
	}

	public void setDwOccM(String dwOccM) {
		this.dwOccM = dwOccM;
	}

	public String getDwOccMS() {
		return dwOccMS;
	}

	public void setDwOccMS(String dwOccMS) {
		this.dwOccMS = dwOccMS;
	}

	public String getDwOccS() {
		return dwOccS;
	}

	public void setDwOccS(String dwOccS) {
		this.dwOccS = dwOccS;
	}

	public String getDwHeadWay() {
		return dwHeadWay;
	}

	public void setDwHeadWay(String dwHeadWay) {
		this.dwHeadWay = dwHeadWay;
	}

	public String getLaneNum() {
		return laneNum;
	}

	public void setLaneNum(String laneNum) {
		this.laneNum = laneNum;
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
