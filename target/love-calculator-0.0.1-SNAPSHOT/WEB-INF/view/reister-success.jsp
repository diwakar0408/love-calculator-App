<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success</title>
</head>
<body>
<h1>Register Success</h1>
<p>Name:${detailsdao.youName}</p>
<p>Email:${detailsdao.cdto.email}</p>
<p>country code:${detailsdao.pdto.countryCode}</p>
<p>Age:${detailsdao.age}</p>
</body>
</html>