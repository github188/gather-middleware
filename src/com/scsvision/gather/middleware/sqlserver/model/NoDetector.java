package com.scsvision.gather.middleware.sqlserver.model;

import java.io.Serializable;

/**
 * 氮氧化物
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午10:28:32
 */
public class NoDetector implements Serializable {

	private static final long serialVersionUID = 6564928012690749381L;
	private String standardNumber;
	private int status;
	private String commStatus;
	/**
	 * 设备故障
	 */
	private String faultMessage;
	private float nOConct;
	private float nO2Conct;
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

	public float getNOConct() {
		return nOConct;
	}

	public void setNOConct(float nOConct) {
		this.nOConct = nOConct;
	}

	public float getNO2Conct() {
		return nO2Conct;
	}

	public void setNO2Conct(float nO2Conct) {
		this.nO2Conct = nO2Conct;
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
