<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1>Spring Security Home</h1>
	<form:form action="${pageContext.request.contextPath }/logout"
		method="post">
	User : <security:authentication property="principal.username" />
	User - Role : <security:authentication property="principal.authorities" />
	
	<security:authorize access="hasRole('ADMIN')">
	<div class="admin">
	 <a href="${pageContext.request.contextPath}/systems">only for admin</a>
	</div>
	</security:authorize>
	<security:authorize access="hasRole('MANAGER')">
	<div class="leader">
	 <a href="${pageContext.request.contextPath}/leaders">only for manager</a>
	</div>
	</security:authorize>
	<security:authorize access="hasRole('EMPLOYEE')">
	<div class="employee">
	 <a href="${pageContext.request.contextPath}/employees">only for employees</a>
	</div>
	</security:authorize>
		<input type="submit" value="logout">

	</form:form>
</body>
</html>