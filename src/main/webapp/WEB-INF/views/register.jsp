<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>

<h1>Welcome</h1>
<p>We're glad to have you!</p>
<form action="/register" method="post">
<input name="firstName" type="text" placeholder="First Name"/>
<input name="lastName" type="text" placeholder="Last Name"/>
<input name="email" type="email" placeholder="Email"/>
<input name="phoneNumber" type="tel" placeholder="Phone Number"/>
<input name="password" type="password" placeholder="Password"/>
<input type="submit" value="Register"/>
</form>

</body>
</html>