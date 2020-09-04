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
	<div class="student">The student is confirmed :
		${student.firstName } ${student.lastName }</div>
	<div class="country">The student's country is: ${student.country}
	</div>
	<div class="OS">
		Student's fav OS is:
		<ul>
			<c:forEach var="temp" items="${student.operatingSystem }">
				<li>${temp }</li>
			</c:forEach>
		</ul>
	</div>

	<div class="language">Favorite Language :
		${student.favoriteLanguage }</div>
</body>
</html>