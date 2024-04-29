<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mangement login page</title>
</head>
<body>

<h1>This is the management login page</h1>
<form action="managementLogin" method="post">
	Username:<input type="text" name="name" placeholder="enter your name" required="required" /><br/><br/>
	password:<input type="password" name="password" placeholder="enter your password" required="required"/><br/><br/>
	<button type="submit">Login</button> <button type="reset">Cancle</button>
</form>
</body>
</html>