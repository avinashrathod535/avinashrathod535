package com.tqpp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User 
{
@Id
private int userId;
private String userName;
private String email;
private long mobile;
private String password;
@OneToOne
private Role role;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}
public User(int userId, String userName, String email, long mobile, String password, Role role) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.email = email;
	this.mobile = mobile;
	this.password = password;
	this.role = role;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", mobile=" + mobile
			+ ", password=" + password + ", role=" + role + "]";
}


}
