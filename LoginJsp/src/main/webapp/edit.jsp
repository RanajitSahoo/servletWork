<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.Query"%>
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
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="style.css">
</head>
<body>
<!-- Navbar -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-custom">
		<a class="navbar-brand" href="#">Jspider</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item "><a class="nav-link"
					href="AllStudent.jsp">All Students 
				</a></li>
				<li class="nav-item"><a class="nav-link" href="form.jsp">Add
						Student</a></li>

				<li class="nav-item active"><a class="nav-link" href="edit.jsp">Edit
						Student <span class="sr-only">(current)</span></a></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>

	<!-- End Of NavBar -->


<form action="update.jsp">
		<%-- <%
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ServletJsp?user=root&password=root1234");
		String sql="select name, age from student  where id="+request.getParameter("id")+"";
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		String name="";
		String age="";
		while(rs.next()){
			name=rs.getString(2);
			age=rs.getString(3);
		}
		%> --%>
		<pre>

		id<input type="text" name="id" value="<%=request.getParameter("id") %>">
		name<input type="text" name="name" value="<%=request.getParameter("name") %>">
		age<input type="text" name="age" value="<%=request.getParameter("age") %>">
			<input type="submit">
</pre>
	</form>
</body>
</html>