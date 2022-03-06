package com.think.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.think.Model.Cart;
import com.think.Model.Login;

@Repository
@Transactional
public class LoginDaoImpl implements LoginDao{

	@Autowired
	private SessionFactory sessionfactory;
	@Override
	public boolean addToCart(int cartid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cart> myCart(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deletefromcart(int cartid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Login getUserByNameAndPassword(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

