<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- spring form taglib- every form element must be prefixed -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<!-- CSS only (bootstrap stuff) -->
	<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
    crossorigin="anonymous">
    
	<title>User Registration</title>

</head>
<body>
	<h2>User Registration</h2>
	
	<!-- container class gives us some padding to move text off the left page boundary -->
	<div class="container">
	
		<div class="card" style="width: 18rem;">
			<div class="card-header">User Registration</div>
			
			<form:form action="userRegistration" method="post" modelAttribute="userObj" >
			
				<div class="form-group">
					<label for="firstName">First Name</label>
					<form:input path="firstName" cssClass="form-control"/>
					<!-- path is the property from the user class that this value should be stored in -->
				</div>
				
				<div class="form-group">
					<label for="lastName">Last Name</label>
					<form:input path="lastName" cssClass="form-control"/>
				</div>
				
				<div class="form-group">
					<label for="email">Email</label>
					<form:input path="email" cssClass="form-control"/>
				</div>
				
				<div class="form-group">
					<label for="userName">User Name</label>
					<form:input path="userName" cssClass="form-control"/>
				</div>
				
				<div class="form-group">
					<label for="password">password</label>
					<form:input path="password" cssClass="form-control"/>
				</div>
				
				<div class="form-group">
					<form:button cssClass="btn btn-sucess">Submit</form:button>
				</div>
			
			</form:form>
			
		</div>
</div>
		
	</div>
	
	<button class="btn btn-success">click me</button>
	
	<!-- get bootstrap js to make this responsive -->
	<script 
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" 
		crossorigin="anonymous">
	</script>
</body>
</html>