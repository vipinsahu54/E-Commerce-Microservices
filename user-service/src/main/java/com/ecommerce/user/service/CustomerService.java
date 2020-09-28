package com.ecommerce.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.user.model.Customer;
import com.ecommerce.user.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer getCustById(Long id) {
		return customerRepository.findById(id).get();
	}

	public Customer getAccountByEmail(String email) {
		return customerRepository.getByEmail(email);
	}
}
