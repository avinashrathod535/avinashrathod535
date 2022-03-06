package com.think.Dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.think.Model.Role;

@Repository
@Transactional
public class RoleDaoImpl {
	
	@Autowired
	private SessionFactory sessionfactory;
	
	public Role getByRoleId(int id)
	{
		return sessionfactory.getCurrentSession().find(Role.class, id);
	}
	

}
