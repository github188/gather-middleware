/**
 * 
 */
package com.scsvision.gather.middleware.sqlserver.dao.xzimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.CmsDAO;
import com.scsvision.gather.middleware.sqlserver.dao.SqlFactory;
import com.scsvision.gather.middleware.sqlserver.model.Cms;
import com.scsvision.gather.middleware.sqlserver.model.CmsParam;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.CmsParamRowMapper;
import com.scsvision.gather.middleware.sqlserver.model.xzrowmapper.CmsParamXZRowMapper;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CmsParam> listCmsParam() {
		List<CmsParam> cmss = jdbcTemplate.query(SqlXZFactory.getInstance()
				.listCmsParam(), new CmsParamXZRowMapper());
		return cmss;
	}

}
