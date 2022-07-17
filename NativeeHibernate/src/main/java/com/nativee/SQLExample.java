package com.nativee;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SQLExample {
public static void main(String[] args) {
	System.out.println("Project started");
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	Session s = factory.openSession();
	
	String q = "select * from student";
	NativeQuery nq = s.createSQLQuery(q);
	List<Object[]> list = nq.list();
	for (Object[] student : list) {
		System.out.println(Arrays.deepToString(student));
		//System.out.println(student[4]+" : "+student[3]);
	}
	s.close();
	factory.close();
}
}
