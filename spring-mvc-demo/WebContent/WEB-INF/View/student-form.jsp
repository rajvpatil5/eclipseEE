<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<style type="text/css">
.country {
	margin: 12px 0px
}
</style>
</head>
<body>
	<form:form action="processform" modelAttribute="student">
		First name: <form:input path="firstName" />
		Last name: <form:input path="lastName" />

		<div class="country">
			Country:
			<form:select path="country">
				<form:options items="${student.countryOptions }" />
			</form:select>
			<!--	
		We provide this info from constructor
			<form:select path="country">
				<form:option value="Brazil" label="Brazil"></form:option>
				<form:option value="India" label="India"></form:option>
				<form:option value="USA" label="United States of America"></form:option>
				<form:option value="France" label="France"></form:option>
				<form:option value="Italy" label="Italy"></form:option>
			</form:select>
			-->
		</div>

		<div class="os">
			Select Operating System : Linux
			<form:checkbox path="operatingSystem" value="Linux" />
			Mac OS
			<form:checkbox path="operatingSystem" value="Mac OS" />
			Windows
			<form:checkbox path="operatingSystem" value="Windows" />
		</div>

		<div class="gender">
			Select favorite language : Java
			<form:radiobutton path="favoriteLanguage" value="Java" />
			PHP
			<form:radiobutton path="favoriteLanguage" value="PHP" />
			Python
			<form:radiobutton path="favoriteLanguage" value="Python" />
			Typescript
			<form:radiobutton path="favoriteLanguage" value="Typescript" />

		</div>
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>































