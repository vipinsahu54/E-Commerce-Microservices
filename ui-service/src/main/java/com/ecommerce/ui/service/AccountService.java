package com.ecommerce.ui.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ui.model.Customer;
import com.ecommerce.ui.model.Login;


@Service
public class AccountService {
	
	@Autowired
	private UserService userService;
	
	
	public boolean validateUser(Login login) {
		System.out.println(login);
		Customer customer = userService.getAccountByEmail(login.getUsername());
		System.out.println(customer);
		if(customer.getAccount().getPassword().equals(login.getPassword()))
			return true;
		return false;
	}
}
