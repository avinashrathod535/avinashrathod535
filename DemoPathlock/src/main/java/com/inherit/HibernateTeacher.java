package com.inherit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//with Inheritance
public class HibernateTeacher {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("Teacher.cfg.xml");
		SessionFactory sessionfactory = cfg.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		Teacher t1 = new Teacher(1, "Deepa");
		VisitingTeacher v1 = new VisitingTeacher(2, "Medha", 10, 1000);
		PermTeacher p1 = new PermTeacher(3, "Sapana", 50000);
		session.save(t1);
		session.save(v1);
		session.save(p1);

		tx.commit();

	}

}
