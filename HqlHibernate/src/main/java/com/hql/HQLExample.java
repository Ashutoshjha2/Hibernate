package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
//import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLExample {

	public static void main(String[] args) {
		System.out.println("Project started");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		
		//HQL
		//Syntax
		//String query = "from Student where city='Delhi'";
		
		//new
		String query = "from Student as s where s.city=:x and s.name=:n";
		Query q = s.createQuery(query);
		//new
		q.setParameter("x", "Madhubani");
		q.setParameter("n", "Naman");
		// single - (Unique)
		// multiple-list
		List <Student> list=q.list();
		
		for (Student student : list) {
			System.out.println(student.getName()+" : "+student.getCerti().getCourse());
		}
		
		System.out.println("____________________________________________________");
		
		// Delete query
		Transaction tx = s.beginTransaction();
		Query q4=s.createQuery("delete from Student s where s.city=:c");
		q4.setParameter("c", "Delhi");
		int r1=q4.executeUpdate();
		System.out.println("Deleted");
		System.out.println(r1);
		
		// update query
		Query q2=s.createQuery("update Student set city=:c where name=:n");
		q2.setParameter("c", "Delhi");
		q2.setParameter("n", "Naman");
		int r = q2.executeUpdate();
		System.out.println(r + "object updated");
		
		tx.commit();
	//	q.uniqueResult();
		
		// How to execute join query
		Query q3=s.createQuery("select q.questionn ,q.questionId,a.answers from Questionn as q INNER JOIN  q.answers as a");
		List<Object[]> list3=q3.getResultList();
		for (Object[] arr : list3) {
			System.out.println(Arrays.toString(arr));
		}
		s.close();
		factory.close();
		
	}

}
