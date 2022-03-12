package com.cms.controller;

import com.cms.entity.Customer;
import com.cms.service.CustomerService;
import com.cms.service.CustomerServiceImpl;

public class CustomerController {

	private CustomerService customerService = new CustomerServiceImpl();
	 
	public static void main(String[] args) throws Exception {
		CustomerController controller = new CustomerController();
		String saveCustomerResponse = controller.saveCustomer();
		System.out.println("Database Response ->"+saveCustomerResponse);
	}

	public String saveCustomer() throws Exception {
		Customer customer = new  Customer(1, "Prasad", "Pune", "2122231322", "Male");
		String response = customerService.saveCustomer(customer);
		 return response;
	}
}