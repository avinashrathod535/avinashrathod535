package com.think.Dao;

import java.util.List;

import com.think.Model.Product;

public interface ProductDao {
	

	boolean addMobile(Product mobileobj);
	boolean updateProduct(Product obj);
	boolean deleteMobile(Product P);
	boolean updateMobile(Product mobileobj);
	Product SearchMobileById(int mobileid);

	List <Product> ShowMobileList();
	Product getMobileById(int mobileid);
	Product getMobilePrice(int mobileid);

	List<Product>searchMobileByColour(String mobilecolour);
	List<Product>searchMobileByBrand(String mobilebrand);
	


}
