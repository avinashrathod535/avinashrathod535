package com.inherit;

import javax.persistence.Entity;

@Entity
public class VisitingTeacher extends Teacher {
	private int hrs, rate;

	public VisitingTeacher(int hrs, int rate) {
		super();
		this.hrs = hrs;
		this.rate = rate;
	}

	public VisitingTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VisitingTeacher(int tid, String tname,int hrs,int rate) {
		super(tid, tname);
		this.hrs=hrs;
		this.rate=rate;
		
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "VisitingTeacher [hrs=" + hrs + ", rate=" + rate + "]";
	}

}
