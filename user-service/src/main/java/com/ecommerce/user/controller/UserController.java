package com.ecommerce.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.user.model.Customer;
import com.ecommerce.user.service.CustomerService;

@RestController
public class UserController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/user/{id}")
	public Customer getCustById(@PathVariable("id")Long id) {
		return customerService.getCustById(id);
	}
	
	@GetMapping("/user/email/{email}")
	public Customer getAccountByEmail(@PathVariable("email")String email) {
		return customerService.getAccountByEmail(email);
	}
}
