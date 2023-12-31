<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date"%>


<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	Date date = new Date();
	LocalDateTime date1=LocalDateTime.now();
	java.sql.Time sqldate = new java.sql.Time(date.getTime());
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ServletJsp?user=root&password=root1234");
	String sql = "insert into student(id,name,age,date) values(?,?,?,?)";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setInt(1, Integer.parseInt(id));
	ps.setString(2, name);
	ps.setInt(3, Integer.parseInt(age));
	ps.setTime(4, sqldate);
	ps.execute();
	con.close();
	if (response.getStatus() == 200)
		response.sendRedirect("AllStudent.jsp");
	else if (response.getStatus() == 500)
		out.println("Error! ");
	%>
</body>
</html>