<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="special" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>This is the Mangament Signup page</h1>
<special:form action="managementSingup" modelAttribute="management"> 
<!--  modelAttribute: it will
//act like base OOR plateform it will support to carray the fresh object.Inside the fresh object 
//we are going to store the frontend data in a single shot --> 
	Name:<special:input path="name" type="text" placeholder="enter your name" required="required" /> <br/><br/>
	
	Password:<special:input path="password" type="password" placeholder="enter your password" required="required"/> <br/><br/>
	<special:button>Signup</special:button>
	<special:button type="reset">Cancle</special:button>
</special:form>

</body>
</html>