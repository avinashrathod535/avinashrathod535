package com.tqpp.Service;

import java.util.List;

import com.tqpp.model.Product;

public interface ProductService 
{
	boolean insertProduct(Product s);

	boolean deleteProduct(Product s);

	boolean updateProduct(Product s);

	List<Product> getAllProducts();

	Product getProductById(int id);

}
