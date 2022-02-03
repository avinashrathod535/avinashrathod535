package com.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Stud")
public class Student {
	@Id
	@GeneratedValue // Auto increment
	private int sid;
	@Column(name = "studentname", nullable = false)
	private String sname;
	@Column(name = "percent", nullable = true, length = 45)
	private int percent;
	@Transient
	private String hobby;
	@Embedded
	private Address address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, int percent, String hobby, Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.percent = percent;
		this.hobby = hobby;
		this.address = address;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", percent=" + percent + ", hobby=" + hobby + ", address="
				+ address + "]";
	}

}
