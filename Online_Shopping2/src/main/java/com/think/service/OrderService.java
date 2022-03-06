package com.think.service;

import java.util.List;

import com.think.Model.Orders;

public interface OrderService {
	
	Orders placedOrder(Orders ord);
	List<Orders>myorders(int userid);
	boolean cancelOrder(int userid);

}
