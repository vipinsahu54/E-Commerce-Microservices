package com.ecommerce.item.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.item.model.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
