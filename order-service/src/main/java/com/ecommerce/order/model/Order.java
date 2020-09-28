package com.ecommerce.order.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String orderid;
	private String paymentType;
	private int totalAmount;
	private int discount;
	
	private Long offerid;
	
	private Long cartid;

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

	public Long getCartid() {
		return cartid;
	}

	public void setCartid(Long cartid) {
		this.cartid = cartid;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderid=" + orderid + ", paymentType=" + paymentType + ", totalAmount="
				+ totalAmount + ", discount=" + discount + ", offerid=" + offerid + ", cartid=" + cartid + "]";
	}

}
