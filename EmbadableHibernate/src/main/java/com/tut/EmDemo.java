package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		//Embadable
		
		Student student1 = new Student();
		student1.setId(14134);
		student1.setName("Ashique");
		student1.setCity("Madhubani");

		certificate certificate = new certificate();
		certificate.setCourse("java");
		certificate.setDuration("3 month");
		student1.setCerti(certificate);

		Student student2 = new Student();
		student2.setId(1000);
		student2.setName("Ashutosh");
		student2.setCity("chitrakoot");

		certificate certificate1 = new certificate();
		certificate1.setCourse("python");
		certificate1.setDuration("1 month");
		student2.setCerti(certificate1);

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		//objects save
		s.save(student1);
		s.save(student2);
		tx.commit();
		s.close();
		factory.close();
	}

}
