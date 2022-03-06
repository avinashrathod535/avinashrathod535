package com.think.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	@GeneratedValue
	private int aid;
	private String uname;
	private String upass;
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Admin(int aid, String uname, String upass) {
		super();
		this.aid = aid;
		this.uname = uname;
		this.upass = upass;
	}


	public int getAid() {
		return aid;
	}


	public void setAid(int aid) {
		this.aid = aid;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getUpass() {
		return upass;
	}


	public void setUpass(String upass) {
		this.upass = upass;
	}


	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", uname=" + uname + ", upass=" + upass + "]";
	}
	
	

}
