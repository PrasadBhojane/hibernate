package com.cms.service;

import com.cms.entity.Customer;
import com.cms.repo.CustomerRepo;

public class CustomerServiceImpl implements CustomerService {

	CustomerRepo customerRepo = new CustomerRepo();
	
	public String saveCustomer(Customer customer) throws Exception {
		if (customer.getSex().equalsIgnoreCase("Gay")) {
			throw new Exception("gay customer not allowed");
		}
		return customerRepo.saveCustomer(customer);
	}

	public Customer readCustomer(Integer id) {
		System.out.println("service calling repo with id -"+id);
		Customer customerById = customerRepo.getCustomerById(id);
		System.out.println("service passing customer details to controller"+customerById);
		return customerById;
	}

	public String deleteById(Integer i) {
		return customerRepo.deleteCustomerById(i);
	}
	


}
