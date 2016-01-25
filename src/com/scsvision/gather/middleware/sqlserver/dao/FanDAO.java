package com.scsvision.gather.middleware.sqlserver.dao;

import java.util.List;

import com.scsvision.gather.middleware.sqlserver.model.Fan;

/**
 * FanDAO
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午11:54:51
 */
public interface FanDAO {
	public List<Fan> extract();
}
