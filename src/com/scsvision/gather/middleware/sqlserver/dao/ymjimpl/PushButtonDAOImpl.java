/**
 * 
 */
package com.scsvision.gather.middleware.sqlserver.dao.ymjimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.PushButtonDAO;
import com.scsvision.gather.middleware.sqlserver.model.PushButton;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.PushButtonRowMapper;

/**
 * @author znsx
 *
 */
@Repository
public class PushButtonDAOImpl implements PushButtonDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<PushButton> extract() {
		List<PushButton> pbs = jdbcTemplate.query(SqlFactory.getInstance()
				.listPb(), new PushButtonRowMapper());
		return pbs;
	}

}
