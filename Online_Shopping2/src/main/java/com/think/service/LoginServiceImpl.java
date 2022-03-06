package com.think.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.think.Dao.LoginDao;
import com.think.Model.Cart;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDao ldao;
	
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
	
	

	
}
