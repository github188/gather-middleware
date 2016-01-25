/**
 * 
 */
package com.scsvision.gather.middleware.sqlserver.model.xzrowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.lang.StringUtils;
import org.springframework.jdbc.core.RowMapper;

import com.scsvision.gather.middleware.sqlserver.model.CmsParam;

/**
 * @author znsx
 * 
 */
public class CmsParamXZRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		CmsParam cms = new CmsParam();
		String sizeTypeValue = rs.getString("SizeTypeValue");
		String cmsValue[] = null;
		if (StringUtils.isNotBlank(sizeTypeValue)) {
			cmsValue = sizeTypeValue.split("\\*");
		}
		if (null != cmsValue) {
			cms.setWidth(cmsValue[0]);
			cms.setHeight(cmsValue[1]);
		} else {
			cms.setWidth("0");
			cms.setHeight("0");
		}
		cms.setStandardNum(rs.getString("DeviceNo"));
		return cms;
	}
}
