package com.scsvision.gather.middleware.sqlserver.model;

import java.io.Serializable;

/**
 * 消防水泵
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午5:12:09
 */
public class Wp implements Serializable {
	private static final long serialVersionUID = 113039598425812405L;
	private String standardNumber;
	private int status;
	private String commStatus;
	/**
	 * 设备故障
	 */
	private String faultMessage;
	/**
	 * 水泵状态
	 */
	private String WorkState;
	private boolean pumpAuto;
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

	public boolean isPumpAuto() {
		return pumpAuto;
	}

	public void setPumpAuto(boolean pumpAuto) {
		this.pumpAuto = pumpAuto;
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
