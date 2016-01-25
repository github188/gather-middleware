package com.scsvision.gather.middleware.sqlserver.dao;

import java.util.List;

import com.scsvision.gather.middleware.sqlserver.model.WindSpeed;

/**
 * WindSpeedDAO
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午2:33:34
 */
public interface WindSpeedDAO {
	public List<WindSpeed> extract();
}
