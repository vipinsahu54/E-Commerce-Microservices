package com.ecommerce.ui.dto;

import java.util.Date;

import com.ecommerce.ui.model.Account;
import com.ecommerce.ui.model.Address;

public class CustomerDto {
	
	private Long id;
	private String firstName;
	private String lastName;
	private Date dob;
	private String gender;
	private Long mobileNumber;
	private String email;
	
	private Account account;
	
	private CartDto cart;
	
	private Address address;
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}

	

	public CartDto getCart() {
		return cart;
	}


	public void setCart(CartDto cart) {
		this.cart = cart;
	}

	

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", gender=" + gender + ", mobileNumber=" + mobileNumber + "]";
	}
	
}
