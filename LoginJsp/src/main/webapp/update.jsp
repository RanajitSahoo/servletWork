<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
	System.out.println(id);
	String name = request.getParameter("name");
	String age = request.getParameter("age");

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ServletJsp?user=root&password=root1234");
	String sql="update student set name='"+name+"' ,age="+age+"  where id="+id+"";
	Statement st=con.createStatement();
	st.executeUpdate(sql);
	if(response.getStatus()==200)response.sendRedirect("AllStudent.jsp");
	else response.sendRedirect("edit.jsp");
	%>
</body>
</html>