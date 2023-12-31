package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dao.UserDao;
import com.jsp.db.DbConnect;
import com.jsp.entities.User;



@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		
		UserDao dao = new UserDao(DbConnect.getConnection());
		boolean f = dao.saveUserReg(user);
		if(f) {
			HttpSession session = request.getSession();
			session.setAttribute("reg-msg", "Registration Successfully..");
			response.sendRedirect("Register.jsp");
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("reg-msg", "Something went wrong on server!!");
			response.sendRedirect("Register.jsp");
		}
	}

}
