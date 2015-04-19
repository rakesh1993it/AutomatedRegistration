<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.*,com.counciler.beans.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Courses Details</title>
</head>
<style type="text/css">

td, th {
border: thin dotted gray;
padding: 5px;
}
caption {
font-style: italic;
font-size: xx-large;
padding-top: 9px;
}
</style>

<body bgcolor="lightgreen">
	
	<% 
	List<Course> courses = (List<Course>)session.getAttribute("courses");
		%>
	
		<center><b><u><h2>All Courses Details</h2></u></b></center>
		</br>
		
		
		<table width="600" border="2" align="center" bgcolor="yellow">
		<tr><td class="center">ID</td><td>Course Name</td><td>Duration(Days)</td><td>Fees(Rupees)</td><td>No. of Seats</td></tr>
		
		<%
		if(courses != null){
		for(Course c:courses){ %>
		
		<tr><td class="center"><%=c.getC_id() %></td><td class="center"><%=c.getC_name() %></td><td class="center"><%=c.getC_duration() %></td><td><%=c.getC_fee() %></td><td><%=c.getC_no_ofseats() %></td></tr>
		
		<%} }else{%>
			<b>Course Not Found..!</b>
		<%} %>
	</table>
	<br></br>
	<table bgcolor="lightgreen" border="0">
		<tr><td align="left" bgcolor="lightgreen"><a href="home.jsp"><b>Home</b></a></td></tr>
	</table>

</body>
</html>