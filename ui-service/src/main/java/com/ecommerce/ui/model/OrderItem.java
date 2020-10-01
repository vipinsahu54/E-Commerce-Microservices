package com.ecommerce.ui.model;

public class OrderItem {

	private Long id;
	private int qty;
	private Long itemid;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Long getItemid() {
		return itemid;
	}
	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", qty=" + qty + ", itemid=" + itemid + "]";
	}
	
	
}
