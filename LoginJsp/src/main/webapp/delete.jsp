<%@page import="java.sql.Statement"%>
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
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ServletJsp?user=root&password=root1234");
	String sql = "delete from student where id="+request.getParameter("id")+"";
	Statement st = con.createStatement();
	st.execute(sql);
	response.sendRedirect("AllStudent.jsp");
	%>
</body>
</html>