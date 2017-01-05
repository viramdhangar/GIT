<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Edit record
<br>
${message}

<form action="editUser" method="POST">

	ID<input type="text" name="id" value="${user.id}">
	First Name<input type="text" name="firstName" value="${user.firstName}">
	Last Name<input type="text" name="lastName" value="${user.lastName}">

	<input type="submit" value="Update">
</form>
</body>
</html>