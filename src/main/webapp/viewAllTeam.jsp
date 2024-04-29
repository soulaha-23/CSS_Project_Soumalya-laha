<%@page import="java.util.List"%>
<%@page import="IPL.Dto.Team"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="special" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View all Teams</title>
</head>
<body>
<h1>view all teams</h1>

<table border="1">
	<tr>
		<th>Team Name</th>
		<th>wallet</th>
		<th>status</th>
		<th>Change status</th>
		<th>Add Amount</th>
		<th>Team player</th>
	</tr>
	
	<special:forEach var="team" items="${teams}">
		<tr>
		<td>${team.getName()}</td>
		<td>${team.getWallet() }</td>
		<td>${team.isStatus() }</td>
		<td><a href="changeStatus?id=${team.getTid()}"><button>Change status</button></a></td>
		<td><a href="addAmount.jsp?id=${team.getTid()}"><button>Add Amount</button></a></td>
		<td>Team player</td>
		</tr>
	</special:forEach>
	

</table>
</body>
</html>