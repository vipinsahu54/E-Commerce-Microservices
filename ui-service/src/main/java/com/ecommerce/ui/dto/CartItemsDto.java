package com.ecommerce.ui.dto;

import com.ecommerce.ui.model.Item;

public class CartItemsDto {

	private Long id;
	
	private int quantity;
	
	private Item item;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
}
