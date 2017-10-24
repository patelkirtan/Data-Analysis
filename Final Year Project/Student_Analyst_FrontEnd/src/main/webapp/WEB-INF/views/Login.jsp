<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Login</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/Login.css">
	</head>

  	<body>
  		<form action="">
  			<div class="container">
				<h2>Modal Example</h2>
				<!-- Trigger the modal with a button -->
				<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Open Modal</button>
			
				<!-- Modal -->
				<div class="modal fade" id="myModal" tabindex="-1" role="dialog">
					<div class="modal-dialog" role="document">
						<!-- Modal content-->
						<div class="modal-content">
							<div class="modal-body">
								<button type="button" class="close" data-dismiss="modal" style="color:#ffffff" aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
								<h3 class="modal-title">Login</h3>
								<div class="input-group input-group-md">
									<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
									<input id="Username" type="text" class="form-control" name="username" placeholder="Username" required/>
								</div>
								<br>
								<div class="input-group input-group-md">
									<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
									<input id="Password" type="password" class="form-control" name="password" placeholder="Password" required/>
								</div>
								<br>
								<button type="submit" class="btn btn-lg">Submit</button>
							</div>
						</div>
					</div>
				</div>
				<!--  <form name="loginform" id="loginform" action="http://shtheme.com/demosd/atena/wp-login.php" method="post" class="popup-form">
			    <input type="text" name="log" class="form-control form-white" placeholder="Username" id="email" value="">
			    <input type="text" name="pwd" class="form-control form-white" placeholder="Password" id="user_pass">  
				</form>-->
			</div>
		</form>
	</body>
</html>