package com.tqpp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private Integer productId;
	private String name;
	private Double price;
	private String description;
	private Integer stockInHand;
	
	public Product(Integer id, String name, Double price, String description, Integer stockInHand) {
		super();
		this.productId = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.stockInHand = stockInHand;
	}
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}




	
	public Integer getProductId() {
		return productId;
	}


	public void setProductId(Integer productId) {
		this.productId = productId;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getStockInHand() {
		return stockInHand;
	}
	public void setStockInHand(Integer stockInHand) {
		this.stockInHand = stockInHand;
	}
	
	

}
