package com.pathlock;

public class Course {
	
	private String coursename;
	private int fee;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String coursename, int fee) {
		super();
		this.coursename = coursename;
		this.fee = fee;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Course [coursename=" + coursename + ", fee=" + fee + "]";
	}
	
	

}
