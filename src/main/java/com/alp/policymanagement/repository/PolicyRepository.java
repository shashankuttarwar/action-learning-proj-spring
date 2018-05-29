/**
 * 
 */
package com.alp.policymanagement.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.alp.policymanagement.model.Policy;
import com.alp.policymanagement.model.UserPolicy;
import com.alp.policymanagement.repository.mapper.PolicyMapper;
import com.alp.policymanagement.repository.mapper.UserPolicyMapper;

/**
 * @author lenovo
 *
 */
@Repository
public class PolicyRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Policy findByNumber(long policyId) {
		try {
			return jdbcTemplate.queryForObject(
					"select * from POLICY where ID = ?",
					new Object[] { policyId }, new PolicyMapper());
		} catch (Exception e) {
			return null;
		}
	}

	public List<Policy> getAllPolicies() {
		try {
			List<Policy> policies = jdbcTemplate.query("SELECT * FROM Policy",
					new PolicyMapper());
			return policies;
		} catch (Exception e) {
			return null;
		}
	}

	public List<Policy> findByNumbers(List<Long> policyNumbers) {
		try {
			List<Policy> policies = jdbcTemplate.query(
					"SELECT * FROM Policy where number IN (?)",
					new PolicyMapper());
			return policies;
		} catch (Exception e) {
			return null;
		}
	}

	public List<UserPolicy> findByUserId(String userId) {
		try {
			List<UserPolicy> upolicies = jdbcTemplate.query(
					"SELECT * FROM UserPolicy where user_id =?",
					new Object[] { userId }, new UserPolicyMapper());
			return upolicies;
		} catch (Exception e) {
			return null;
		}
	}

	public String updatePolicy(Policy policy) {
		try {
			String sql = "UPDATE Policy SET ID=?, NAME=? ,NUMBER=?, AMOUNT=?, END_DATE=? WHERE ID=?";
			jdbcTemplate.update(sql, policy.getId(), policy.getName(),
					policy.getNumber(), policy.getAmount(),
					policy.getEndDate(), policy.getId());
			return String.valueOf(policy.getId());
		} catch (Exception e) {
			return null;
		}
	}

}
