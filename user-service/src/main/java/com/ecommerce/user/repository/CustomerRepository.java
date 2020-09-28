package com.ecommerce.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.user.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	public Customer getByEmail(String email);

}
