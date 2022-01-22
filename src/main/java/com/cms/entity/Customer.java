package com.cms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Customer")
public class Customer {

	@Id
	private Integer customerId;
	
	private String customerName;
	
	private String customerAddress;
	
	private String contact;
	
	private String sex;
	
	public Customer() {
		super();
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", contact=" + contact + ", sex=" + sex + "]";
	}

	public Customer(Integer customerId, String customerName, String customerAddress, String contact, String sex) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.contact = contact;
		this.sex = sex;
	}
	
	
	
}
