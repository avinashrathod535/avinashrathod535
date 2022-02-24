package com.tqpp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tqpp.dao.ProductRepository;
import com.tqpp.model.Product;

@Controller
public class UserController 
{

	
	
		
	@ResponseBody
	@GetMapping("/")
	public String login()
	{
	 return "welcome to my first Spring Security program.";	
	}
	
	
	
}
