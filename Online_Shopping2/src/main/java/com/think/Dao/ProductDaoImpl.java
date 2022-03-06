package com.think.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.think.Model.Product;

@Repository
@Transactional
public class 	ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public boolean addMobile(Product mobileobj) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().save(mobileobj);
		return true;
	}

	@Override
	public boolean updateProduct(Product obj) {

		sessionfactory.getCurrentSession().saveOrUpdate(obj);
		return true;
	}

	@Override
	public boolean deleteMobile(Product P) {
		sessionfactory.getCurrentSession().delete(P);

		return true;
	}

	@Override
	public List<Product> ShowMobileList() {
		Query<Product> q = sessionfactory.getCurrentSession().createQuery("from Product");
		List<Product> lst = q.list();
		return lst;

	}


	@Override
	public Product SearchMobileById(int mobileid) {
		return sessionfactory.getCurrentSession().get(Product.class, mobileid);
	}

	@Override
	public List<Product> searchMobileByColour(String mobilecolour) {
		Query<Product> q = sessionfactory.getCurrentSession().createQuery("from Mobile where colour=mobilecolour");
		List<Product> lst = q.list();
		return lst;
	}

	@Override
	public List<Product> searchMobileByBrand(String mobilebrand) {
		Query<Product> q = sessionfactory.getCurrentSession().createQuery("from Mobile where brand=mobilebrand");
		List<Product> lst = q.list();
		return lst;
	}

	
	public boolean updateMobile(Product mobileobj) {
		// TODO Auto-generated method stub
		 sessionfactory.getCurrentSession().saveOrUpdate(mobileobj);
		 return true;
	}

	@Override
	public Product getMobileById(int mobileid) {
		return sessionfactory.getCurrentSession().get(Product.class,mobileid);
		
	}

	@Override
	public Product getMobilePrice(int mobileid) {
		sessionfactory.getCurrentSession().get(Product.class,mobileid);
		return null;
	}

	

	

}
