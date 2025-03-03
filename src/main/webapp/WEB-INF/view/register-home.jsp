<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register</title>
<style type="text/css">
.errors{
color: red;
}
</style>
</head>
<body>
	<div style="text-align: center;">
		<h1 style="color: pink;">Love Calculator Register Form</h1>
		<hr color="pink;">
		<form:form action="reistersuccess" method="get"
			modelAttribute="detailsdao">
			<label>Name:</label>
			<form:input path="youName" />
			<form:errors path="youName" cssStyle="color:red;"/>
			<br>
			<br>
			<label>User Name:</label>
			<form:input path="username" />
			<br>
			<br>
			<label>Enter Password:</label>
			<form:password path="password" />
			<br>
			<br>
			<label>Select Country:</label>
			<form:select path="country">
				<form:option value="india" />
				<form:option value="usa" />
				<form:option value="America" />
			</form:select>
			<br>
			<br>
			<label>Hobby:</label>
			<form:checkbox path="hobby" value="cricket" label="cricket" />
			<form:checkbox path="hobby" value="reading" label="reading" />
			<form:checkbox path="hobby" value="game" label="game" />
			<br>
			<br>
			<label>Select Gender:</label>
			<form:checkbox path="gender" value="male" label="male" />
			<form:checkbox path="gender" value="femal" label="female" />
			<br>
			<br>
			<label>Enter Age:</label>
			<form:input path="age"/>
			<form:errors path="age" cssStyle="color:red;"/>
			<br>
			<br>
			<div style="margin-bottom: 20px; margin-top: 40px;">
				<label>Enter Email:</label>
				<form:input path="cdto.email" placeholder="hello123@gmail.com" />
				<label style="margin-left: 20px;">Enter PhoneNumber:</label>
				<form:input path="pdto" />
			</div>

			<form:input type="submit" value="Submit" path="" />
		</form:form>
	</div>
</body>
</html>