/**
 * 
 */
package com.scsvision.gather.middleware.sqlserver.dao.ymjimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.NoDetectorDAO;
import com.scsvision.gather.middleware.sqlserver.model.NoDetector;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.NoDetectorRowMapper;

/**
 * @author znsx
 *
 */
@Repository
public class NoDetectorDAOImpl implements NoDetectorDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<NoDetector> extract() {
		List<NoDetector> list = jdbcTemplate.query(SqlFactory.getInstance()
				.listNo(), new NoDetectorRowMapper());
		return list;
	}

}
