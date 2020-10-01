package com.ecommerce.ui.model;

import java.util.List;

public class Order {

private Long id;
	
	private String orderid;
	private String paymentType;
	private int totalAmount;
	private int discount;
	private Long offerid;
	
	private List<OrderItem> items;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	
	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public Long getOfferid() {
		return offerid;
	}

	public void setOfferid(Long offerid) {
		this.offerid = offerid;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderid=" + orderid + ", paymentType=" + paymentType + ", totalAmount="
				+ totalAmount + ", discount=" + discount + ", offerid=" + offerid + ", items=" + items + "]";
	}


}
