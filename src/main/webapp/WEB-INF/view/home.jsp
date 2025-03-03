<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>
<style>
.error
{
color:red;
position:fixed;
margin-left: 30px;
}
</style>
</head>
<body>
	<h1
		style="color: red; font-style: italic; font-size: 30px; text-align: center;">Love
		Calculator</h1>
	<hr>
	<div style="text-align: center; color: blue;">
		<form:form action="result" method="get" modelAttribute="dtoobj">
			<label for="yourname">Enter you'r Name:</label>
			<form:input placeholder="Enter here" id="yourname" path="youName" />
			<form:errors path="youName" cssClass="error"></form:errors>
			<br>
			<br>
			<label for="lovename">Enter you'r Love Name:</label>
			<form:input placeholder="Enter here" id="lovename" path="loveName" />
			<form:errors path="loveName" cssClass="error"></form:errors>
			<br>
			<br>
			<form:input type="submit" value="Submit"
				style="font-style: oblique; text-decoration: blink;" path="" />
		</form:form>
	</div>
</body>
</html>