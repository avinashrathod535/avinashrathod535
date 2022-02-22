package com.think.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.think.Model.Mobile;

import com.think.service.MobileService;


@Controller
public class MobileController {
	
	@Autowired
	private MobileService mservice;
	
	@GetMapping("/")
	public ModelAndView m1() {
		List<Mobile> lst=mservice.ShowMobileList();
		ModelAndView mv=new ModelAndView("Showmobile");
		mv.addObject("mobilelist",lst);
		return mv;
		
	}

}
