package com.think.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.think.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService oservice;
	
	

}
