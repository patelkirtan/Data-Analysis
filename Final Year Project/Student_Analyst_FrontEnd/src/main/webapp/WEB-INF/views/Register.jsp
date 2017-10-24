<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Sign Up</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/Register.css">
	</head>

  	<body>
  		<form action="">
  		<div class="container">
			<h2>Register page</h2>
			<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#register">Open Modal</button>
			
			<!-- Modal -->
				<div class="modal fade" id="register" tabindex="-1" role="dialog">
					<div class="modal-dialog" role="document">
						<!-- Modal content-->
						<div class="modal-content">
							<div class="modal-body">
								<button type="button" class="close" data-dismiss="modal" style="color:#ffffff" aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
								<h3 class="modal-title">Sign Up</h3>
								<div class="input-group input-group-md">
									<input id="Name" type="text" class="form-control" name="name" placeholder="Name" required/>
								</div>
								<br>
								<div class="input-group input-group-md">
									<input id="Lastname" type="text" class="form-control" name="lastname" placeholder="Last Name" required/>
								</div>
								<br>
								<div class="input-group input-group-md">
									<input id="Email" type="email" class="form-control" name="email" placeholder="Email" required/>
								</div>
								<br>
								<div class="input-group input-group-md">
									<input id="Password" type="password" class="form-control" name="password" placeholder="Password" required/>
								</div>
								<br>
								<button type="submit" class="btn btn-lg">Submit</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
	</body>
</html>