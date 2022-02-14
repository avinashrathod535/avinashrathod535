package com.pathlock.sboot.Model;

public class Student {

	private int eid;
	private String ename;
	private int percent;
	private String city;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int eid, String ename, int percent, String city) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.percent = percent;
		this.city = city;
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
		return "Employee [eid=" + eid + ", ename=" + ename + ", percent=" + percent + ", city=" + city + "]";
	}

}
