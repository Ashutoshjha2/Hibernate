package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class SecondCacheExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		//first cache
		Student st = s.get(Student.class, 111);
		System.out.println(st);
		
		s.close();
		
		Session s2 = factory.openSession();
		// second cache
		Student st1 = s.get(Student.class, 111);
		System.out.println(st1);
		s2.close();
	}

}
