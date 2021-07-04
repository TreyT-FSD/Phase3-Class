<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Employees</title>
	<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
    crossorigin="anonymous">
</head>
<body>
	
	<div class="container">
		<h2>Employees</h2>
		<table class="table table-striped table-hover">
		  <thead>
			<tr>
			  <th scope="col">ID</th>
			  <th scope="col">Name</th>
			  <th scope="col">Designation</th>
			  <th scope="col">Salary</th>
			</tr>
		  </thead>
		  <tbody>
		    <c:forEach var="employee" items="${employees}">
			<tr>
				<td scope="row">${employee.id}</td>
				<td scope="row">${employee.name}</td>
				<td scope="row">${employee.designation}</td>
				<td scope="row">${employee.salary}</td>
			</tr>
			</c:forEach>
		  </tbody>
		</table>
	</div>
	
	<script 
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" 
		crossorigin="anonymous">
	</script>
</body>
</html>