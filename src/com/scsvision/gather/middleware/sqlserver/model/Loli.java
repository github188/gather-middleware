package com.scsvision.gather.middleware.sqlserver.model;

import java.io.Serializable;

/**
 * 光强检测器
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午10:57:29
 */
public class Loli implements Serializable {

	private static final long serialVersionUID = 5716579238233840194L;
	private String standardNumber;
	private int status;
	private String commStatus;
	/**
	 * 设备故障
	 */
	private String faultMessage;
	private float lOLumi;
	private float lILumi;
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

	public float getLOLumi() {
		return lOLumi;
	}

	public void setLOLumi(float lOLumi) {
		this.lOLumi = lOLumi;
	}

	public float getLILumi() {
		return lILumi;
	}

	public void setLILumi(float lILumi) {
		this.lILumi = lILumi;
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
