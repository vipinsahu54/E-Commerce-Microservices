package com.ecommerce.ui.dto;

import java.util.List;

public class CartDto {

	private Long id;
	
	private List<CartItemsDto> items;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<CartItemsDto> getItems() {
		return items;
	}

	public void setItems(List<CartItemsDto> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", items=" + items + "]";
	}
	
}
