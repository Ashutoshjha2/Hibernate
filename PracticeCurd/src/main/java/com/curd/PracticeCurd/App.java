package com.curd.PracticeCurd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		Scanner sc = new Scanner(System.in);

		System.out.println("=============== Enter Customer Details =================\n");

		System.out.println(" Enter id");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Name");
		String Name = sc.nextLine();
		System.out.println("Enter Mobile");
		String mobile = sc.nextLine();
		System.out.println("email");
		String email = sc.nextLine();
		
		// create List Of addresses
		
		Customer c = new Customer();
		System.out.println("DO YOU HAVE MULTIPLE ADDRESSES");
		String option = sc.nextLine();
		if (option.equals("yes")) {
			System.out.println("Enter Your First Address");
			String firstAddress = sc.nextLine();
			System.out.println("Enter Your CITY");
			String city = sc.nextLine();
			System.out.println("Enter Your STATE");
			String state = sc.nextLine();
			System.out.println("Enter Your PINCODE");
			int pin = Integer.parseInt(sc.nextLine());

			Customer_Address cust1 = new Customer_Address(firstAddress, state, city, pin, c);
			
			System.out.println("ENTER YOUR SECOND ADDRESS");
			String secondAddress = sc.nextLine();
			System.out.println("Enter Your CITY");
			String city2 = sc.nextLine();
			System.out.println("Enter Your STATE");
			String state2 = sc.nextLine();
			System.out.println("Enter Your PINCODE");
			int pin2 = Integer.parseInt(sc.nextLine());
			Customer_Address cust2 = new Customer_Address(secondAddress, state2, city2, pin2, c);
			
			c.setCustomer_id(id);
			c.setMobile_No(mobile);
			c.setEmail_id(email);
			c.setName(Name);
			
			List<Customer_Address> list = new ArrayList<Customer_Address>();
			
			list.add(cust1);
			list.add(cust2);
			
			

			Transaction tx = s.beginTransaction();

			s.save(c);
			s.save(cust1);
			s.save(cust2);
			
			c.setAddress(list);

			tx.commit();
			s.close();
			factory.close();
		} else {
			System.out.println("No Multiple ADDRESS");
		}

	}
}
