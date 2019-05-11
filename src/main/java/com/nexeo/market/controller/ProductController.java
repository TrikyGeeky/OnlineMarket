package com.nexeo.market.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nexeo.market.model.Product;
import com.nexeo.market.service.ProductService;

@Controller
@RequestMapping(path = "/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping(path = "/add")
	public ResponseEntity<Product> addProduct (@RequestParam Product product){
		Product persistedProduct = productService.saveProduct(product);
		if (persistedProduct != null)
			return ResponseEntity.ok().body(persistedProduct);
		else return ResponseEntity.unprocessableEntity().build();
	}
	
	@GetMapping(path = "/getProduct/{barcode}")
	public ResponseEntity<Product> getProduct(@PathVariable("barcode") Long barcode) {
		Product product = productService.getProductByBarcode(barcode);
		return ResponseEntity.ok().body(product);
	}
	
	@GetMapping(path = "/all")
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> products = productService.getAllProducts();
		return ResponseEntity.ok().body(products);
	}
}
