package com.tqpp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tqpp.Model.Payment;

public interface PaymentDao extends JpaRepository<Payment,Integer>
{

}
