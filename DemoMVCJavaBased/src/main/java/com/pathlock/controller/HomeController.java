package com.pathlock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
	
	@GetMapping("/path")
	public String  m1() {
		
		
		return "Welcome";
		
	}

}
