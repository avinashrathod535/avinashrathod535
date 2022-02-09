package com.pathlock;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pathlock.Model.Student;

@Controller

public class HomeController {

	
	@GetMapping("/avinash")
	public String m1(HttpServletRequest req,Model m)
	{
		
		System.out.println("innnnnnnnnnnnn");
		String nm=req.getParameter("sname");
		int per=Integer.parseInt(req.getParameter("percent"));
		m.addAttribute("username", nm);
		return "two";  //view
	}
	
	
	@PostMapping("/sapana")
	public ModelAndView m2(@RequestParam("sname") String nm,@RequestParam("percent") int p,@RequestParam("city") String c)
	{
		
		ArrayList<Student> al=new ArrayList<Student>();
		
		Student s1=new Student(1, nm, p, c);
		al.add(s1);
		al.add(new Student(2,"Avinash",90,"Pune"));
		al.add(new Student(2,"Sapana",90,"Mumbai"));
		
		
		ModelAndView mv=new ModelAndView("two");
		mv.addObject("studentlist", al);
		return mv;
	}
	
	
	@ResponseBody
	@PostMapping("/hi")
	public String m3()
	{
		return "Good Evening";
	}
	
	
	
	@PostMapping("/hello")
	public ModelAndView m4(@RequestParam Map<String,String> map)
	{
		Student s1=new Student(1,map.get("sname"),Integer.parseInt(map.get("percent")),map.get("city"));
		ModelAndView mv=new ModelAndView("two");
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		mv.addObject("studentlist", al);
		return mv;
	}
	
	
	
	@PostMapping("/add")
	public ModelAndView  m5(@ModelAttribute("stud") Student s1)
	{
		ModelAndView mv=new ModelAndView("two");
		mv.addObject("stud",s1);
		return mv;
	}
}
