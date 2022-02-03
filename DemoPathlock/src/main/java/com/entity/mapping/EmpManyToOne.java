package com.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EmpManyToOne {
	@Id
	private int eid;
	private String ename;

	@ManyToOne
	private DeptManytoOne dept;

	public EmpManyToOne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpManyToOne(int eid, String ename, DeptManytoOne dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public DeptManytoOne getDept() {
		return dept;
	}

	public void setDept(DeptManytoOne dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmpManyToOne [eid=" + eid + ", ename=" + ename + ", dept=" + dept + "]";
	}
	
	

}
