/**
 * 
 */
package com.alp.policymanagement.model;


/**
 * @author lenovo
 *
 */
public class UserPolicy extends BaseModel{

	private static final long serialVersionUID = 1L;
	private String id = "";
	private String userId = "";
	private long policyNumber;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the policyNumber
	 */
	public long getPolicyNumber() {
		return policyNumber;
	}
	/**
	 * @param policyNumber the policyNumber to set
	 */
	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}
	
	}
