package com.manytoone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo1 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// creating question
		Questionn q1 = new Questionn();
		q1.setQuestionId(1212);
		q1.setQuestionn("what is java ?");

		// creating answer
		Answers answer = new Answers();
		answer.setAnswerId(343);
		answer.setAnswers("java is a programing language.");
		answer.setQuestionn(q1);
		
		Answers answer1 = new Answers();
		answer1.setAnswerId(344);
		answer1.setAnswers("with the help of java we can create software");
		answer1.setQuestionn(q1);
		
		Answers answer2 = new Answers();
		answer2.setAnswerId(345);
		answer2.setAnswers("java has different type of frameworks.");
		answer2.setQuestionn(q1);
		
		List<Answers> list = new ArrayList<Answers>();
		list.add(answer);
		list.add(answer1);
		list.add(answer2);
		q1.setAnswers(list);
		// session

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		// save
		s.save(q1);
		s.save(answer);
		s.save(answer1);
		s.save(answer2);
		 

		Questionn q = (Questionn) s.get(Questionn.class, 1212);

	//	System.out.println(q.getQuestionId());
		System.out.println(q.getQuestionn());
		// System.out.println(q.getAnswers().size());
		// lazy
		// System.out.println(q.getAnswers().size());
//	lazy
//		hide
	//	for (Answers a : q.getAnswer()) {
	//		System.out.println(a.getAnswers());
	//	}
		for (Answers answers : list) {
			System.out.println(answers.getAnswers());
		}
		// hide
		tx.commit();

		// fetching
//		Question newQ=(Question)s.get(Question.class, 242);
//		System.out.println(newQ.getQuestion());
//		System.out.println(newQ.getAnswer().getAnswer());
//		
		s.close();
		factory.close();
	}
}