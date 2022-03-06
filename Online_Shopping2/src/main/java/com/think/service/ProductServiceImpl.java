package com.think.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.think.Dao.ProductDao;
import com.think.Model.Product;

   


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao pdao;

	@Override
	public boolean addMobile(Product mobileobj) {
		// TODO Auto-generated method stub
		return pdao.addMobile(mobileobj);
	}

	@Override
	public boolean updateMobile(Product mobileobj) {
		// TODO Auto-generated method stub
		return pdao.updateMobile(mobileobj);
	}

	@Override
	public boolean deleteMobile(Product P) {
		
		return pdao.deleteMobile(P);
	}

	@Override
	public List<Product> ShowMobileList() {
		// TODO Auto-generated method stub
		return pdao.ShowMobileList();
	}

	@Override
	public Product SearchMobileById(int mobileid) {
		// TODO Auto-generated method stub
		return pdao.SearchMobileById(mobileid);
	}
	@Override
	public List<Product> searchMobileByColour(String mobilecolour) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Product> searchMobileByBrand(String mobilebrand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateProduct(Product obj) {
		// TODO Auto-generated method stub
		return pdao.updateProduct(obj);
	}

	@Override
	public Product getMobileById(int mobileid) {
		// TODO Auto-generated method stub
		return pdao.getMobileById(mobileid);
	}

	@Override
	public Product getMobilePrice(int mobileid) {
		// TODO Auto-generated method stub
		return pdao.getMobilePrice(mobileid);
	}



}
