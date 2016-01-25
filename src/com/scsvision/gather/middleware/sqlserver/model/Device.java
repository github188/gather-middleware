package com.scsvision.gather.middleware.sqlserver.model;

/**
 * Device
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-22 下午2:04:02
 */
public class Device {
	private String id;
	private String name;
	private int type;
	private float address;
	private String stakeNumber;
	private String road;
	private String parent;
	private int laneNumber;
	private int navigation;
	private String company;
	private int position;
	private String typeName;
	private String installer;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public float getAddress() {
		return address;
	}

	public void setAddress(float address) {
		this.address = address;
	}

	public String getStakeNumber() {
		return stakeNumber;
	}

	public void setStakeNumber(String stakeNumber) {
		this.stakeNumber = stakeNumber;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public int getLaneNumber() {
		return laneNumber;
	}

	public void setLaneNumber(int laneNumber) {
		this.laneNumber = laneNumber;
	}

	public int getNavigation() {
		return navigation;
	}

	public void setNavigation(int navigation) {
		this.navigation = navigation;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getInstaller() {
		return installer;
	}

	public void setInstaller(String installer) {
		this.installer = installer;
	}

}
