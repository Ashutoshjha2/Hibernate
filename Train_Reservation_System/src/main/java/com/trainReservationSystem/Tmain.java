package com.trainReservationSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Tmain {

	public static void main(String[] args) throws InterruptedException {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int pnr = r.nextInt(10000000);
		Boolean option = true;
		while (option) {
			System.err.println("************ Chose Your Option ************\n");
			System.out.println("Press 1:**** Train Details Views ****\n");
			System.out.println("Press 2:**** Booking Train Ticket ****\n");
			System.out.println("Press 3:**** Check Booking Details ****\n");
			System.out.println("Press 4:**** Ticket Cancel Details ****\n");
			System.out.println("Press 5:**** Exit ****\n");

			int option1 = Integer.parseInt(s.nextLine());
			switch (option1) {
			case 1:
				System.out.println("Press 1:**** All Train Details View ****\n");
				List<Train> t = new ArrayList<Train>();
				t.add(new Train(101, "Rajdhani", "AC", 5000, "Patna", "Delhi"));
				t.add(new Train(102, "Satabdi", "NON-AC", 3000, "Patna", "Delhi"));
				t.add(new Train(103, "Garibrath", "AC", 4000, "Chitrakoot", "Lucknow"));
				t.add(new Train(104, "Intercity", "NON-AC", 2500, "Chitrakoot", "Lucknow"));

				System.err.println("Thank you ");
				for (Train train : t) {
					System.out.println(train);
				}
				break;
			case 2:

				System.out.println("Press 2:**** Booking Train Ticket ****\n");
			//	int patna = Integer.parseInt(s.nextLine());
//				if (patna==101) {
//					System.out.println("Train no.:101 , Name - Rajdhani,");
//				}
//				else {
//					
//				}
			
				Train tr = new Train();
				System.out.println("Enter Your Source");
				String source = s.nextLine();
				System.out.println("Enter Your Destination");
				String destination = s.nextLine();
				if(){
					
                
				}
				
                
               Train tr = new Train();
                System.err.println("Booking Form Details ");
				System.out.println("Enter Your Train No.");
				tr.setTrain_no(Integer.parseInt(s.nextLine()));
				Booking rg = new Booking();
				rg.setPnr(pnr);
				System.out.println("Enter Your Name ");
				rg.setName(s.nextLine());

				System.out.println("Enter Your Email ");
				rg.setEmail(s.nextLine());
				System.out.println("Enter Your Address ");
				rg.setAddress(s.nextLine());

				System.out.println("Enter Your State ");
				rg.setState(s.nextLine());
				System.out.println("Enter the Mobile  ");
				rg.setMobile(Long.parseLong(s.nextLine()));

				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();
				System.err.println("YOUR ORDER IS COMPLETED.......!!" + rg + "DATE : " + dtf.format(now));

				Thread.sleep(5000);
				System.out.println(rg);
				break;
			default:
				System.out.println("Invalid Details");
				break;
			}
				}
				

			

		}

	}


