package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/mov")
public class SaveMovieData extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String name=req.getParameter("n");
			String lang=req.getParameter("lan");
			String hero=req.getParameter("h");
			String type=req.getParameter("t");
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Servlet-01?user=root&password=root1234");
				String sql="insert into movies(name,lang,hero,type) values(?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, lang);
				ps.setString(3, hero);
				ps.setString(4, type);
				ps.execute();
				con.close();
			}catch (Exception e) {
				System.err.println("Database issue Occured");
			}
			PrintWriter pw=resp.getWriter();
			pw.write("<h1>Data added to Movies Database!!z</h1>");
			
		}

}
