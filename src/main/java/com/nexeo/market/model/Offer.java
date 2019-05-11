package com.nexeo.market.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Offer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer	id;
	private Product product;
	private Integer quantity;
	private Double	salesAmount;
	
	public Offer() {}
	
	public Offer(Product product, Integer quantity, Double salesAmount) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.salesAmount = salesAmount;
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
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}
	
	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the salesAmount
	 */
	public Double getSalesAmount() {
		return salesAmount;
	}
	/**
	 * @param salesAmount the salesAmount to set
	 */
	public void setSalesAmount(Double salesAmount) {
		this.salesAmount = salesAmount;
	}
	
	
}
