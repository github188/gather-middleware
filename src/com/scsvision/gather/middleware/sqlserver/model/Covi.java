package com.scsvision.gather.middleware.sqlserver.model;

import java.io.Serializable;

/**
 * 一氧化碳\能见度
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午2:11:25
 */
public class Covi implements Serializable {

	private static final long serialVersionUID = 1362267285430288661L;
	private String standardNumber;
	private int status;
	/**
	 * 设备故障
	 */
	private String faultMessage;
	/**
	 * CO值
	 */
	private String cOConct;
	/**
	 * VI值
	 */
	private String visibility;
	private String recTime;
	private String commStatus;

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

	public String getCOConct() {
		return cOConct;
	}

	public void setCOConct(String cOConct) {
		this.cOConct = cOConct;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
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
