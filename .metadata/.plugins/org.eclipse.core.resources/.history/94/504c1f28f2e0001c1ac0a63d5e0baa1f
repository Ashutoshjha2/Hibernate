package com.curdoperation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		
		// customer
		Customer c = new Customer();
		c.setCustomer_id(13);
		c.setName("Ashu");
		c.setEmail_id("ashutosh@gmail.com");
		c.setMobile_No("8088276653");
		
		// customer Address
		Customer_Address ca = new Customer_Address();
		ca.setAddress("Permanent Address : Kaluahi");
		ca.setCity("Madhubani");
		ca.setState("Bihar");
		ca.setPin_Code(847229);
		ca.setCustomer(c);
		
		Customer_Address ca1 = new Customer_Address();
		ca1.setAddress("Temprorary Address : Dhanga");
		ca1.setCity("Darbhanga");
		ca1.setState("Bihar");
		ca1.setPin_Code(747220);
		ca1.setCustomer(c);
		
		Customer_Address ca2 = new Customer_Address();
		ca2.setAddress("Office Address : Chitrakoot");
		ca2.setCity("Lucknow");
		ca2.setState("Uttar Pradesh");
		ca2.setPin_Code(947229);
		ca2.setCustomer(c);
		
		List<Customer_Address> list=new ArrayList<Customer_Address>();
		list.add(ca);
		list.add(ca1);
		list.add(ca2);
		
		c.setAddress(list);
		
//		Transaction
		Transaction tx = s.beginTransaction();
		
		// save 
		s.save(c);
		s.save(ca);
		s.save(ca1);
		s.save(ca2);
		
		tx.commit();
				
		s.close();
		factory.close();
	}

}
