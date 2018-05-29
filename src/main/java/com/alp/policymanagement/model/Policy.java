/**
 * 
 */
package com.alp.policymanagement.model;

import java.util.Date;

/**
 * @author lenovo
 *
 */
public class Policy extends BaseModel{

	private static final long serialVersionUID = 1L;
	private long id;
	private String name = "";
	private String number = "";
	private String amount = "";
	private Date endDate = null;
	private String valid = "";
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the valid
	 */
	public String getValid() {
		return valid;
	}
	/**
	 * @param valid the valid to set
	 */
	public void setValid(String valid) {
		this.valid = valid;
	}
	
}
