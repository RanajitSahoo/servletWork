package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/pages/register")
public class PersonServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("f");
		String lname = req.getParameter("l");
		String email = req.getParameter("e");
		int age = Integer.parseInt(req.getParameter("a"));
		String idCard = req.getParameter("i");
		String ph = req.getParameter("ph");
		String address = req.getParameter("ad");
		String password = req.getParameter("pw");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/person_details_servlet_hibernate?user=root&password=root1234");
			String sql="insert into person(fname,lname,email,age,idcard,ph,address,password) values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, email);
			ps.setInt(4, age);
			ps.setString(5, idCard);
			ps.setString(6, ph);
			ps.setString(7, address);
			ps.setString(8, password);
			ps.execute();
			con.close();
			int res=resp.getStatus();
			System.out.println(res);
			if(res==200) {
				resp.sendRedirect("Login.html");
			}
			
		}catch (Exception e) {
			System.err.println("Database issue Occured");
		}
		
	}
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		String fname = req.getParameter("f");
//		String lname = req.getParameter("l");
//		String email = req.getParameter("e");
//		int age = Integer.parseInt(req.getParameter("a"));
//		String idCard = req.getParameter("i");
//		String ph = req.getParameter("ph");
//		String address = req.getParameter("ad");
//		String password = req.getParameter("pw");
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection(
//					"jdbc:mysql://localhost:3306/person_details_servlet_hibernate?user=root&password=root1234");
//			String sql="insert into person(fname,lname,email,age,idcard,ph,address,password) values(?,?,?,?,?,?,?,?)";
//			PreparedStatement ps=con.prepareStatement(sql);
//			ps.setString(1, fname);
//			ps.setString(2, lname);
//			ps.setString(3, email);
//			ps.setInt(4, age);
//			ps.setString(5, idCard);
//			ps.setString(6, ph);
//			ps.setString(7, address);
//			ps.setString(8, password);
//			ps.execute();
//			con.close();
//			PrintWriter pw=res.getWriter();
//			pw.write("<h1>Data added to Person Database!!z</h1>");
//			
//		}catch (Exception e) {
//			System.err.println("Database issue Occured");
//		}
		
		
		
	

}
