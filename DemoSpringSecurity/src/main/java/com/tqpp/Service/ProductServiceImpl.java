package com.tqpp.Service;

import java.util.List;

import com.tqpp.dao.ProductRepository;
import com.tqpp.model.Product;

public class ProductServiceImpl implements ProductService
{
	private ProductRepository prepo;

	@Override
	public boolean insertProduct(Product p) {
		prepo.save(p);
		return true;
	}

	@Override
	public boolean deleteProduct(Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
