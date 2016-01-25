package com.scsvision.gather.middleware.sqlserver.dao;

import java.util.List;

import com.scsvision.gather.middleware.sqlserver.model.VehicleDetector;

/**
 * VehicleDetectorDAO
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-10 下午4:42:01
 */
public interface VehicleDetectorDAO {
	public List<VehicleDetector> extract();
}
