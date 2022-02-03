package com.entity.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class hibernateEmpManyToOne {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("EmpManyToOne.cfg.xml");
		SessionFactory sessionfactory = cfg.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction tx = null;
		tx = session.beginTransaction();

		DeptManytoOne d1 = new DeptManytoOne();
		d1.setDid(101);
		d1.setDname("Java");
		session.save(d1);

		EmpManyToOne e1 = new EmpManyToOne(1, "Avinash", d1);
		EmpManyToOne e2 = new EmpManyToOne(2, "Sapana", d1);
		EmpManyToOne e3 = new EmpManyToOne(3, "Dugu", d1);
		session.save(e1);
		session.save(e2);
		session.save(e3);

		tx.commit();

	}

}
