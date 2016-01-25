/**
 * 
 */
package com.scsvision.gather.middleware.sqlserver.dao.ymjimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.CoviDAO;
import com.scsvision.gather.middleware.sqlserver.model.Covi;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.CoviRowMapper;

/**
 * @author znsx
 *
 */
@Repository
public class CoviDAOImpl implements CoviDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Covi> extract() {
		List<Covi> covis = jdbcTemplate.query(SqlFactory.getInstance()
				.listCovi(), new CoviRowMapper());
		return covis;
	}

}
