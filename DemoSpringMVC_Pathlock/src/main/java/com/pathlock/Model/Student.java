package com.pathlock.Model;

import java.sql.Date;

public class Student {
	private int sid;
	private String sname;
	private int percent;
	private String city;
	
	public Student(int sid, String sname, int percent, String city) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.percent = percent;
		this.city = city;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", percent=" + percent + ", city=" + city + "]";
	}
	
	
	
}
