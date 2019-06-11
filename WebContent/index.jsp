<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Web Calculator</title>
</head>
<body>
<h2>PROZ web calculator!</h2>
<form action="...">
	<input type="text" name="expression">
	<BR>
            <INPUT TYPE="SUBMIT" value="Submit">
</form>
<p>
Your equation:
<% out.println(request.getParameter("expression")); %>
<p>
Your result:
</body>
</html>