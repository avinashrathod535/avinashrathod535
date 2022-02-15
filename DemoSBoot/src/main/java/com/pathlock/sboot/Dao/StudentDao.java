package com.pathlock.sboot.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pathlock.sboot.Model.Student;

public interface StudentDao extends JpaRepository<Student,Integer>{
	
	public List<Student> findByCity(String city);
	public List<Student> findByPercentGreaterThan(int percent);

}
