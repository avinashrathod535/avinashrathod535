package com.think.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Role {
	
	@Id
	@GeneratedValue
	private int roleId;
	private String roleType;
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(int roleId, String roleType) {
		super();
		this.roleId = roleId;
		this.roleType = roleType;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleType=" + roleType + "]";
	}
	
	
	
	

}
