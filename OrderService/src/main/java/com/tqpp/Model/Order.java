package com.tqpp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Orderr")
public class Order
{
	@Id
	@GeneratedValue
	private int orderNo;
	private String customername;
	private String itemname;
	private int qty;
	private int price;
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Order(int orderNo, String customername, String itemname, int qty, int price) {
		super();
		this.orderNo = orderNo;
		this.customername = customername;
		this.itemname = itemname;
		this.qty = qty;
		this.price = price;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", customername=" + customername + ", itemname=" + itemname + ", qty="
				+ qty + ", price=" + price + "]";
	}
	
	
	

}
