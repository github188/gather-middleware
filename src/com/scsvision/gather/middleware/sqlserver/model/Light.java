package com.scsvision.gather.middleware.sqlserver.model;

import java.io.Serializable;

/**
 * 照明回路
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午2:51:37
 */
public class Light implements Serializable {

	private static final long serialVersionUID = 1838372923381278412L;
	private String standardNumber;
	private int status;
	private String commStatus;
	/**
	 * 设备故障
	 */
	private String faultMessage;
	/**
	 * 亮\灭反馈
	 */
	private String WorkState;
	/**
	 * 当前电流值
	 */
	private float current;
	private boolean auto;
	private boolean power;
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

	public String getWorkState() {
		return WorkState;
	}

	public void setWorkState(String workState) {
		WorkState = workState;
	}

	public float getCurrent() {
		return current;
	}

	public void setCurrent(float current) {
		this.current = current;
	}

	public boolean isAuto() {
		return auto;
	}

	public void setAuto(boolean auto) {
		this.auto = auto;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
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
