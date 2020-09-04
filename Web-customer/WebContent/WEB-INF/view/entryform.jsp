<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Add customer</title>
<link
	href="https://fonts.googleapis.com/css2?family=Ubuntu&display=swap"
	rel="stylesheet">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/form.css">
<style>
* {
	box-sizing: border-box;
	width: 100%;
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

.container p {
	font-weight: bolder;
	font-family: 'Ubuntu', sans-serif;
	font-size: 15px;
}

.customerform {
	width: 50%;
	display: flex;
	align-items: center;
	justify-content: center;
	flex-direction: column;
}

.container button {
	margin: 22px 2px;
	height: 44px;
	width: 50%;
	font-size: 15px;
}
</style>
</head>

<body>
	<div class="container">
		<h1>CRM - Customer Relationship Manager</h1>
		<P>Fill below details of customer.</P>
		<form:form action="saveclient" modelAttribute="client" method="POST">
			<form:hidden path="id" />
			<div class="customerform">
				<div class="form">
					<form:input path="firstName" type="text" name="name"
						required="required" />
					<!-- animations done on label not on input         -->
					<label for="name" class="label-name"> <!-- content-name only represent only content of form like name, email, mobile number etc. -->
						<span class="content-name">First Name</span>
					</label>
				</div>

				<div class="form">
					<form:input path="lastName" type="text" name="name"
						required="required" />
					<!-- animations done on label not on input         -->
					<label for="name" class="label-name"> <!-- content-name only represent only content of form like name, email, mobile number etc. -->
						<span class="content-name">Last Name</span>
					</label>
				</div>

				<div class="form">
					<form:input path="email" type="text" name="name"
						required="required" />
					<!-- animations done on label not on input         -->
					<label for="name" class="label-name"> <!-- content-name only represent only content of form like name, email, mobile number etc. -->
						<span class="content-name">Email</span>
					</label>
				</div>
				<button>Save</button>
			</div>
		</form:form>
		<a href="${pageContext.request.contextPath}/customer/list">Back to
			the list.</a>
	</div>
</body>

</html>