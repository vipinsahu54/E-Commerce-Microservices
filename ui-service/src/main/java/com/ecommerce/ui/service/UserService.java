package com.ecommerce.ui.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ecommerce.ui.model.Customer;


@FeignClient(value="USER-SERVICE")
public interface UserService {

	@GetMapping("/user/{id}")
	public Customer getCustById(@PathVariable("id")Long id);
	
	@GetMapping("/user/email/{email}")
	public Customer getAccountByEmail(@PathVariable("email")String email);
	
}
