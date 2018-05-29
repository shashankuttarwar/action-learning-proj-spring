/**
 * 
 */
package com.alp.policymanagement.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.alp.policymanagement.model.Policy;

/**
 * @author lenovo
 *
 */
public class PolicyMapper implements RowMapper<Policy>{

	@Override
	public Policy mapRow(ResultSet rset, int row) throws SQLException {
		Policy policy = new Policy();
		policy.setAmount(rset.getString("AMOUNT"));
		policy.setEndDate(rset.getDate("END_DATE"));
		policy.setName(rset.getString("NAME"));
		policy.setNumber(rset.getString("NUMBER"));
		policy.setId(rset.getInt("ID"));
		return policy;
	}

}
