package com.ecommerce.ui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ui.model.Item;
import com.ecommerce.ui.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@GetMapping(value="/items/{page}")
	public List<Item> getAllItems(@PathVariable("page")Integer pageNo){
		return itemService.getAllItems(pageNo);
	}
	
	@GetMapping(value="/items")
	public List<Item> getAllItems(){
		return itemService.getAllItems();
	}
}
