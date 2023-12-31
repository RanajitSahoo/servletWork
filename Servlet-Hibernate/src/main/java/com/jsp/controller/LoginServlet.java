package com.jsp.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/login")
public class LoginServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("e");
		String password=req.getParameter("pw");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/person_details_servlet_hibernate?user=root&password=root1234");
			Statement st=con.createStatement();
			String sql="select * from person where email='"+email+"'and password='"+password+"'";
			ResultSet r= st.executeQuery(sql);
			
			String e="";
			String p="";	
			
			while(r.next()) {
				
				e=r.getString("email");
				p=r.getString("password");
			}
			if(e.equals("")&&p.equals("")) {
				System.out.println("not sucess");
			}else {
				System.out.println("success");
			}
			
			con.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
