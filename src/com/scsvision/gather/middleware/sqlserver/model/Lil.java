package com.scsvision.gather.middleware.sqlserver.model;

import java.io.Serializable;

/**
 * 车道指示灯
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午4:59:54
 */
public class Lil implements Serializable {

	private static final long serialVersionUID = -1226924443318558470L;

	private String standardNumber;
	private int status;
	private String commStatus;
	/**
	 * 设备故障
	 */
	private String faultMessage;
	/**
	 * 背面绿箭状态反馈
	 */
	private boolean backArrowStatus;
	/**
	 * 背面红叉状态反馈
	 */
	private boolean backXStatus;
	/**
	 * 正面绿箭状态反馈
	 */
	private boolean frontArrowStatus;
	/**
	 * 正面红叉状态反馈
	 */
	private boolean frontXStatus;
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

	public boolean isBackArrowStatus() {
		return backArrowStatus;
	}

	public void setBackArrowStatus(boolean backArrowStatus) {
		this.backArrowStatus = backArrowStatus;
	}

	public boolean isBackXStatus() {
		return backXStatus;
	}

	public void setBackXStatus(boolean backXStatus) {
		this.backXStatus = backXStatus;
	}

	public boolean isFrontArrowStatus() {
		return frontArrowStatus;
	}

	public void setFrontArrowStatus(boolean frontArrowStatus) {
		this.frontArrowStatus = frontArrowStatus;
	}

	public boolean isFrontXStatus() {
		return frontXStatus;
	}

	public void setFrontXStatus(boolean frontXStatus) {
		this.frontXStatus = frontXStatus;
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
