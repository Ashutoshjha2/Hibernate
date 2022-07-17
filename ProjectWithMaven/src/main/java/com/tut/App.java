package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Project started");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

//      creating student 
		Student st = new Student();
		// certificate c = new certificate();
		st.setId(111);
		st.setName("Ashu");
		st.setCity("Delhi");
		// c.setCourse("java");
		// c.setDuration("3 Month");
		System.out.println(st);
		// System.out.println(c);

//      creating Address
		Address ad = new Address();
		ad.setStreet("street1");
		ad.setCity("kaluahi");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(1111.1);

		//// Reading image
		FileInputStream fis = new FileInputStream("src/main/java/ashu.jpg");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		session.save(ad);
		// session.save(c);
		tx.commit();
		session.close();
		System.out.println("Done...");

		System.out.println(factory);
		System.out.println(factory.isClosed());
	}
}
