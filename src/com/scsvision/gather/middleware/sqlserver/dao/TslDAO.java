package com.scsvision.gather.middleware.sqlserver.dao;

import java.util.List;

import com.scsvision.gather.middleware.sqlserver.model.Tsl;

/**
 * TslDAO
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午10:30:02
 */
public interface TslDAO {
	public List<Tsl> extract();
}
