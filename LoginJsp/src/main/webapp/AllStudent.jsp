
<%@page import="java.time.Period"%>
<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.temporal.ChronoUnit"%>
<%@page import="java.sql.Time"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>

<%@page import="javax.print.attribute.standard.DateTimeAtCompleted"%>
<%@page import="java.sql.ResultSet"%>
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
				<li class="nav-item active"><a class="nav-link"
					href="AllStudent.jsp">All Students <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="form.jsp">Add
						Student</a></li>

				<li class="nav-item"><a class="nav-link" href="edit.jsp">Edit
						Student</a></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>

	<!-- End Of NavBar -->


	<div>

		<%
		int sid = 1;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ServletJsp?user=root&password=root1234");
		String sql = "select * from student";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		if (rs != null) {
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				Time time = rs.getTime(4);
		%>
		<%
		
		/* LocalDateTime now = LocalDateTime.now();
		Period period=Period.between(time, now); */
		
		/* LocalTime localTime = now.toLocalTime(); */
		
		/*  ChronoUnit.DAYS.between(pastDate, currentDate);*/
		/* ChronoUnit.MINUTES.between(temporal1Inclusive, ) */
		%>

		<div class="container mt-5">
			<div class="card ">
				<div class="card-head ">
					<div>
						<div class="row justify-content-around mt-1">
							<h3 class="card-title">
								Student data<%=sid%></h3>
						</div>
						<div>
							<hr>
						</div>
					</div>


				</div>
				<div class="card-body">
					<div class="row">
						<div class="col-md-4 ">
							<div class="row justify-content-around">
								<img src="image.jpeg" alt="not">
							</div>
						</div>
						<div class="col-md-4">
							<div>
								<h5>
									Name-
									<%=name%></h5>
							</div>
							<div>
								<h5>
									Age-
									<%=age%></h5>
							</div>
							<div>
								<h5>
									id-
									<%=id%></h5>
							</div>
						</div>
						<div class="col-md-4">
							<div class="row justify-content-end">
								<h5><%=time%></h5>
								
							</div>
						</div>
					</div>
					<div>
						<div class="card-text mt-2">Card columns can also be
							extended and customized with some additional code. Shown below is
							an extension of the .card-columns class using the same CSS we
							use—CSS columns— to generate a set of responsive tiers for
							changing the number of columns.</div>
					</div>
				</div>
				<div class="card-footer  ">
					<div class="row justify-content-around">
					<a href="edit.jsp?id=<%=id%>&name=<%=name%>&age=<%=age%>"><button
							class="btn btn-success btn-lg">Edit</button></a> 
					<a href="delete.jsp?id=<%=id%>"><button class="btn btn-danger btn-lg">delete</button></a>
					</div>
				</div>
			</div>
		</div>



		<%
		sid++;
		}
		} else {
		%>
		<h1 class="h1 text-center">No information here please <a href="form.jsp">click here</a> to add</h1>
		<%}%>

	</div>
</body>
</html>