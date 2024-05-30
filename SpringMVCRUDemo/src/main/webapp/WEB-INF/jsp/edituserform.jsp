<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
	<h2>Update User Form</h2>
	<form:form method="POST" action="/SpringMVCRUDemo/updateuser">
		<table>
			<tr>
			<td>Id</td>
			<td><form:input path="id" /></td>
			</tr>
			<tr>
			<td>Username</td>
			<td><form:input path="username" /></td>
			</tr>
			<tr>
			<td>Password</td>
			<td><form:input path="password" /></td>
			</tr>
			<tr>
			<td><input type="submit" value="Update User" /></td>
			</tr>
			
		</table>
	</form:form>
	
</body>
</html>