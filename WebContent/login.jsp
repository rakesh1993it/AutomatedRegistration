<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.counciler.beans.*;" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lightblue" text="green">
	<center><h2>Login Page</h2></center>
	<% 
		Counciler counciler =(Counciler)session.getAttribute("counciler");
	%>
	
	<table align="center">
	<form method="GET" action="login">
	<tr>
	<td>Username:</td><td><input type="text" name="uname">
	</tr>
	<tr>
	<td>Password:</td><td><input type="password" name="upass">
	</tr>
	<tr>
	<td colspan = "2" align="right"><input type="submit" name="ss" value="login"></td>
	</tr>
	</form>
	</table>
</body>
</html>