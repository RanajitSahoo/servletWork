package com.jsp.LoginUsingHttpServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class SaveLoginServletHttpSession extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("e");
		String password=req.getParameter("p");
		
		if(email.equals("abc@abc.abc")&&password.equals("12345")) {
			HttpSession session = req.getSession();
			session.setAttribute("email", email);
			session.setAttribute("password", password);
			resp.sendRedirect("Welcome.html");
			
		}else {
			resp.sendRedirect("LoginButton.html");
		}
	}
}
