package com.jsp.servlet;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/xxx")
public class Read extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("n");
		String phone=req.getParameter("p");
		System.out.println(name+"--"+phone);
		
	}

}
