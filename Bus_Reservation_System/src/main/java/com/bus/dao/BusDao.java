package com.bus.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.bus.entity.Bus;
public class BusDao {
	static Scanner sc = new Scanner(System.in);
public static boolean insertBusToDB(Bus b) {
	boolean f=false;
	//JDBC CODE...
	try {
		Connection con = CP.create();
		String q = "insert into admin values(?,?,?,?,?,?,?)";
		// prepared statment
		PreparedStatement pstmt =con.prepareStatement(q);
		// set the value of parameter
		pstmt.setInt(1, b.getBusNo());
		pstmt.setString(2, b.getBusName());
		pstmt.setString(3, b.getACBus());
		pstmt.setString(4, b.getBusSource());
		pstmt.setString(5, b.getBusDestination());
		pstmt.setString(6, b.getBusFare());
		pstmt.setString(7, b.getBusSeat());
		
		//excute
		pstmt.executeUpdate();
		f=true;
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return f;
}

public static boolean deleteBus(int busno) {
	// TODO Auto-generated method stub
	boolean f=false;
	//JDBC CODE...
	try {
		Connection con = CP.create();
		String q = "delete from admin where busno=?";
		// prepared statment
		PreparedStatement pstmt =con.prepareStatement(q);
		// set the value of parameter
		pstmt.setInt(1, busno);
		
		
		//excute
		pstmt.executeUpdate();
		f=true;
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return f;
}

//Fetch

public static void fetch(String source, String destination) {
//	boolean f=false;
	// TODO Auto-generated method stub
	//JDBC CODE...
	try {
		Connection con = CP.create();
//	//	System.out.println("Enter Bus Source :");
//	//	String source = sc.nextLine();
//		
//		//System.out.println("Enter Bus Destination :");
//      //  String destination = sc.nextLine();
        
		String q = "select from admin where source=? and destination=?";
	    PreparedStatement stmt = con.prepareStatement(q);
	    stmt.setString(1,source );
	    stmt.setString(2,destination );
	    
	    ResultSet set = stmt.executeQuery();
		while (set.next()) {
			int no = set.getInt(1);
			String name = set.getString(2);
			String ac = set.getString(3);
			String source1 = set.getString(4);
			String destination1 = set.getString(5);
			String fare = set.getString(6);
			String seat = set.getString(7);
			System.out.println("No. : "+no);
			System.out.println("Name : "+name);
			System.out.println("Ac : "+ac);
			System.out.println("Source :"+source1);
			System.out.println("Destination :"+destination1);
			System.out.println("Fare :"+fare);
			System.out.println("Seat :"+seat);;
			System.out.println("*************************");
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	//return f;	
}
public static void showAllBus() {
	// TODO Auto-generated method stub
	//JDBC CODE...
	try {
		Connection con = CP.create();
		String q = "select * from admin;";
	    Statement stmt = con.createStatement();
	    ResultSet set = stmt.executeQuery(q);
		while (set.next()) {
			int no = set.getInt(1);
			String name = set.getString(2);
			String ac = set.getString(3);
			String source = set.getString(4);
			String destination = set.getString(5);
			String fare = set.getString(6);
			String seat = set.getString(7);
			System.out.println("No. : "+no);
			System.out.println("Name : "+name);
			System.out.println("Ac : "+ac);
			System.out.println("Source :"+source);
			System.out.println("Destination :"+destination);
			System.out.println("Fare :"+fare);
			System.out.println("Seat :"+seat);;
			System.out.println("*************************");
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
}
}
