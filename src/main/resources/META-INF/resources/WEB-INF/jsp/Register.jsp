<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login page</title>
	<link rel="stylesheet" href="/webapp/style/style.css">
</head>
<body>
	<div class="center">
		<h1>Register</h1>
	<form action="register" method="post">
		<div class="textField">
			<input type="text" name="username" required/>
			<span></span>
			<label for="username">Username</label>	
		</div>
		<div class="textField">
			<input type="text" name="phone" required/>
			<span></span>
			<label for="phone">Phone Number</label>
		</div>
		<div class="textField">
			<input type="password" name="password" required/>
			<span></span>
			<label for="password">Password</label>
		</div>
		<div class="textField">
			<input type="password" name="repeatPassword" required />
			<span></span>
			<label for="repeatPassword">Repeat Password</label>
		</div>
		<input type="submit" value="Register" />
		<div class="signup">
			You already have account? <a href ="Login.jsp">Login</a><br>
			Go back to Home Page <a href ="index.jsp">Home</a>
		</div>
	</form>
	</div>
</body>
</html>