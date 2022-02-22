package com.think.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.think.Model.Mobile;

@Repository
@Transactional
public class MobileDaoImpl implements MobileDao {

	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public boolean addMobile(Mobile mobileobj) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().save(mobileobj);
		return true;
	}

	@Override
	public boolean updateMobile(Mobile mobileobj) {

		sessionfactory.getCurrentSession().saveOrUpdate(mobileobj);
		return true;
	}

	@Override
	public boolean deleteMobile(int mobileid) {
		sessionfactory.getCurrentSession().delete(mobileid);

		return true;
	}

	@Override
	public List<Mobile> ShowMobileList() {
		Query<Mobile> q = sessionfactory.getCurrentSession().createQuery("from Mobile");
		List<Mobile> lst = q.list();
		return lst;

	}

	@Override
	public Mobile SearchMobileById(int mobileid) {
		return sessionfactory.getCurrentSession().get(Mobile.class, mobileid);
	}

	@Override
	public List<Mobile> searchMobileByColour(String mobilecolour) {
		Query<Mobile> q = sessionfactory.getCurrentSession().createQuery("from Mobile where colour=mobilecolour");
		List<Mobile> lst = q.list();
		return lst;
	}

	@Override
	public List<Mobile> searchMobileByBrand(String mobilebrand) {
		Query<Mobile> q = sessionfactory.getCurrentSession().createQuery("from Mobile where brand=mobilebrand");
		List<Mobile> lst = q.list();
		return lst;
	}

}
