<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>This is the Home page of your website</h1>
	<form action="homePage">
		<h2>Choose your role</h2>
		<input type="radio" id="managment" name="role" value="managment" />
		<label for="managment">Management</label>
		<br/> <br/>
		
		<input type="radio" id="Team" name="role" value="team" />
		<label for="Team">Team</label>
		<br/> <br/>
		
		<input type="radio" id="player" name="role" value="player" />
		<label for="player">Player</label>
		<br/> <br/>
		
		<button type="submit"> Submit</button>
		<button type="reset"> Cancel</button>
	</form>
	
	<a href="LoginArea.jsp">Already is exist account for team player</a>
</body>
</html>