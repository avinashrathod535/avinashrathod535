package com.think.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.think.Dao.CartDao;
import com.think.Model.Cart;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired 
	private CartDao cdao;

	@Override
	public boolean addToCart(int cartid) {
		// TODO Auto-generated method stub
		return cdao.addToCart(cartid);
	}

	@Override
	public List<Cart> myCart(String brand) {
		// TODO Auto-generated method stub
		return cdao.myCart(brand);
	}

	@Override
	public boolean deletefromcart(int cartid) {
		// TODO Auto-generated method stub
		return cdao.deletefromcart(cartid);
	}

}
