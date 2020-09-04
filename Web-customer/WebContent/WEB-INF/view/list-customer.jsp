<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>CMR</title>
<link
	href="https://fonts.googleapis.com/css2?family=Ubuntu&display=swap"
	rel="stylesheet">
<style>
* {
	box-sizing: border-box;
}

body {
	margin: 0px;
	padding: 0px;
}

.container h1 {
	color: white;
	background-color: rgb(1, 149, 50);
	padding: 12px 2px;
	margin: 0px;
	font-family: 'Ubuntu', sans-serif;
}

.container button {
	margin: 22px 2px;
	height: 44px;
	width: 122px;
}

.customers {
	display: grid;
	grid-template-columns: 1fr 1fr 1fr 1fr;
}

.customers div {
	display: flex;
	align-items: center;
	justify-content: center;
}

.title {
	color: white;
	background-color: rgb(1, 149, 50);
	font-family: 'Ubuntu', sans-serif;
	font-weight: bolder;
	font-size: 20px;
	padding: 11px 0px;
}

.custtable {
	display: grid;
	grid-template-columns: 1fr 1fr 1fr 1fr;
	background-color: rgb(235, 235, 235);
}

.table {
	display: flex;
	align-items: center;
	justify-content: center;
}

.table a {
	margin: 2px 2px;
}
</style>
</head>
<body>
	<div class="container">
		<h1>CRM - Customer Relationship Manager</h1>
		<button onclick="window.location.href='showform';return false;">Add
			Customer</button>
		<div class="customers">
			<div class="title">First Name</div>
			<div class="title">Last Name</div>
			<div class="title">Email</div>
			<div class="title">Action</div>
		</div>
		<div class="custtable">
			<c:forEach var="tempClient" items="${ client}">

				<c:url var="updateLink" value="/customer/showformforupdate">
					<c:param name="clientId" value="${ tempClient.id}"></c:param>
				</c:url>

				<c:url var="deleteLink" value="/customer/delete">
					<c:param name="clientId" value="${ tempClient.id}"></c:param>
				</c:url>

				<div class="table">${tempClient.firstName}</div>
				<div class="table">${tempClient.lastName}</div>
				<div class="table">${tempClient.email}</div>
				<div class="table">
					<a href="${updateLink }">update</a>|
					<a href="${deleteLink }" onclick="if (!(confirm('Are you sure you want to delete this?'))) return false">delete</a>
				</div>
			</c:forEach>
		</div>
	</div>
</body>

</html>