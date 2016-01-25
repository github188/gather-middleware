package com.scsvision.gather.middleware.sqlserver.model;

import java.io.Serializable;

/**
 * 情报板
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午1:51:58
 */
public class Cms implements Serializable {

	private static final long serialVersionUID = -7913678998040637115L;

	private String standardNumber;
	private int status;
	/**
	 * 设备故障
	 */
	private String faultMessage;
	/**
	 * 显示内容
	 */
	private String dispText;
	/**
	 * 停留时间
	 */
	private String dispTime;
	/**
	 * 字体名称
	 */
	private String fontName;
	/**
	 * 发布时间
	 */
	private String recTime;
	/**
	 * 字体大小
	 */
	private int size;
	/**
	 * 字体颜色
	 */
	private int color;

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

	public String getDispText() {
		return dispText;
	}

	public void setDispText(String dispText) {
		this.dispText = dispText;
	}

	public String getDispTime() {
		return dispTime;
	}

	public void setDispTime(String dispTime) {
		this.dispTime = dispTime;
	}

	public String getFontName() {
		return fontName;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
	}

	public String getRecTime() {
		return recTime;
	}

	public void setRecTime(String recTime) {
		this.recTime = recTime;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getCommStatus() {
		return commStatus;
	}

	public void setCommStatus(String commStatus) {
		this.commStatus = commStatus;
	}

	// @Override
	// public boolean equals(Object obj) {
	// if (obj == null)
	// return false;
	// if (this == obj)
	// return true;
	// if (obj instanceof Cms) {
	// Cms cms = (Cms) obj;
	// if (cms.standardNumber.equals(this.standardNumber))
	// return true;
	// }
	// return false;
	// }
	//
	// @Override
	// public int hashCode() {
	// return standardNumber.hashCode();
	// }

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

}
