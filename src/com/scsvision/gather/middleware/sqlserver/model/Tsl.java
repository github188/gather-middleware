package com.scsvision.gather.middleware.sqlserver.model;

import java.io.Serializable;

/**
 * 交通信号灯
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午9:59:17
 */
public class Tsl implements Serializable {

	private static final long serialVersionUID = -6785739795217684382L;
	private String standardNumber;
	private int status;
	private String commStatus;
	/**
	 * 设备故障
	 */
	private String faultMessage;
	/**
	 * 绿灯状态反馈
	 */
	private boolean greenStatus;
	/**
	 * 红灯状态反馈
	 */
	private boolean redStatus;
	/**
	 * 黄灯状态反馈
	 */
	private boolean yellowStatus;
	/**
	 * 转向状态反馈
	 */
	private boolean turnStatus;

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

	public boolean isGreenStatus() {
		return greenStatus;
	}

	public void setGreenStatus(boolean greenStatus) {
		this.greenStatus = greenStatus;
	}

	public boolean isRedStatus() {
		return redStatus;
	}

	public void setRedStatus(boolean redStatus) {
		this.redStatus = redStatus;
	}

	public boolean isYellowStatus() {
		return yellowStatus;
	}

	public void setYellowStatus(boolean yellowStatus) {
		this.yellowStatus = yellowStatus;
	}

	public boolean isTurnStatus() {
		return turnStatus;
	}

	public void setTurnStatus(boolean turnStatus) {
		this.turnStatus = turnStatus;
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
