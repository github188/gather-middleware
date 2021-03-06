/**
 * 
 */
package com.scsvision.gather.middleware.sqlserver.dao.ymjimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.CmsDAO;
import com.scsvision.gather.middleware.sqlserver.model.Cms;
import com.scsvision.gather.middleware.sqlserver.model.CmsParam;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.CmsParamRowMapper;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.CmsRowMapper;

/**
 * @author znsx
 *
 */
@Repository
public class CmsDAOImpl implements CmsDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Cms> extract() {
		List<Cms> cmss = jdbcTemplate.query(SqlFactory.getInstance().listCms(),
				new CmsRowMapper());
		return cmss;
	}

	@Override
	public List<CmsParam> listCmsParam() {
		List<CmsParam> cmss = jdbcTemplate.query(SqlFactory.getInstance()
				.listCmsParam(), new CmsParamRowMapper());
		return cmss;
	}

}
