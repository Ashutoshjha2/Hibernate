package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {

	public static void main(String[] args) {
		// Hibernate life cycle
		// transient
		// persistent
		// detached
		// removed
		System.out.println("Example");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory f = cfg.buildSessionFactory();

		// creating student object
		Student s = new Student();
		s.setId(1414);
		s.setName("Abhishek");
		s.setCity("Madhubani");
		s.setCerti(new certificate("Java Hibernate Course", "6 Month"));
		// student : transient(no session no databases only hibernate)

		Session s1 = f.openSession();
		Transaction tx = s1.beginTransaction();
		s1.save(s);
		s.setName("Naman");
		// student: persistent (both session & database)

		tx.commit();
		s1.close();

		// student:Detached (only database no session)
		s.setName("Ashu");
		System.out.println(s);
		f.close();
	}

}
