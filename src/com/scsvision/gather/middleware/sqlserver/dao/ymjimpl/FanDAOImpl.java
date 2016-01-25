/**
 * 
 */
package com.scsvision.gather.middleware.sqlserver.dao.ymjimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.FanDAO;
import com.scsvision.gather.middleware.sqlserver.model.Fan;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.FanRowMapper;

/**
 * @author znsx
 *
 */
@Repository
public class FanDAOImpl implements FanDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Fan> extract() {
		List<Fan> fans = jdbcTemplate.query(SqlFactory.getInstance().listFan(),
				new FanRowMapper());
		return fans;
	}

}
