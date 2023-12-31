package com.jsp.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/std")
public class ReadStudentData extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String name=req.getParameter("n");
			int age=Integer.parseInt(req.getParameter("a"));
			String gen=req.getParameter("g");
			String nat=req.getParameter("nat");
			System.out.println(name+" "+age+" "+gen+" "+nat);
	}

}
