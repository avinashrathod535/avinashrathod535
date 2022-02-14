package com.pathlock.sboot.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pathlock.sboot.Model.Student;

@RestController
public class HomeController {

	@GetMapping("/")
	public ArrayList<Student> m1() {
		ArrayList al = new ArrayList();
		al.add(new Student(101, "Avinash", 98, "Pune"));
		al.add(new Student(105, "Sapana", 88, "Pune"));
		al.add(new Student(104, "Dugu", 93, "Pune"));

		return al;
	}

}
