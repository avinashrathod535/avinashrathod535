package com.entity.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DeptManytoOne {
	@Id
	private int did;
	private String dname;

	public DeptManytoOne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeptManytoOne(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;

	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "DeptManytoOne [did=" + did + ", dname=" + dname + ", emplist=" + "]";
	}

}
