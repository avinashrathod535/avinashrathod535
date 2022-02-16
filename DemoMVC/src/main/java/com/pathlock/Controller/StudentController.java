package com.pathlock.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pathlock.Model.Student;
import com.pathlock.dao.StudentDao;

@Controller
public class StudentController
{
	@Autowired
	private StudentDao sdao;
	
	@GetMapping("/students")
	public ModelAndView m1()
	{
		List<Student> lst=sdao.findAll();
		ModelAndView mv=new ModelAndView("view");
		mv.addObject("studlist",lst);
		
		
		return mv;
	}
}
//logging
//microservices
