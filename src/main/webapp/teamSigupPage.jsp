<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="special"
	uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp Page</title>
</head>
<body>

	<h1>this is Team Signup page</h1>
	<special:form action="teamSingup" modelAttribute="team"> 
<!--  modelAttribute: it will
//act like base OOR plateform it will support to carray the fresh object.Inside the fresh object 
//we are going to store the frontend data in a single shot --> 
	Name:<special:input path="name" type="text" placeholder="enter your name" id="name" required="required"/> <br/><br/>
	UseName:<special:input path="username" type="text" placeholder="enter your username" id="username" required="required"/> <br/><br/>
	Password:<special:input path="password" type="password" placeholder="enter your password" id="password" required="required"/> <br/><br/>
	Logo:<special:input path="imagelink" type="url" placeholder="enter your logo url" id="imagelink" required="required"/> <br/><br/>
	<special:button type="submit">Signup</special:button>
	<special:button type="reset">Cancle</special:button>
</special:form>

</body>
</html>