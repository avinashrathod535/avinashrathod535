package com.tqpp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role 
{
@Id
private Integer roleId;
private String roleType;
public Integer getRoleId() {
	return roleId;
}
public void setRoleId(Integer roleId) {
	this.roleId = roleId;
}
public String getRoleType() {
	return roleType;
}
public void setRoleType(String roleType) {
	this.roleType = roleType;
}
public Role(Integer roleId, String roleType) {
	super();
	this.roleId = roleId;
	this.roleType = roleType;
}
public Role() {
	super();
	// TODO Auto-generated constructor stub
}


}
