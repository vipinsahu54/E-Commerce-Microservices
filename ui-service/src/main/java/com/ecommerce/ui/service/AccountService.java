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
		Customer customer = userService.getAccountByEmail(login.getUsername());
		if(customer.getAccount().getPassword().equals(login.getPassword()))
			return true;
		return false;
	}
}
