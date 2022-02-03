package com.pathlock;

public class Student {
	private int sid;
	private String sname;
	private int percent;
	private Course course;
	private Trainer trainner;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, int percent, Course course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.percent = percent;
		this.course = course;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Trainer getTrainner() {
		return trainner;
	}

	public void setTrainner(Trainer trainner) {
		this.trainner = trainner;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", percent=" + percent + ", course=" + course
				+ ", trainner=" + trainner + "]";
	}

}
