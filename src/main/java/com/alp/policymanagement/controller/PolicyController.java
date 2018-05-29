/**
 * 
 */
package com.alp.policymanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alp.policymanagement.model.Policy;
import com.alp.policymanagement.service.PolicyService;

/**
 * @author lenovo
 *
 */
@RestController
public class PolicyController {
	
	@Autowired
	PolicyService policyService;
	
    @RequestMapping("/policies")
    public List<Policy> list() {
    	List<Policy> policies =null;
    	policies = policyService.getAllPolicies();
    	return policies;
    }
    
    @PostMapping("/policies")
    public String update(@RequestBody Policy policy) {
    	String policyNumber = policyService.updatePolicy(policy);
    	return policyNumber;
    }
}
