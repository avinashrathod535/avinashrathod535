package com.think.Model;

public class Login {
	
	private String uname;
	private String upass;
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(String uname, String upass) {
		super();
		this.uname = uname;
		this.upass = upass;
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
		return "Login [uname=" + uname + ", upass=" + upass + "]";
	}
	
	

}
