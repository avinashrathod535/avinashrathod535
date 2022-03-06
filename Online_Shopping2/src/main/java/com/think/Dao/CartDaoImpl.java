package com.think.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.think.Model.Cart;
import com.think.Model.Orders;

@Transactional
@Repository
public class CartDaoImpl implements CartDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public boolean addToCart(int cartid) {
		sessionFactory.getCurrentSession().save(cartid);
		return true;
	}

	@Override
	public List<Cart> myCart(String brand) {
		Query<Cart> q=sessionFactory.getCurrentSession().createQuery("from Cart");
		List<Cart> lst=q.list();
		return lst;
		
	
	}

	@Override
	public boolean deletefromcart(int cartid) {
		sessionFactory.getCurrentSession().delete(cartid);
		return true;
	}

}
