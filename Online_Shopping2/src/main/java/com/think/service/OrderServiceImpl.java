package com.think.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.think.Dao.OrderDao;
import com.think.Model.Orders;

@Service
public class OrderServiceImpl implements OrderService {
	
	
    @Autowired
	private OrderDao odao;
	
	@Override
	public Orders placedOrder(Orders ord) {
		// TODO Auto-generated method stub
		return odao.placedOrder(ord);
	}

	@Override
	public List<Orders> myorders(int  userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cancelOrder(int userid) {
		// TODO Auto-generated method stub
		return odao.cancelOrder(userid);
	}

}
