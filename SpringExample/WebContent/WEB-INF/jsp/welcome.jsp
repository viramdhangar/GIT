<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Welcome spring mvc.
<br>
${message}

<form action="saveUser" method="POST">

	ID<input type="text" name="id">
	First Name<input type="text" name="firstName">
	Last Name<input type="text" name="lastName">

	<input type="submit" value="Submit">
</form>
<a href="getUsers">User List</a>
<form action="getUserById" method="get">
	Search ID <input type="text" name="id">
	<input type="submit" value="search">
</form>
</body>
</html>