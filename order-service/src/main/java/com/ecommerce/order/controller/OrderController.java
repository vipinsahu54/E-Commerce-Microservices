package com.ecommerce.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.order.model.Order;
import com.ecommerce.order.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping("/order")
	public Order save(@RequestBody Order order) {
		return orderService.save(order);
	}
	
	@GetMapping("/order/{id}")
	public Order getById(@PathVariable("id") Long id) {
		return orderService.getById(id);
	}
}
