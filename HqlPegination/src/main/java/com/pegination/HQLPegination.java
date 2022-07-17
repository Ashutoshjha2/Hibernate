package com.pegination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLPegination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		
		Query query=s.createQuery("from Student");
		
		// implementing pegination using hibernate
		query.setFirstResult(1);
		query.setMaxResults(3);
		List<Student> list=query.list();
		for (Student st : list) {
			System.out.println(st.getId()+" : "+st.getName() + " :" +st.getCity());
		}
		
		s.close();
		factory.close();
	}

}
