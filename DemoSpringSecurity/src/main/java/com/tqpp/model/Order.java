package com.tqpp.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "order_header")
public class Order
{
	@Id
    @GeneratedValue
    private Integer orderId;
    private LocalDate orderDate;
    private String order_status;
    
    @ManyToOne
    @JoinColumn(name ="user_id")
    private User user;
    
    @OneToMany(mappedBy = "order")
    private List<OrderDetails> orderdetails = new ArrayList<>();

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<OrderDetails> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<OrderDetails> orderdetails) {
		this.orderdetails = orderdetails;
	}

	public Order(Integer orderId, LocalDate orderDate, String order_status, User user,
			List<OrderDetails> orderdetails) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.order_status = order_status;
		this.user = user;
		this.orderdetails = orderdetails;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}

