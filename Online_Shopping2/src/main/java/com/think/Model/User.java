package com.think.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="User_Details")
public class User {
	
	@Id
	@GeneratedValue
	private int userid;
	private String uname;
	private String uemail;	
	private String upass;
	private long phoneno;
	private String gender;
	private String address;
	@ManyToOne
	private Role role;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userid, String uname, String uemail, String upass, long phoneno, String gender, String address,
			Role role) {
		super();
		this.userid = userid;
		this.uname = uname;
		this.uemail = uemail;
		this.upass = upass;
		this.phoneno = phoneno;
		this.gender = gender;
		this.address = address;
		this.role = role;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", uname=" + uname + ", uemail=" + uemail + ", upass=" + upass + ", phoneno="
				+ phoneno + ", gender=" + gender + ", address=" + address + ", role=" + role + "]";
	}
	
	
	
}
