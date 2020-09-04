<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<style type="text/css">
.error{
color:red
}

</style>
</head>
<body>
	<form:form action="processform" modelAttribute="customer">
		<div class="name">
		First name: <form:input path="firstName" />
		Last name: <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"/>
		</div>
		<div class="freepass" >Free Passes : 
			<!-- you can also give frontend validation
			<form:input type="number" path="freePass"/>-->
			<form:input path="freePass"/>
			<form:errors path="freePass" cssClass="error"/>

		</div>

		
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>































