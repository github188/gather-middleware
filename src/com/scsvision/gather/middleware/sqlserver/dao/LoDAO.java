package com.scsvision.gather.middleware.sqlserver.dao;

import java.util.List;

import com.scsvision.gather.middleware.sqlserver.model.Loli;

/**
 * LoDAO
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午11:54:52
 */
public interface LoDAO {
	public List<Loli> extract();
}
