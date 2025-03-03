<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>result</title>
</head>
<body>
	<h1>Hi ${userName}!</h1>
	<h3>send result to your Email:</h3>

	<form:form method="get" action="/love-calculator/processemail"
		modelAttribute="emaildto">
		<h4>Enter your Email:</h4>
		<form:input path="email" />
		<input type="submit" value="send">
	</form:form>
</body>
</html>