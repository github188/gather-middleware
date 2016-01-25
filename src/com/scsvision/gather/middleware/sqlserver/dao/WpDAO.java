package com.scsvision.gather.middleware.sqlserver.dao;

import java.util.List;

import com.scsvision.gather.middleware.sqlserver.model.Wp;

/**
 * WpDAO
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午5:23:17
 */
public interface WpDAO {
	public List<Wp> extract();
}
