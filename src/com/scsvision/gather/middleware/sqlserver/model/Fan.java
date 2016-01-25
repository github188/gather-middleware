package com.scsvision.gather.middleware.sqlserver.model;

import java.io.Serializable;

/**
 * 风机
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午10:57:08
 */
public class Fan implements Serializable {

	private static final long serialVersionUID = -3853549096459526091L;
	private String standardNumber;
	private int status;
	private String commStatus;
	/**
	 * 设备故障
	 */
	private String faultMessage;
	/**
	 * 手/自动反馈
	 */
	private boolean auto;
	private boolean power;
	/**
	 * 当前电流量
	 */
	private float current;
	/**
	 * 风机状态反馈
	 */
	private int workState;
	private boolean softStartRun;
	private boolean softStartStatus;
	private boolean softReStartStatus;
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

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public float getCurrent() {
		return current;
	}

	public void setCurrent(float current) {
		this.current = current;
	}

	public int getWorkState() {
		return workState;
	}

	public void setWorkState(int workState) {
		this.workState = workState;
	}

	public boolean isSoftStartRun() {
		return softStartRun;
	}

	public void setSoftStartRun(boolean softStartRun) {
		this.softStartRun = softStartRun;
	}

	public boolean isSoftStartStatus() {
		return softStartStatus;
	}

	public void setSoftStartStatus(boolean softStartStatus) {
		this.softStartStatus = softStartStatus;
	}

	public boolean isSoftReStartStatus() {
		return softReStartStatus;
	}

	public void setSoftReStartStatus(boolean softReStartStatus) {
		this.softReStartStatus = softReStartStatus;
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
