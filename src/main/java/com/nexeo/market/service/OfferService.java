package com.nexeo.market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexeo.market.model.Offer;
import com.nexeo.market.model.Product;
import com.nexeo.market.repository.OfferRepository;

@Service
public class OfferService {
	
	@Autowired
	private OfferRepository offerRepository;
	
	public List<Offer> getOfferByProduct(Product product) {
		return offerRepository.getOfferByProduct(product);
	}
	
	public Offer saveOffer(Offer offer) {
		return offerRepository.save(offer);
	}
	
	public Offer getOfferById(Integer id) {
		return offerRepository.getOne(id);
	}

}
