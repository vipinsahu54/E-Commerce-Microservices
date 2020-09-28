package com.ecommerce.ui.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ecommerce.ui.model.Item;


@FeignClient(value="ITEM-SERVICE")
public interface ItemService {

	@GetMapping(value="/items/{page}")
	public List<Item> getAllItems(@PathVariable("page")Integer pageNo);
	
	@GetMapping(value="/items")
	public List<Item> getAllItems();
	
	@GetMapping(value="/item/{id}")
	public Item getById(@PathVariable("id")Long id);
}
