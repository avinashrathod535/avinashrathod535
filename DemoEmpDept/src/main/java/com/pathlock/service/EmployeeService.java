package com.pathlock.service;

import java.util.List;

import com.pathlock.Model.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployeeByDeptName(String d);
	
	void insertEmployee(Employee e);

	boolean deleteEmployeeById(int sid);

	boolean updateEmployee(Employee e);

	List<Employee> getAllEmployees();

	Employee getEmployeeById(int id);

}
