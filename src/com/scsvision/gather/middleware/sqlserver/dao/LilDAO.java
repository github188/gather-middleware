package com.scsvision.gather.middleware.sqlserver.dao;

import java.util.List;

import com.scsvision.gather.middleware.sqlserver.model.Lil;

/**
 * LilDAO
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午5:08:31
 */
public interface LilDAO {
	public List<Lil> extract();
}
