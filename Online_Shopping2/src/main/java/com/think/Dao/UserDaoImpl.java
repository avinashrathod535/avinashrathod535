package com.think.Dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.think.Model.User;

@Transactional
@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public boolean insertUser(User uobj) {
		sessionfactory.getCurrentSession().save(uobj);
		return true;
	}
	@Override
	public boolean updateUser(User uobj) {
		
		sessionfactory.getCurrentSession().saveOrUpdate(uobj);
		return true;
	}

	@Override
	public boolean deleteUser(User uid) {
		
		sessionfactory.getCurrentSession().delete(uid);
		return false;
	}

	@Override
	public List<User> ShowUserList() {
		
		Query<User> q=sessionfactory.getCurrentSession().createQuery("from User");
		List<User> lst=q.list();
		return lst;
	}

	@Override
	public User SearchUserById(int uid) {
		
		return sessionfactory.getCurrentSession().get(User.class, uid);
	}

	
	@Override
	public User getUserByUnameAndUpass(String uname, String upass) {
		// TODO Auto-generated method stub
		String query = "from User u where uname=:n and upass=:p";
		Query  q = sessionfactory.getCurrentSession().createQuery(query);
		q.setParameter("n", uname);
		q.setParameter("p", upass);
		q.setMaxResults(1);
		User u = (User) q.uniqueResult();

		return u;
	}
	@Override
	public List<User> SearchUserByUname(String uname) {
		String query = "from User u where uname=:n ";
		Query  q = sessionfactory.getCurrentSession().createQuery(query);
		q.setParameter("n", uname);
		List<User> lst=q.list();
		return lst;
	}

}
