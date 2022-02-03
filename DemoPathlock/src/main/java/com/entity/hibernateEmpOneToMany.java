package com.entity;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

import com.entity.mapping.Dept;
import com.entity.mapping.Emp;

public class hibernateEmpOneToMany {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("Emp.cfg.xml");
		SessionFactory sessionfactory = cfg.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction tx = null;
		tx = session.beginTransaction();

		Emp e1 = new Emp(1, "Avi");
		Emp e2 = new Emp(2, "Sapana");
		Emp e3 = new Emp(3, "Dugu");
		session.save(e1);
		session.save(e2);
		session.save(e3);

		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(e1);
		al.add(e2);
		al.add(e3);

		Dept d1 = new Dept(1, "IT", al);
		session.save(d1);
		tx.commit();

	}

}
