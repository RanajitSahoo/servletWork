package com.jsp.disPathcherServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("e");
		String password=req.getParameter("pw");
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		if(email.equals("abc@gmail.com")&&password.equals("123456")) {
			RequestDispatcher rd = req.getRequestDispatcher("Home.html");
			rd.forward(req, res);
		}else {
			pw.println("<h3 style='color:red'>invalid username and password</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, res);
		}
		
	}
}
