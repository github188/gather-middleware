package com.scsvision.gather.middleware.sqlserver.dao;

import java.util.List;

import com.scsvision.gather.middleware.sqlserver.model.WeatherStat;

/**
 * WeatherStatDAO
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午3:43:26
 */
public interface WeatherStatDAO {
	public List<WeatherStat> extract();
}
