package com.think.Dao;

import java.util.List;

import com.think.Model.Orders;



public interface OrderDao {
	
	Orders placedOrder(Orders ord);
	List<Orders>myorders(int userid);
	boolean cancelOrder(int userid);

}
