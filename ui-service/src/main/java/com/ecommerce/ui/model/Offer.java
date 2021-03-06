package com.ecommerce.ui.model;

public class Offer {

	private Long id;
	
	private String name;
	private String terms;
	private int percentage;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Offer [id=" + id + ", name=" + name + ", terms=" + terms + ", percentage=" + percentage + "]";
	}
	
}
