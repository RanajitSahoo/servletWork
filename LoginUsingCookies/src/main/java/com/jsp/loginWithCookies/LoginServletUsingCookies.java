package com.jsp.loginWithCookies;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServletUsingCookies extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("e");
		String password = req.getParameter("p");

		if (email.equals("abc@abc.abc") && password.equals("1234")) {
			Cookie c1 = new Cookie("email", email);
			Cookie c2 = new Cookie("password", password);
			c1.setMaxAge(100);
			c2.setMaxAge(100);

			resp.addCookie(c1);
			resp.addCookie(c2);
			resp.sendRedirect("Welcome.html");

		} else {
			resp.sendRedirect("LoginButton.html");
		}

	}

}
