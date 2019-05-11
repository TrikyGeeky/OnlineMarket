package com.nexeo.market.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nexeo.market.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	public Product getProductByBarcode(Long barcode);
	public List<Product> getProductByName(String name);
	
}