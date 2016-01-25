package com.scsvision.gather.middleware.sqlserver.dao;

import java.util.List;

import com.scsvision.gather.middleware.sqlserver.model.Cms;
import com.scsvision.gather.middleware.sqlserver.model.CmsParam;

/**
 * CmsDAO
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午2:03:27
 */
public interface CmsDAO {
	public List<Cms> extract();

	/**
	 * 获取情报板属性列表
	 * 
	 * @return
	 * @author huangbuji
	 *         <p />
	 *         Create at 2014-9-28 上午10:54:47
	 */
	public List<CmsParam> listCmsParam();
}
