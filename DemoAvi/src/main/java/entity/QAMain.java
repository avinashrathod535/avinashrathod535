package entity;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QAMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("QuestionAnswer.cfg.xml");
		SessionFactory sessionfactory = cfg.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction tx = null;
		tx = session.beginTransaction();

		Answers a1 = new Answers();
		a1.setAnswerName("Narendra Modi.");
		a1.setAnsgivenby("Avinash");

		Answers a2 = new Answers();
		a2.setAnswerName("Thinkquotient is software trainning institute.");
		a2.setAnsgivenby("Sapana");

		Question q1 = new Question();
		q1.setQueName("Who is PM of India?");
		ArrayList<Answers> alist1 = new ArrayList<Answers>();
		alist1.add(a1);
		alist1.add(a2);
		q1.setAnswers(alist1);

		Answers a3 = new Answers();
		a3.setAnswerName("Servlet is an Interface");
		a3.setAnsgivenby("Deepa Mam");

		Answers a4 = new Answers();
		a4.setAnswerName("Servlet is an API");
		a4.setAnsgivenby("Kirti Mam");

		Question q2 = new Question();
		q2.setQueName("What is servlet?");
		ArrayList<Answers> alist2 = new ArrayList<Answers>();
		alist2.add(a3);
		alist2.add(a4);
		q2.setAnswers(alist2);

		session.save(q1);
		session.save(q2);

		tx.commit();
		session.close();
		System.out.println("****Program Implemented successfully.*****");

	}

}
