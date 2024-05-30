<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>List Users</h2>
<table border="2" width="50%" cellpadding="2">
	<tr>
		<th>Id</th>
		<th>Username</th>
		<th>Password</th>
		<th>Edit</th>
		<th>Delete</th>
		
	</tr>
	<c:forEach var="user" items="${list}">
		<tr>
			<td>${user.id}</td>
			<td>${user.username}</td>
			<td>${user.password}</td>
			<td><a href="listuser/${user.id}">Edit</a></td>
			<td><a href="deleteuser/${user.id}">Delete</a></td>
		 </tr>
		
	</c:forEach>
	
</table>

<a href="userform">Add New User</a>