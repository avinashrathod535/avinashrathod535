package com.tqpp.Controller;

import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tqpp.Service.ProductService;
import com.tqpp.model.Product;

@RequestMapping("/product")
public class ProductController 
{
	private ProductService pserv;
	
	@GetMapping("/products")
	public List<Product> getAllProduct()
	{
		return pserv.getAllProducts();
	}

}
