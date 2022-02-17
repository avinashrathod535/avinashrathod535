package com.pathlock.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pathlock.Model.Student;
import com.pathlock.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studservice;

	@GetMapping("/")
	public ModelAndView startpage() {
		List<Student> lst = studservice.getAllStudents();
		ModelAndView mv = new ModelAndView("view");
		mv.addObject("studlist", lst);
		return mv;
	}

	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("id") int id) {
		Student ob = studservice.getStudentById(id);
		if (ob != null)
			studservice.deleteStudent(ob);
		return "redirect:/";
	}

	@GetMapping("/add")
	public String AddNewStudent() {
		return "add";

	}

	@GetMapping("/save")
	public String saveStudent(@ModelAttribute("stud") Student s1, BindingResult results) throws Exception {
		if (results.hasErrors())
			throw new Exception("Please enter valid percentage");
		studservice.insertStudent(s1);
		return "redirect:/";
	}

	@ExceptionHandler(value = Exception.class)
	public String someexception(Exception e) {
		System.out.println("Errorr" + e);
		return "error";
	}

}
