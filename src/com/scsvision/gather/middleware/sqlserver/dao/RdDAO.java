package com.scsvision.gather.middleware.sqlserver.dao;

import java.util.List;

import com.scsvision.gather.middleware.sqlserver.model.Rd;

/**
 * RdDAO
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午10:48:28
 */
public interface RdDAO {
	public List<Rd> extract();
}
