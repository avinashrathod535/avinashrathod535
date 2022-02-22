package com.tqpp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tqpp.dto.TransactionRequest;
import com.tqpp.dto.TransactionResponse;
import com.tqpp.service.OrderService;

//http://localhost:9090/order/bookOrder
@RestController
@RequestMapping("/order")

public class OrderController 
{
	
	@Autowired
	private OrderService oservice;
	
	
	@PostMapping("/bookOrder")
	public TransactionResponse addOrder(@RequestBody TransactionRequest tr)
	{
		return oservice.saveOrder(tr);
	}
}
