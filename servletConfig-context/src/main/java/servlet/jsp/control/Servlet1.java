package servlet.jsp.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ServletConfig sc = getServletConfig();
		String s1 = sc.getInitParameter("param1");
		String s2 = sc.getInitParameter("param2");
		String s3 = sc.getInitParameter("param3");
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.write("<img src='"+s1+"' alt='not found' height=250px width=250px>");
		pw.write("<img src='"+s2+"' alt='not found' height=250px width=250px>");
		pw.write("<img src='"+s3+"' alt='not found' height=250px width=250px>");
	}
}
