package com.nexeo.market.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Long	barcode;
	private String 	name;
	private Double	price;
	
	public Product(String name, double price) {
		this.name 	= name;
		this.price 	= price;
	}
	

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the barcode
	 */
	public Long getBarcode() {
		return barcode;
	}


	/**
	 * @param barcode the barcode to set
	 */
	public void setBarcode(Long barcode) {
		this.barcode = barcode;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		final int prime = 11;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		else if (obj == null)
			return false;
		else {
			Product product = (Product) obj;
			return this.name.equals(product.getName());
		}
	}
	
}
