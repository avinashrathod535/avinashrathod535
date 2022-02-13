package com.pathlock.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pathlock.Model.Student;
import com.pathlock.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@ResponseBody
	@GetMapping(value = "/students", produces = "application/json")
	public List<Student> getAllStudent() {
		return studentService.getAllStudents();
	}

	@ResponseBody
	@GetMapping(value = "/students/{rollno}/{hobby}")
	public Student getStudentById(@PathVariable("rollno") int id, @PathVariable("hobby") String hb) {

		return studentService.getStudentById(id);
	}

	@ResponseBody
	@PostMapping(value = "/students")
	public boolean addStudent(@RequestBody Student s) {
		System.out.println("******add******");
		studentService.insertStudent(s);
		return true;
	}

	@ResponseBody
	@DeleteMapping(value = "/students/{id}")
	public boolean deleteStudent(@PathVariable("id") int sid) {
		System.out.println("*****Delete*******");
		Student s1 = studentService.getStudentById(sid);
		studentService.deleteStudent(s1);
		return true;
	}

	@ResponseBody
	@PutMapping(value = "/students/{sid}")
	public boolean updateStudent(@PathVariable("sid") int sid, @RequestBody Student s) {
		System.out.println("******Update******");
		studentService.updateStudent(s);
		return true;
	}

	/*
	 * @ResponseBody
	 * 
	 * @GetMapping(value = "/", produces = "application/json") public
	 * ArrayList<Student> getStudent() {
	 * 
	 * ArrayList<Student> alist = new ArrayList<Student>(); Student s1 = new
	 * Student(1, "Avinash", 90, "Pune"); alist.add(s1); alist.add(new Student(2,
	 * "Sapana", 80, "Mumbai")); alist.add(new Student(3, "Dugu", 70, "Pune"));
	 * return alist; }
	 * 
	 * @ResponseBody
	 * 
	 * @GetMapping(value = "/", produces = "application/json") public
	 * HashMap<String, Student> m2() { HashMap<String, Student> hm = new
	 * HashMap<>(); hm.put("Ravi", new Student(2, "Ravi", 80, "Abad"));
	 * hm.put("Suraj", new Student(2, "Suraj", 90, "Pune"));
	 * 
	 * return hm; }
	 */

}
