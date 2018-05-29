/**
 * 
 */
package com.alp.policymanagement.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alp.policymanagement.dao.UserDao;
import com.alp.policymanagement.model.User;
import com.alp.policymanagement.repository.UserRepository;

/**
 * @author lenovo
 *
 */
public class UserDaoImpl implements UserDao {

	@Autowired
	UserRepository userRepo;
	
	@Override
	public List<User> getUsers() {
		return null;
	}

	@Override
	public List<User> getUserPolicies(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
