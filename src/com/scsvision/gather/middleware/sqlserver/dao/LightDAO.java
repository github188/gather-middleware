package com.scsvision.gather.middleware.sqlserver.dao;

import java.util.List;

import com.scsvision.gather.middleware.sqlserver.model.Light;

/**
 * LightDAO
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午3:03:55
 */
public interface LightDAO {
	public List<Light> extract();
}
