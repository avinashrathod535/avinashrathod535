package com.think.service;

import java.util.List;

import com.think.Model.Product;


public interface ProductService {
	boolean addMobile(Product mobileobj);
	boolean updateProduct(Product obj);
	boolean updateMobile(Product mobileobj);

	boolean deleteMobile(Product P);
	List <Product> ShowMobileList();
	Product SearchMobileById(int mobileid);
	List<Product>searchMobileByColour(String mobilecolour);
	List<Product>searchMobileByBrand(String mobilebrand);
	Product getMobileById(int mobileid);
	Product getMobilePrice(int mobileid);

}
