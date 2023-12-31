package com.jsp.cookiesDuration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sett")
public class SaveCookiesWithDuration extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie c1 = new Cookie("name","Ranajit");
		Cookie c2 = new Cookie("age","10");
		Cookie c3 = new Cookie("psw","degni");
		
		c1.setMaxAge(100);
		c2.setMaxAge(100);
		c3.setMaxAge(100);
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		resp.addCookie(c3);
		
	}
}
