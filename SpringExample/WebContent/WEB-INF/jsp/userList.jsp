<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
		<tr>
			<th>
			ID
			</th>
			<th>
			First Name
			</th>
			<th>
			Last Name
			</th>
		</tr>



	<c:forEach items="${userList}" var="user">
	<tr>
		<td>${user.id}</td> 
		<td>${user.firstName}</td> 
		<td>${user.lastName}</td>
		<td><a href="editUser?id=${user.id}">Edit</a></td>
		<td><a href="deleteUser?id=${user.id}">Delete</a></td>
		
	</tr>
	</c:forEach>


	</table>

</body>
</html>