package com.think.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue
	private int  orderid;
	private double orderprice;
	private String orderdate;
	private String orderstatus;
	

	@OneToOne
	@JoinColumn(name="userid")
	private User user;
	
	@OneToMany(mappedBy ="orders")
	private List<Order_Details> orderdetails =new ArrayList<>();

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(int orderid, double orderprice, String orderdate, String orderstatus, User user,
			List<Order_Details> orderdetails) {
		super();
		this.orderid = orderid;
		this.orderprice = orderprice;
		this.orderdate = orderdate;
		this.orderstatus = orderstatus;
		this.user = user;
		this.orderdetails = orderdetails;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public double getOrderprice() {
		return orderprice;
	}

	public void setOrderprice(double orderprice) {
		this.orderprice = orderprice;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	public String getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Order_Details> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<Order_Details> orderdetails) {
		this.orderdetails = orderdetails;
	}

	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", orderprice=" + orderprice + ", orderdate=" + orderdate
				+ ", orderstatus=" + orderstatus + ", user=" + user + ", orderdetails=" + orderdetails + "]";
	} 
	
	

	
}
