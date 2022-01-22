package com.cms.service;

import com.cms.entity.Customer;

public interface CustomerService {

	public String saveCustomer(Customer customer) throws Exception;
	
	public Customer readCustomer(Integer id);

	public String deleteById(Integer i);
	

	
}
