<html>
<body>
<h2>Hello World!</h2>
	<%
	String name=(String)session.getAttribute("email");
	out.println(name);
	%>
	
</body>
</html>
