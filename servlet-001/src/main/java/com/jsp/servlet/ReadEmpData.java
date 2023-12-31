package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/emp")
public class ReadEmpData extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("n");
		String gender=req.getParameter("g");
		String sal=req.getParameter("s");
		String bns=req.getParameter("b");
		int total=Integer.parseInt(sal)+Integer.parseInt(bns);
		PrintWriter pw=res.getWriter();
		pw.write("<h1> Name of Emp: "+name+"</h1>"
				+ "<h1> Gender of Emp: "+gender+"</h1>"
				+ "<h1> Salary of Emp: "+sal+"</h1>"
				+ "<h1> Bonus of Emp: "+bns+"</h1>"+
				"<hr>"
				+ "<h1 style='color:red'> Total salry of the emp of Emp: "+total+"</h1>"
				+ "");
		
	}

}
