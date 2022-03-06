package com.think.Dao;

import java.util.List;

import com.think.Model.Cart;
import com.think.Model.Login;



public interface LoginDao {
	
	
	boolean addToCart(int cartid );
	List<Cart>myCart(String brand);
	boolean deletefromcart(int cartid);
	Login getUserByNameAndPassword(String name,String password);

}
