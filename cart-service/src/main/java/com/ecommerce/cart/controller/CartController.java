package com.ecommerce.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.cart.model.Cart;
import com.ecommerce.cart.service.CartService;

@RestController
public class CartController {

	@Autowired
	private CartService cartService;
	
	@GetMapping(value="/cart")
	public Cart addItem(@RequestParam("cartid") Long cartId, @RequestParam("itemid")Long itemId, @RequestParam("quantity")Integer qty) {
		return cartService.addItem(cartId, itemId, qty);
	}
	
	@GetMapping(value="/cart/{id}")
	public Cart getCartById(@PathVariable("id") Long cartId) {
		return cartService.getCartById(cartId);
	}
	
	@PostMapping("/cart")
	public void save(@RequestBody Cart cart) {
		cartService.save(cart);
	}
	
	@DeleteMapping("/cart")
	public void delete(@RequestBody Cart cart) {
		cartService.delete(cart);
	}
}
