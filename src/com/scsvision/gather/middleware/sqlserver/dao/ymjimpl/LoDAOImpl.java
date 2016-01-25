/**
 * 
 */
package com.scsvision.gather.middleware.sqlserver.dao.ymjimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.LoDAO;
import com.scsvision.gather.middleware.sqlserver.model.Loli;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.LoRowMapper;

/**
 * @author znsx
 *
 */
@Repository
public class LoDAOImpl implements LoDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Loli> extract() {
		List<Loli> list = jdbcTemplate.query(SqlFactory.getInstance().listLo(),
				new LoRowMapper());
		return list;
	}

}
