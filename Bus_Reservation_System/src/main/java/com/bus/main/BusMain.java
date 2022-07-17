package com.bus.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.bus.dao.BusDao;
import com.bus.dao.CP;
import com.bus.dao.UserDao;
import com.bus.entity.Bus;
import com.bus.entity.User;

public class BusMain {

	public static void main(String[] args) throws IOException, SQLException {

		System.err.println("***************Welcome To Bus Tickets Booking **************\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Press 1 : Login Admin & User ");

			int c = Integer.parseInt(br.readLine());

			switch (c) {
			case 1:
				System.out.println("Enter Your User ID");
				String userid = br.readLine();
				System.out.println("Enter your password");
				String password = br.readLine();

				try {
					Connection con = CP.create();
					String q = "select * from login where userid=? and password=?";
					PreparedStatement ps = con.prepareStatement(q);
					ps.setString(1, userid);
					ps.setString(2, password);
					ResultSet resultSet = ps.executeQuery();
					if (resultSet.next()) {
						String name = resultSet.getString(2);
						String role = resultSet.getString(4);
						if (role.equals("admin")) {
							System.out.println("Welcome ::" + name);

							// ADMIN OPTIONS
							boolean adminoption = true;
							while (adminoption) {
								System.err.println("******************Enter Your Option******************");

								System.out.println("Press 1 to Add Bus\n");
								System.out.println("Press 2 to Delete Bus\n");
								System.out.println("Press 3 to Display Bus\n");
								System.out.println("Press 4 to Exit ");
								int aoption = Integer.parseInt(br.readLine());
								switch (aoption) {
								case 1:

									if (c == 1) {

										System.out.println("==========Add Bus Details==========");
//										add
										System.out.println("Enter user Bus No. :");
										int no = Integer.parseInt(br.readLine());

										System.out.println("Enter user Bus Name :");
										String name1 = br.readLine();

										System.out.println("Enter user Bus Ac :");
										String ac = br.readLine();

										System.out.println("Enter user Bus Source :");
										String source = br.readLine();

										System.out.println("Enter user Bus Destination :");
										String destination = br.readLine();

										System.out.println("Enter user Bus Fare :");
										String fare = br.readLine();

										System.out.println("Enter user Bus Seat :");
										String seat = br.readLine();

										Bus b = new Bus(no, name1, ac, source, destination, fare, seat);
										boolean answer = BusDao.insertBusToDB(b);
										if (answer) {
											System.out.println("Bus is added successfully");
										} else {
											System.out.println("Something went wrong......");
										}
										System.out.println(b);
									}

									break;

								case 2:
									System.out.println("=========Delete Bus Details==========");

									if (c == 1) {
//										delete
										System.out.println("Enter Bus No Delete :");
										int busno = Integer.parseInt(br.readLine());
										boolean f = BusDao.deleteBus(busno);
										if (f) {
											System.out.println("Deleted ");
										} else {
											System.out.println("something wrong try again");
										}

									}
									break;

								case 3:
									System.out.println("*************Show All Bus Details***************");

									if (c == 1) {

//											display  
										BusDao.showAllBus();
									}
									break;
								case 4:
									if (c == 5) {
//										exit
										break;
									}

								default:
									System.out.println("INVALID  ");
									break;
								}
							}
						}

						// USER DETAILS
						
						else {

							System.out.println("");
							System.out.println("Welcome ::" + name);

							boolean useroption = true;
							while (useroption) {

								System.err.println("******************Enter Your Option******************");

								System.out.println("Press 1 to View All Bus Details");
								System.out.println("Press 2 to Search Bus Details");
								System.out.println("Press 3 to My Bus Booking Details");
								int uoption = Integer.parseInt(br.readLine());
								switch (uoption) {
								case 1:

									System.out.println("*************Show All Bus Details***************");

									if (c == 1) {

//										display  
										BusDao.showAllBus();
									}

									break;

								case 2:
									
									System.out.println("=========Search Bus Details==========");

									if (c == 1) {
//										 Fetch
										System.out.println("Enter Bus Source :");
										String source = br.readLine();
										
										System.out.println("Enter Bus Destination :");
                                        String destination = br.readLine();
                                        
                                        
//                                     

                                        BusDao.fetch(String source ,String destination );
//										
									}
									
									System.out.println("***********Bus Booking Details***********");

									System.out.println("Enter user Bus No. :");
									int no = Integer.parseInt(br.readLine());

									System.out.println("Enter user Bus Name :");
									String name1 = br.readLine();

									System.out.println("Enter user Bus Ac :");
									String ac = br.readLine();

									System.out.println("Enter user Bus Source :");
									String source1 = br.readLine();

									System.out.println("Enter user Bus Destination :");
									String destination1 = br.readLine();

									System.out.println("Enter user Bus Fare :");
									String fare = br.readLine();

									System.out.println("Enter user Bus Seat :");
									String seat = br.readLine();

									Bus b = new Bus(no, name1, ac, source1, destination1, fare, seat);
									boolean answer = UserDao.insertBusToDB(b);
									if (answer) {
										System.out.println("Bus Booking successfully");
									} else {
										System.out.println("Something went wrong......");
									}
									System.out.println(b);
																	
									break;
									
								case 3:
									System.out.println("*************Show All Bus Booking Details***************");

									if (c == 1) {

//											display  
										UserDao.showAllBus1();
									}
									
									
									break;

								default:
									System.out.println("User Incorrect Details ");
									break;
								}
								// System.out.println("USER AFTER LOGIN OPTION IS @2[1ST SEARCH BUS ],[2nd MY
								// BUS BOOKING]");
							}
						}

					} else {
						System.out.println("*****Invalid User Name or Passward*****");
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

				break;

			default:
				System.out.println("INVALID OPTION");
				break;
			}

		}

	}

}
