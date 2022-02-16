package com.pathlock.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	private int deptid;
	private String departmentName;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int deptid, String departmentName) {
		super();
		this.deptid = deptid;
		this.departmentName = departmentName;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", departmentName=" + departmentName + "]";
	}

}
