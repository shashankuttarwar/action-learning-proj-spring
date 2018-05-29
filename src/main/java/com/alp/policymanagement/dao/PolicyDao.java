/**
 * 
 */
package com.alp.policymanagement.dao;

import java.util.List;

import com.alp.policymanagement.model.Policy;

/**
 * @author lenovo
 *
 */
public interface PolicyDao {

	public List<Policy> getPolicies();
	
	public String updatePolicy(Policy policy);
}
