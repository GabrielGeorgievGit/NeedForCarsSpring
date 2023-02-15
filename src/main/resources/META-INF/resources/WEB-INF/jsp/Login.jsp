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
		<h1>Login</h1>
	<form action="login" method="post">
		<div class="textField">
			<input type="text" required
			name="username" />
			<span></span>
			<label for="username">Username</label>
		</div>
		<div class="textField">	
			<input type="password" required
			 name="password"/>
			<span></span>
			<label for="password">password</label>
		</div>
		<input type="submit" value="Login" />
		<div class="signup">
			Not a member? <a href ="Register.jsp">Sign up</a><br>
			Go back to Home Page <a href ="index.jsp">Home</a>
		</div>
	</form>
	</div>
</body>
</html>