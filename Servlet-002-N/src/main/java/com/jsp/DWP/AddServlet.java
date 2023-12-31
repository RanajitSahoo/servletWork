package com.jsp.DWP;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/add")
public class AddServlet extends GenericServlet{

	@Override
	public void service(ServletRequest rq, ServletResponse rs) throws ServletException, IOException {
		
		int a=Integer.parseInt(rq.getParameter("a"));
		int b=Integer.parseInt(rq.getParameter("b"));
		int c=a+b;
		PrintWriter pw=rs.getWriter();
		rs.setContentType("text/html");
		pw.write("<h2 style='color:red '>a: </h2> "+"<h1>"+a+"</h1>");
		pw.write("<h2 style='color:red '>b: </h2> "+"<h1>"+b+"</h1>");
		pw.write("<h2 style='color:red '>Result: </h2> "+"<h1>"+c+"</h1>");
		
	}

}
