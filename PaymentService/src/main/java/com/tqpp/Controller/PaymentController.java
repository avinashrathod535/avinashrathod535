package com.tqpp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tqpp.Model.Payment;
import com.tqpp.Service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController
{
	@Autowired
	private PaymentService payservice;
	
	@PostMapping("/makePayment")
	public Payment makePayment(@RequestBody Payment payment)
	{
		System.out.println("*************Controller payment executed");
	 return payservice.makePayment(payment);
	}

}
