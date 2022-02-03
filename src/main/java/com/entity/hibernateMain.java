package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class hibernateMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("Config.cfg.xml");
		SessionFactory sessionfactory = cfg.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			Student s1 = new Student();
			s1.setSname("Sham");
			s1.setPercent(88);

			Address a1 = new Address();
			a1.setAddress1("Shivane");
			a1.setCity("Pune");
			a1.setLandmark("NDA Road");
			s1.setAddress(a1);
			session.save(s1);
			
			

//			s1.setSname("Suraj");//Transient state
//			session.save(s1);//Persistant state
//			s1.setSname("Ravi");
//		Student ob = session.get(Student.class, 5);
//		System.out.println(ob);
//		Student ob1 = session.get(Student.class, 6);
//		System.out.println(ob1);
//		// ob2 = session.load(Student.class, 16);
			// System.out.println(ob2);
//		Student s=new Student();
//		s.setSid(2);
//		s.setSname("Avi");
//		session.delete(s);
			tx.commit();
			session.close();
			s1.setSname("ABC");// Detached state

		} catch (Exception e) {
			System.out.println(e);
			tx.rollback();
		}
	}

}
