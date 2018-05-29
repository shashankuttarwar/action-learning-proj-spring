/**
 * 
 */
package com.alp.policymanagement.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.alp.policymanagement.model.UserPolicy;

/**
 * @author lenovo
 *
 */
public class UserPolicyMapper implements RowMapper<UserPolicy>{

	@Override
	public UserPolicy mapRow(ResultSet rset, int row) throws SQLException {
		UserPolicy upolicy = new UserPolicy();
		upolicy.setId(rset.getString("ID"));
		upolicy.setPolicyNumber(rset.getInt("POLICY_NUMBER"));
		upolicy.setUserId(rset.getString("USER_ID"));
		return upolicy;
	}

}
