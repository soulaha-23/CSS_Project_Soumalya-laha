<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>player login page</title>
</head>
<body>
<h1>welcome to player login page</h1>
<form action="playerLogin" method="post">
	Username: <input type="text" name="username" placholder="enter your username" required="required"/><br/><br/>
	Password: <input type="password" name="password" placholder="enter your password" required="required"/><br/><br/>
	<button type="submit">Login</button>
	<button type="reset">Cancle</button>
</form>
</body>
</html>