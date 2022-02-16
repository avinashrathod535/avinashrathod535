package com.pathlock.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pathlock.Model.Student;

public interface StudentDao extends JpaRepository<Student,Integer>
{

}
