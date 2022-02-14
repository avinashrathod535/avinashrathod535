package com.pathlock.demo.Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pathlock.Model.Student;

@RestController
public class HomeController {

	@GetMapping("/")
	public ArrayList<Student> m1() {
		ArrayList al = new ArrayList();
		al.add(new Student(101, "Amol", 90, "Pune"));
		al.add(new Student(105, "Avinash", 78, "Nashik"));
		al.add(new Student(104, "Dugu", 93, "Mumbai"));

		return al;
	}
}
