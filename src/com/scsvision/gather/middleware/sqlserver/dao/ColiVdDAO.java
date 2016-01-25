package com.scsvision.gather.middleware.sqlserver.dao;

import java.util.List;

import com.scsvision.gather.middleware.sqlserver.model.VehicleDetector;

/**
 * ColiVdDAO
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午5:16:30
 */
public interface ColiVdDAO {
	public List<VehicleDetector> extract();
}
