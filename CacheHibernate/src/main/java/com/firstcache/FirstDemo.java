package com.firstcache;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FirstDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		
		// by default enable cache first
		Student student = s.get(Student.class, 12424);
		System.out.println(student);
		System.out.println("working  something...");
		Student student1 = s.get(Student.class, 2424);
        System.out.println(student1); 
        
        s.contains(student1);
		s.close();
	}
}
