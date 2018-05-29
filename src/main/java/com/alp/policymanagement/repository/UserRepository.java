/**
 * 
 */
package com.alp.policymanagement.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.alp.policymanagement.model.User;
import com.alp.policymanagement.repository.mapper.UserMapper;

/**
 * @author lenovo
 *
 */
@Repository
public class UserRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public User findById(long userId) {
		return jdbcTemplate.queryForObject("select * from user where id=?",
				new Object[] { userId }, new UserMapper());
	}
	
	public User findByUserId(String userId) {
		return jdbcTemplate.queryForObject("select * from user where user_id=?",
				new Object[] { userId }, new UserMapper());
	}

	public List<User> getAllUsers() {
		List<User> users = jdbcTemplate.query("SELECT * FROM User",
				new UserMapper());
		return users;
	}

	// TODO: if update user required
	// public void updateUser(User user) {
	// String sql = "UPDATE User SET title=?, category=? WHERE articleId=?";
	// jdbcTemplate.update(sql, user.getTitle(), user.getCategory(),
	// user.getArticleId());
	// }

	public String addUser(User user) {
		String sql = "INSERT INTO User (ID, FIRST_NAME, LAST_NAME, USER_ID, DATE_OF_BIRTH, PHONE, EMAIL, ADDRESS, PASSWORD) values (?, ?, ?,?, ?, ?,?, ?, ?)";
		jdbcTemplate.update(sql, user.getId(), user.getfName(),
				user.getlName(), user.getUserId(), user.getDob(),
				user.getPhone(), user.getEmail(), user.getAddress(),
				user.getPassword());
		return user.getUserId();
	}
}
