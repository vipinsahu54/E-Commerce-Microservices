package com.ecommerce.ui.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ui.dto.CartDto;
import com.ecommerce.ui.dto.CartItemsDto;
import com.ecommerce.ui.model.Cart;
import com.ecommerce.ui.model.CartItems;

@Service
public class CartModelService {

	@Autowired
	private ItemService itemService;

	public CartDto getCart(Cart cart) {
		List<CartItems> items = cart.getItems();
		CartDto cartdto= new CartDto();
		List<CartItemsDto> itemList=new ArrayList<>();
		cartdto.setId(cart.getId());
		for (CartItems cartItems : items) {
			CartItemsDto cartItemsDto=new CartItemsDto();
			cartItemsDto.setId(cartItems.getId());
			cartItemsDto.setQuantity(cartItems.getQuantity());
			cartItemsDto.setItem(itemService.getById(cartItems.getItemid()));
			
			itemList.add(cartItemsDto);
		}
		cartdto.setItems(itemList);
		return cartdto;
	}
}
