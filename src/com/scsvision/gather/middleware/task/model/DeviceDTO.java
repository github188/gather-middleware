package com.scsvision.gather.middleware.task.model;

/**
 * GB28059定义上报资源对象
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-22 上午11:51:29
 */
public class DeviceDTO {
	private String name;
	private String coding;
	private String privilege;
	private String parent;
	private String status;
	private String longitude;
	private String latitude;
	private String roadway;
	private String pileNo;
	private String type;
	private String navigation;
	private String width;
	private String height;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoding() {
		return coding;
	}

	public void setCoding(String coding) {
		this.coding = coding;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getRoadway() {
		return roadway;
	}

	public void setRoadway(String roadway) {
		this.roadway = roadway;
	}

	public String getPileNo() {
		return pileNo;
	}

	public void setPileNo(String pileNo) {
		this.pileNo = pileNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNavigation() {
		return navigation;
	}

	public void setNavigation(String navigation) {
		this.navigation = navigation;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

}
