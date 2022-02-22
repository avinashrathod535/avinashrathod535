package com.tqpp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.tqpp.Model.Order;
import com.tqpp.dao.OrderDao;
import com.tqpp.dto.Payment;
import com.tqpp.dto.TransactionRequest;
import com.tqpp.dto.TransactionResponse;

@Service
public class OrderService
{
@Autowired
private OrderDao orderdao;

@Autowired
private RestTemplate restTemplate;

public TransactionResponse saveOrder(TransactionRequest tr)
{
	Order order=tr.getOrder();
	Payment payment=tr.getPayment();
	orderdao.save(order);
	payment.setOrderid(order.getOrderNo());
	payment.setAmount(order.getPrice());
	System.out.println("*********************************1111");
	//Payment payresponse=restTemplate.postForObject("http://localhost:8084/payment/makePayment", payment,Payment.class);
	Payment payresponse=restTemplate.postForObject("http://PAYMENT-SERVICE/payment/makePayment", payment,Payment.class);
	String response;
	if(payresponse.getStatus().equals("Successful"))
		response="Payment successfull and order placed";
	else
		response="Payment failed";
	
	return new TransactionResponse(order,payresponse.getAmount(),payresponse.getTransactionId(),response);
	
}

}
//eureka server --serviceregistry 
//eureka client--microservices eureka client()