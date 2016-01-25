package com.scsvision.gather.middleware.sqlserver.dao;

import java.util.List;

import com.scsvision.gather.middleware.sqlserver.model.FireDetector;

/**
 * FireDetectorDAO
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午2:16:27
 */
public interface FireDetectorDAO {
	public List<FireDetector> extract();
}
