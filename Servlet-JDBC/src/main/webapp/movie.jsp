<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<form action="mov">
	<h1>--Enter Movie Details Here---</h1>
	<pre>
		Name        :<input type="text" name="n">
		Language    :<select name="lan">
					<option>---Select Below---</option>
					<option>Hindi</option>
					<option>English</option>
					<option>Odia</option>
					<option>Kannad</option>
					<option>Telgu</option>
					<option>Tamil</option>
					<option>Marathi</option>
					<option>Gujurati</option>
					<option>Bengoli</option>
					<option>Panjabi</option>
				    </select>
		Hero        :<input type="text" name="h">
		Type        :U/A <input type="radio" name="t" value="U/A"> A <input type="radio" name="t" value="A"> B <input type="radio" name="t" value="A"> C <input type="radio" name="t" value="A">
					 <input type="submit">
	</pre>
	</form>
</body>
</html>