package com.jsp.DWP;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class servlet2_N  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("n");
		int age=Integer.parseInt(req.getParameter("a"));
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		pw.write("<h2 style='color:red background:yellow'>Name: </h2> "+"<h1>"+name+"</h1>");
		pw.write("<h2 style='color:red'>Age: </h2> "+"<h1>"+age+"</h1>");
		
	}
	
}
