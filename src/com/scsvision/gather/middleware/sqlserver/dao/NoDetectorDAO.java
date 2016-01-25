package com.scsvision.gather.middleware.sqlserver.dao;

import java.util.List;

import com.scsvision.gather.middleware.sqlserver.model.NoDetector;

/**
 * NoDetectorDAO
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 上午10:43:47
 */
public interface NoDetectorDAO {
	public List<NoDetector> extract();
}
