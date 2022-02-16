package com.pathlock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathlock.Model.Employee;
import com.pathlock.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao edao;
	

	@Override
	public void insertEmployee(Employee e) {
		edao.save(e);
	}

	@Override
	public boolean deleteEmployeeById(int sid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployee(Employee s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return edao.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeeByDeptName(String d) {
		// TODO Auto-generated method stub
		return edao.getEmployeeByDeptName(d);
	}

}
