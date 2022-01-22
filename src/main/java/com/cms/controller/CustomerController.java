package com.cms.controller;

import com.cms.entity.Customer;
import com.cms.service.CustomerService;
import com.cms.service.CustomerServiceImpl;

public class CustomerController {

	private CustomerService customerService = new CustomerServiceImpl();
	 
	public static void main(String[] args) throws Exception {
		CustomerController controller = new CustomerController();
//		String saveCustomerResponse = controller.saveCustomer();
//		System.out.println("Database Response ->"+saveCustomerResponse);
		
//		Customer readCustomer = controller.readCustomer(1);
//		System.out.println("Database Response ->"+readCustomer);
		
		String removeCustomer = controller.removeCustomerById(1);
		System.out.println("Database Response ->"+removeCustomer);	

	}
	
	public String removeCustomerById(Integer id) {
	
		return customerService.deleteById(id);
	}

	public String saveCustomer() throws Exception {
		Customer customer = new  Customer(4, "yatish", "Dhule", "8624060097", "Male");
		String response = customerService.saveCustomer(customer);
		 return response;
	}
	
	public Customer readCustomer(Integer id) {
		System.out.println("controller calling service with id -"+id);
		Customer readCustomer = customerService.readCustomer(id);
		System.out.println("controller passing customer details to web"+readCustomer);
		return readCustomer;
	}
	
}
