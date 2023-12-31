package com.jsp.cookiesDuration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/set")
public class sessionDestroy extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.setAttribute("name", "Raja");
		session.setAttribute("age", 12);
		session.setAttribute("isMarried", false);
		
		System.out.println(session.getAttribute("name"));
		System.out.println(session.getAttribute("age"));
		System.out.println(session.getAttribute("isMarried"));
		System.out.println(session.getAttribute("mark"));
		
		long time = session.getCreationTime();
		System.out.println(time);
		
		session.removeAttribute("age");
		System.out.println(session.getAttribute("name"));
		System.out.println(session.getAttribute("age"));
		System.out.println(session.getAttribute("isMarried"));
		System.out.println(session.getAttribute("mark"));
		
		session.invalidate();
		
		System.out.println(session.getAttribute("name"));
		
		
	}
}
