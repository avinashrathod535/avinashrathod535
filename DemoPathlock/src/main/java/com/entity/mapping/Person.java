package com.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int adharcardno;
	private String name;
	private long mobile;
	
	@OneToOne
	private Vehicle vehicle;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int adharcardno, String name, long mobile, Vehicle vehicle) {
		super();
		this.adharcardno = adharcardno;
		this.name = name;
		this.mobile = mobile;
		this.vehicle = vehicle;
	}
	public int getAdharcardno() {
		return adharcardno;
	}
	public void setAdharcardno(int adharcardno) {
		this.adharcardno = adharcardno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "Person [adharcardno=" + adharcardno + ", name=" + name + ", mobile=" + mobile + ", vehicle=" + vehicle
				+ "]";
	}
	

}
