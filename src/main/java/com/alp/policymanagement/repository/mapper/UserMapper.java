/**
 * 
 */
package com.alp.policymanagement.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.alp.policymanagement.model.User;

/**
 * @author lenovo
 *
 */
public class UserMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rset, int rowNum) throws SQLException {
		User user = new User();
		user.setAddress(rset.getString("ADDRESS"));
		user.setDob(rset.getDate("DATE_OF_BIRTH"));
		user.setEmail(rset.getString("EMAIL"));
		user.setfName(rset.getString("FIRST_NAME"));
		user.setlName(rset.getString("LAST_NAME"));
		user.setPassword(rset.getString("PASSWORD"));
		user.setPhone(rset.getString("PHONE"));
		user.setUserId(rset.getString("USER_ID"));
		user.setId(rset.getInt("ID"));
		return user;
	}

}
