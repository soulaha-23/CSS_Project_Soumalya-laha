<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Adding the Amount</h1>
<% int id= Integer.parseInt(request.getParameter("id")); %>

<form action="addAmountForTeams">
	Add Amount:<input type="number" name="wallet" placholder="enter your amount" required="required" /> <br/><br/>
	
	<input type="text" name="tid" value="<%=id%>" hidden="hidden" />
	<button type="submit">Add Amount</button> <button type="reset">Cancle</button>
</form>
</body>
</html>