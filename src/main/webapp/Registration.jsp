<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<form action="regStud" method="post">
		Name:<input type="text" name="tbName"/>
		<br>
		Age:<input type="number" name="tbAge"/>
		<br>
		City:<input type="text" name="tbCity"/>
		<br>
		Mobile:<input type="tel" name="tbMobile"/>
		<br>
		<input type="submit" name="btnSubmit"/>
		
		<%=request.getAttribute("result") %>
	</form>
</body>
</html>