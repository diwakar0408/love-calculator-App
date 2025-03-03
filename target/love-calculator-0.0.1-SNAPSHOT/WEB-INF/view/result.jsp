<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>
</head>
<body>
	<h1
		style="color: red; font-style: italic; font-size: 30px; text-align: center;">Love
		Calculator</h1>
	<hr>
	<h3>Your Name:${dtoobj.youName}</h3>
	<h3>Your Love Name:${dtoobj.loveName}</h3>
	<h3>You Love Status:{Lovers}</h3>
	
	<a href="/love-calculator/sendemail">click here to send result to Email</a>
</body>
</html>