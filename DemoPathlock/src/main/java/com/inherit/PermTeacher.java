package com.inherit;

import javax.persistence.Entity;

@Entity
public class PermTeacher extends Teacher {
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public PermTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PermTeacher(int tid, String tname,int salary) {
		super(tid, tname);
		this.salary=salary;
		
	}

	public PermTeacher(int salary) {
		super();
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PermTeacher [salary=" + salary + "]";
	}

}
