package com.bus.dao;
import java.sql.Connection;
import java.sql.DriverManager;
public class CP {
static	Connection con;
public static Connection create() {
	try {
//		load driver
		Class.forName("com.mysql.jdbc.Driver");	
		// create connection
		String user = "root";
		String passward = "root";
		String url = "jdbc:mysql://localhost:3306/bus";
		con = DriverManager.getConnection(url, user, passward);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return con;
}
}
