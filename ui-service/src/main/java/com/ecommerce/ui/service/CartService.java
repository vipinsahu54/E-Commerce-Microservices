package com.ecommerce.ui.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.ui.model.Cart;

@FeignClient(value="CART-SERVICE")
public interface CartService {

	@GetMapping(value="/cart")
	public Cart addItem(@RequestParam("cartid") Long cartId, @RequestParam("itemid")Long itemId, @RequestParam("quantity")Integer qty);
	
	@GetMapping(value="/cart/{id}")
	public Cart getCartById(@PathVariable("id") Long cartId);
	
	@PostMapping("/cart")
	public void save(@RequestBody Cart cart);
	
	@DeleteMapping("/cart")
	public void delete(@RequestBody Cart cart);
}
