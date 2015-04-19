<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="com.counciler.beans.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>

</head>
<body  background="C:\Users\Rahul Roy\Desktop\p_img\pic1.jpg">
	
		

			<%
				Counciler counciler = (Counciler) request.getAttribute("c");
				if(counciler != null){
			%>
			
			
			Welcome <b><u><h2><%=counciler.getCu_name() %></h2></u></b>
				<%} %>
			
		
		
	<table height="10" width="900" border="0">
		
		<tr>
			<td>
			<a href="courseDetails"><b> Course Details </b></a></td>
					<td ><a href="register"><b> <h3>Register New Student </h3></b></a></td>
					<td><a href="Studentview"><b><h3> Student Details </h3></b></a></td>
					<td><a href="IndividualCourse.jsp"><b><h3>Individual Course Details</h3> </b></a></td>
					<td><a href="Seats"><b><h3> Manage Course Seat </h3></b></a></td>
			
			
			
			
			</tr>
			</table>
					
</body>
</html>