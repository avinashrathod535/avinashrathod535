package com.think.Dao;

import java.util.List;

import com.think.Model.Cart;




public interface CartDao {
	
	boolean addToCart(int cartid);
	List<Cart>myCart(String brand);
	boolean deletefromcart(int cartid);

}
