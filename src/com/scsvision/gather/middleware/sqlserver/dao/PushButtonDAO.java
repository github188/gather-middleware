package com.scsvision.gather.middleware.sqlserver.dao;

import java.util.List;

import com.scsvision.gather.middleware.sqlserver.model.PushButton;

/**
 * PushButtonDAO
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午4:23:07
 */
public interface PushButtonDAO {
	public List<PushButton> extract();
}
