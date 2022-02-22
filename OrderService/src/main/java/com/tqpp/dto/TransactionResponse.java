package com.tqpp.dto;

import com.tqpp.Model.Order;

public class TransactionResponse 
{
	private Order order;
	private int amt;
	private String transactionId;
	private String message;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public TransactionResponse(Order order, int amt, String transactionId, String message) {
		super();
		this.order = order;
		this.amt = amt;
		this.transactionId = transactionId;
		this.message = message;
	}
	public TransactionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
