package com.ecommerce.item.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.item.model.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long>{

}
