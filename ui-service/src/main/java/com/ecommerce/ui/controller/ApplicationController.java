package com.ecommerce.ui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.ui.model.Customer;
import com.ecommerce.ui.service.ItemService;
import com.ecommerce.ui.service.UserService;

@RestController
public class ApplicationController {
	
	@Autowired
	private ItemService itemService;

	@Autowired
	private UserService customerService;
	
	@GetMapping({"/","/index"})
	public ModelAndView getIndex(HttpServletRequest request) {
		ModelAndView model=new ModelAndView();
		HttpSession session = request.getSession();
		if(session.getAttribute("userid") != null) {
			long customerId = (Long)session.getAttribute("userid");
			Customer customer = customerService.getCustById(customerId);
			
			model.addObject("username",customer.getAccount().getUsername());
		}
		model.addObject("items", itemService.getAllItems(0));
		model.addObject("pages", 1);
		model.setViewName("index");
		return model;
	}
	
	@GetMapping("/indexs")
	public ModelAndView getIndexByPage(@RequestParam("page")Integer pages, HttpServletRequest request) {
		ModelAndView model=new ModelAndView();
		HttpSession session = request.getSession();
		if(session.getAttribute("userid") != null) {
			long customerId = (Long)session.getAttribute("userid");
			Customer customer = customerService.getCustById(customerId);
			
			model.addObject("username",customer.getAccount().getUsername());
		}
		model.addObject("items", itemService.getAllItems(pages));
		model.addObject("pages", newPageNumber(pages));
		model.setViewName("index");
		return model;
	}
	
	private int newPageNumber(Integer page) {
		Integer newPage=page+1;
		
		int size = itemService.getAllItems(newPage).size();
		if(size==0)
			newPage=0;
		return newPage;
	}
	
}
