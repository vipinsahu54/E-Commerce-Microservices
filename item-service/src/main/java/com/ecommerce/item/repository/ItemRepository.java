package com.ecommerce.item.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ecommerce.item.model.Item;


public interface ItemRepository extends PagingAndSortingRepository<Item, Long>{

}
