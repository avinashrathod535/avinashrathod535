package com.think.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Order_Details {

	@Id
	@GeneratedValue
	private int transactionId;
	
	public Order_Details( Orders orders, Product product,int qty) {
		super();
		this.qty = qty;
		this.orders = orders;
		this.product = product;
	}

	private int qty;

	@ManyToOne
	@JoinColumn(name="orderid")
	private Orders orders;
	
	@ManyToOne
	@JoinColumn(name="mobileid")
	private Product product;

	public Order_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Order_Details(int transactionId, int qty, Orders orders, Product product) {
		super();
		this.transactionId = transactionId;
		this.qty = qty;
		this.orders = orders;
		this.product = product;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Order_Details [transactionId=" + transactionId + ", qty=" + qty + ", orders=" + orders + ", product="
				+ product + "]";
	}
	
	

}
