package com.pathlock.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pathlock.Model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	@Query(value ="select * from employee e inner join department d on e.deptid=d.deptid and department_name=:d",nativeQuery =true )
	public List<Employee> getEmployeeByDeptName(@Param("d") String dname);
	
}
