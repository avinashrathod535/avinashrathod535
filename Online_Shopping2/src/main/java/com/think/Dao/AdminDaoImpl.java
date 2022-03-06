package com.think.Dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.think.Model.Admin;
import com.think.Model.User;

@Transactional
@Repository
public class AdminDaoImpl implements AdminDao{
	@Autowired
	private SessionFactory sessionfactory;


	@Override
	public boolean addAdmin(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAdmin(int aid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Admin getAdminByUnameAndUpass(String uname, String upass) {
		String query = "from Admin a where uname=:n and upass=:p";
		Query  q = sessionfactory.getCurrentSession().createQuery(query);
		q.setParameter("n", uname);
		q.setParameter("p", upass);
		q.setMaxResults(1);
		Admin u = (Admin) q.uniqueResult();
		return u;
		
	}

	

}
