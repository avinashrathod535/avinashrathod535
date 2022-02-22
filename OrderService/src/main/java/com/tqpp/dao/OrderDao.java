package com.tqpp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tqpp.Model.Order;

public interface OrderDao extends JpaRepository<Order,Integer> {

}
