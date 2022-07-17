package com.cascade;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CascadeExample {

	public static void main(String[] args) {
		System.out.println("Project started");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		
		Questionn q1=new Questionn();
		q1.setQuestionId(567);
		q1.setQuestionn("What is Cascading...");
		
	//	Answers a1 = new Answers(1111, "hh");
				
	//	List<Answers> list=new ArrayList<>();
	//	list.add(a1);
		
	//	q1.setAnswers(list);
		Transaction tx = s.beginTransaction();
		
		s.save(q1);
		//s.save(a1);
		
		tx.commit();
		s.close();
		factory.close();
	}

}
