/**
 * 
 */
package com.alp.policymanagement.dao;

import java.util.List;

import com.alp.policymanagement.model.User;

/**
 * @author lenovo
 *
 */
public interface UserDao {

	public List<User> getUsers();
	
	public List<User> getUserPolicies(String userId);
	
	public String addUser(User user);
}
