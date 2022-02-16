package com.pathlock.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pathlock.Model.Employee;
import com.pathlock.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService eservice;

	@PostMapping("/emp")
	public void addEmployee(@RequestBody Employee ob) {
		
		eservice.insertEmployee(ob);
	}
	
	@GetMapping("/employees")
	public List<Employee> getAll(){
		
		return eservice.getAllEmployees();
	}
	@GetMapping("/employees/dept/{dname}")
	public List<Employee> getByDeptName(@PathVariable String dname){
		return eservice.getEmployeeByDeptName(dname);
	}

}
