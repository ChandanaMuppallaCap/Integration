
package com.tmobile.poc.vo;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@Component
@Document(collection = "customer")
@JsonInclude(value = Include.NON_NULL)
public class CustomerVO implements Serializable {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	@Id
	private Integer customerId;
	private String phoneNumber;
	private String firstName;
	
	private String lastName;
	
	private String ssn;
	
	private String dob;

	@JsonIgnore
	private Integer status;

	public CustomerVO() {

	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer[customerId=%d, phoneNumber=%s, firstName='%s', lastName='%s',ssn='%s',dob='%s',status='%d']",
				customerId, phoneNumber, firstName, lastName, ssn, dob, status);

	}

	/*
	 * public String getStatusStr() { String str = "";
	 * 
	 * System.out.println("Status with in"+this.status); switch (this.status) {
	 * case IConstants.ACTIVE: str = IConstants.ACTIVE_STR; break; case
	 * IConstants.INACTIVE: str = IConstants.INACTIVE_STR; break; } return str;
	 * 
	 * }
	 */

}
