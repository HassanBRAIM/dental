<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
<meta charset="utf-8">
<title>Registration Form</title>
<link rel="stylesheet" href="CSS/style1.css">
</head>

<body>
	<div class="Go">
		<form class="Re" action="Register" method="post">
			<img src="avatarp.jpg" alt="Avatar">
			<h1>Registartion Form</h1>
			<div class="register">
				<label for="firstname">First Name:</label><br> <input
					type="text" class="write" name="firstname"
					placeholder="Enter FisrtName" value=""><br>
				<br> <label for="lastname">Last Name:</label><br> <input
					type="text" class="write" name="lastname"
					placeholder="Enter LastName" value=""><br>
				<br> <label for="username">User Name:</label><br> <input
					type="text" class="write" name="username"
					placeholder="Enter UserName" value=""><br>
				<br> <label for="email">Email:</label><br> <input
					type="email" class="write" name="email" placeholder="Enter Email"
					value=""><br>
				<br> <label for="password">Password:</label><br> <input
					type="password" class="write" name="password"
					placeholder="Enter Password" value=""><br>
				<br> <label for="phone">Phone Number:</label><br> <input
					type="text" class="write" name="phone"
					placeholder="Enter Phone Number" value=""><br>
				<br> <input type="submit" class="btn" name="" value="Send">
			</div>
		</form>
	</div>
</body>

</html>
