/**
 * 
 */
package com.alp.policymanagement.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.alp.policymanagement.model.Policy;
import com.alp.policymanagement.model.User;
import com.alp.policymanagement.model.UserPolicy;
import com.alp.policymanagement.repository.PolicyRepository;
import com.alp.policymanagement.repository.UserRepository;

/**
 * @author lenovo
 *
 */
@Service
public class UserService {

	private static final String ADMIN = "admin";

	private static final String POLICY_VALID = "Yes";

	private static final String POLICY_INVALID = "No";

	@Autowired
	UserRepository userRepo;

	@Autowired
	PolicyRepository policyRepo;

	public String checkLogin(String userId, String password) {
		List<User> users = userRepo.getAllUsers();
		String validUser = "false";
		if (null != users)
			for (User user : users) {
				if (null != user && userId.equalsIgnoreCase(user.getUserId())
						&& password.equalsIgnoreCase(user.getPassword())) {
					validUser = "true";
				}
			}
		return validUser;
	}

	public User getUserDetails(String userId) {
		User user = null;
		if (!StringUtils.isEmpty(userId)) {
			user = userRepo.findByUserId(userId);
		}
		if (null != user && user.getUserId() != null
				&& user.getUserId().equalsIgnoreCase(ADMIN)) {
			populateAdminDetails(user);
		} else if (null != user && user.getUserId() != null) {
			populateUserDetails(user);
		}
		return user;
	}

	/**
	 * @param user
	 */
	private void populateAdminDetails(User user) {
		user.setAdmin(true);
		List<Policy> userPolicies = policyRepo.getAllPolicies();
		user.setPolocies(userPolicies);
	}

	/**
	 * @param user
	 */
	private void populateUserDetails(User user) {
		List<UserPolicy> userPoliciesMapping;
		List<Policy> userPolicies = new ArrayList<Policy>(1);
		userPoliciesMapping = policyRepo.findByUserId(user.getUserId());
		Policy policy = null;
		if (null != userPoliciesMapping) {
			for (UserPolicy upolicy : userPoliciesMapping) {
				policy = policyRepo.findByNumber(upolicy.getPolicyNumber());
				if(null!=policy){
				policy.setValid(populateVality(policy.getEndDate()));
				userPolicies.add(policy);
				}
			}
		}
		user.setPolocies(userPolicies);
	}

	private String populateVality(Date endDate) {
		String valid = POLICY_INVALID;
		if (null != endDate) {
			long currentTime = System.currentTimeMillis();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(endDate);
			long policyEndTime = calendar.getTimeInMillis();
			if (policyEndTime > currentTime) {
				valid = POLICY_VALID;
			}
		}
		return valid;
	}

	public String addUser(final User user) {
		user.setId(System.currentTimeMillis() / 1000);
		user.setUserId(populateUserId(user));
		String userId = userRepo.addUser(user);
		return userId;
	}

	private String populateUserId(User user) {
		StringBuilder userId = new StringBuilder(user.getfName());
		Calendar cal = Calendar.getInstance();
		cal.setTime(user.getDob());
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		userId.append(String.valueOf(month));
		userId.append(String.valueOf(day));
		return userId.toString();
	}
}
