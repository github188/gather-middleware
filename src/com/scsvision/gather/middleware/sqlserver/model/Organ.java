package com.scsvision.gather.middleware.sqlserver.model;

/**
 * Organ
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-22 下午4:18:42
 */
public class Organ {
	private String id;
	private String sn;
	private String parent;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
