/**
 * 
 */
package com.scsvision.gather.middleware.sqlserver.dao.ymjimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.LiDAO;
import com.scsvision.gather.middleware.sqlserver.model.Loli;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.LiRowMapper;

/**
 * @author znsx
 *
 */
@Repository
public class LiDAOImpl implements LiDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Loli> extract() {
		List<Loli> list = jdbcTemplate.query(SqlFactory.getInstance().listLi(),
				new LiRowMapper());
		return list;
	}

}
