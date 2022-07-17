package com.nativeq;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SQLExample {
public static void main(String[] args) {
	System.out.println("Project started");
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	Session s = factory.openSession();
}
}
