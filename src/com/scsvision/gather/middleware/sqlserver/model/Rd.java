package com.scsvision.gather.middleware.sqlserver.model;

import java.io.Serializable;

/**
 * 防火卷帘门
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午10:40:35
 */
public class Rd implements Serializable {

	private static final long serialVersionUID = -2453300499314137656L;
	private String standardNumber;
	private int status;
	private String commStatus;
	/**
	 * 设备故障
	 */
	private String faultMessage;
	/**
	 * 门自动反馈
	 */
	private boolean auto;
	/**
	 * 门状态
	 */
	private int workState;
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

	public boolean isAuto() {
		return auto;
	}

	public void setAuto(boolean auto) {
		this.auto = auto;
	}

	public int getWorkState() {
		return workState;
	}

	public void setWorkState(int workState) {
		this.workState = workState;
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
