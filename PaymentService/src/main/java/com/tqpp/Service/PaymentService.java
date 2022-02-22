package com.tqpp.Service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.tqpp.Model.Payment;
import com.tqpp.dao.PaymentDao;

@Service
public class PaymentService 
{
@Autowired
private PaymentDao pdao;

public Payment makePayment(Payment payment)
{
	//dummy transactionid
	System.out.println("@@@@@@@@@@@@@@@@@@in pay service ");
	String transactionid=UUID.randomUUID().toString();
	payment.setTransactionId(transactionid);
	//dummy 
	boolean issuccess=new Random().nextBoolean();
	payment.setStatus(issuccess?"Successful":"Failed");
	pdao.save(payment);
	return payment;
}




}
