package com.scsvision.gather.middleware.sqlserver.dao;

import java.util.List;

import com.scsvision.gather.middleware.sqlserver.model.Organ;

/**
 * 隧道机构数据库接口
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-22 下午4:17:25
 */
public interface OrganDAO {
	/**
	 * 获取机构列表
	 * 
	 * @return
	 * @author huangbuji
	 *         <p />
	 *         Create at 2014-9-22 下午4:22:51
	 */
	public List<Organ> listOrgan();

	/**
	 * 获取根机构
	 * 
	 * @return
	 * @author huangbuji
	 *         <p />
	 *         Create at 2014-9-22 下午4:46:33
	 */
	public Organ getParent();
}
