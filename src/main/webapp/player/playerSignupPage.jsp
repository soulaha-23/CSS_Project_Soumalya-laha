<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="special"
	uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Player Signup page</title>
</head>
<body>
	<h1>Welcome to player signup page</h1>
	<special:form action="playerSignup" method="post" modelAttribute="player">  
 
	Name:<special:input path="name" type="text"
			placeholder="enter your name" id="name" required="required" />
		<br />
		<br />
	UseName:<special:input path="username" type="text"
			placeholder="enter your username" id="username" required="required" />
		<br />
		<br />
		Email:<special:input path="email" type="email"
			placeholder="enter your email" id="imagelink" required="required" />
		<br />
		<br />
	Password:<special:input path="password" type="password"
			placeholder="enter your password" id="password" required="required" />
		<br />
		<br />
	Role:<special:select path="role" id="xc">
		<special:option value="">Select</special:option>
		<special:option value="batsman">Batsman</special:option>
		<special:option value="bowler">Bowler</special:option>
		<special:option value="wicket keeper">Wicket Keeper</special:option>
		<special:option value="all rounder">All rounder</special:option>
		
	</special:select>
	<br/><br/>
	
	Country:<special:input path="country" type="text"/><br/><br/>
	Base Price: <special:input path="basicPrice" type="text"/><br/><br/>
		<special:button type="submit">Signup</special:button>
		<special:button type="reset">Cancle</special:button>
	</special:form>

</body>
</html>