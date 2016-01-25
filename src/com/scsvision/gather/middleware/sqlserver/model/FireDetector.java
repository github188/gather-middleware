package com.scsvision.gather.middleware.sqlserver.model;

import java.io.Serializable;

/**
 * 火灾检测器
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午2:11:53
 */
public class FireDetector implements Serializable {

	private static final long serialVersionUID = 5015888866575471975L;
	private String standardNumber;
	private int status;
	private String commStatus;
	/**
	 * 设备故障
	 */
	private String faultMessage;
	private int cdStatus;
	private float temperature;
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

	public int getCdStatus() {
		return cdStatus;
	}

	public void setCdStatus(int cdStatus) {
		this.cdStatus = cdStatus;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public String getRecTime() {
		return recTime;
	}

	public void setRecTime(String recTime) {
		this.recTime = recTime;
	}

	public String getCommStatus() {
		return commStatus;
	}

	public void setCommStatus(String commStatus) {
		this.commStatus = commStatus;
	}

}
