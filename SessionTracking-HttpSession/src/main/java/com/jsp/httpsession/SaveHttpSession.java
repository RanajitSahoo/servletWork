package com.jsp.httpsession;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/save")
public class SaveHttpSession extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num =Integer.parseInt(req.getParameter("num"));
		String name = req.getParameter("name");
		HttpSession session = req.getSession();
		
		session.setAttribute("number", num);
		session.setAttribute("name", name);
		System.out.println(session.getAttribute("name"));
		System.out.println(session.getAttribute("number"));
		Enumeration<String> at = session.getAttributeNames();
		Iterator<String> itr = at.asIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
