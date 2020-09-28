package com.ecommerce.ui.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.ui.model.Order;


@FeignClient(value="ORDER-SERVICE")
public interface OrderService {
	
	@PostMapping("/order")
	public Order save(@RequestBody Order order);
	
	@GetMapping("/order/{id}")
	public Order getById(@PathVariable("id") Long id);

}
