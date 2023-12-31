<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="std" method="post">
		<pre>
		Name   : <input type="text" name="n">
		Age    : <input type="text" name="a">
		Gender :Male <input type="radio" name="g" value="male"> Female <input type="radio" name="g" value="male"> 
		Nation : <select name="nat">
					<option>---Select---</option>
					<option>India</option>
					<option>Korea</option>
					<option>Nepal</option>
					<option>Bhutan</option>
				</select>
				<input type="submit">
				
		</pre>
	</form>
</body>
</html>