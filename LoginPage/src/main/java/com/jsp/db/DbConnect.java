package com.jsp.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
	
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			if(con==null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginPage?user=root&password=root1234");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

}
