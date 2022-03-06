package com.think.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.think.Model.Order_Details;
import com.think.Model.Orders;

@Transactional
@Repository
public class OrderDaoImpl implements OrderDao{
	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public Orders placedOrder(Orders ord) {
	  sessionfactory.getCurrentSession().save(ord);
	  List<Order_Details> list=ord.getOrderdetails();
	  for(Order_Details o:list) {
		  sessionfactory.getCurrentSession().save(o);
	  }
		return null;
	}

	@Override
	public List<Orders> myorders(int userid) {
		Query<Orders> q=sessionfactory.getCurrentSession().createQuery("from Order");
		List<Orders> lst=q.list();
		return lst;
	}

	@Override
	public boolean cancelOrder(int userid) {
	   sessionfactory.getCurrentSession().delete(userid);
		return true;
	}

}
