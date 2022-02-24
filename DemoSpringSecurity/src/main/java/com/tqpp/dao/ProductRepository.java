package com.tqpp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tqpp.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> 
{

}
