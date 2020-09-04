<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<body>
	<div class="name">
	customer's name is : ${customer.firstName } ${customer.lastName }
	</div>
	<div class="freepass">
		Free Passes : ${customer.freePass }
	</div>
</body>
</html>