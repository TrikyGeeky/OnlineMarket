package com.nexeo.market.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexeo.market.model.Offer;
import com.nexeo.market.model.Product;

public interface OfferRepository extends JpaRepository<Offer, Integer>{

	public List<Offer> getOfferByProduct(Product product);
	
}
