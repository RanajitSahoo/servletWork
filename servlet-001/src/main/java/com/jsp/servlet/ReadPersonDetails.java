package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/read")
public class ReadPersonDetails extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("n");
		String age=req.getParameter("a");
		String email=req.getParameter("e");
		String pwd=req.getParameter("p");
//		System.out.println("name = "+name);
//		System.out.println("age = "+age);
//		System.out.println("email = "+email);
//		System.out.println("password = "+pwd);
		PrintWriter pw=res.getWriter();
		pw.write("<h1> Name: "+name+"</h1>");
		pw.write("<h1> Age: "+age+"</h1>");
		pw.write("<h1> Email: "+email+"</h1>");
		pw.write("<h1> Passsword: "+pwd+"</h1>");
		
	}

}
