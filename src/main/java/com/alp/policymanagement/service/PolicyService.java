/**
 * 
 */
package com.alp.policymanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alp.policymanagement.model.Policy;
import com.alp.policymanagement.repository.PolicyRepository;

/**
 * @author lenovo
 *
 */
@Service
public class PolicyService {

	@Autowired
	PolicyRepository policyRepo;
	
	public List<Policy> getAllPolicies() {
		List<Policy> policies = policyRepo.getAllPolicies();
    	return policies;
    }
	
	public String updatePolicy(final Policy policy) {
		String policyNumber = policyRepo.updatePolicy(policy);;
    	return policyNumber;
    } 
}
