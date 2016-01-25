package com.scsvision.gather.middleware.sqlserver.dao;

import java.util.List;

import com.scsvision.gather.middleware.sqlserver.model.Covi;

/**
 * CoviDAO
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午2:18:28
 */
public interface CoviDAO {
	public List<Covi> extract();
}
