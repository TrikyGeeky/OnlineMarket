package com.nexeo.market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexeo.market.model.Product;
import com.nexeo.market.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product getProductByBarcode(Long barcode) {
		return productRepository.getProductByBarcode(barcode);
	}
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
}
