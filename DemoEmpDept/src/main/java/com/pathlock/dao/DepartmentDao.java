package com.pathlock.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pathlock.Model.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer>{

}
