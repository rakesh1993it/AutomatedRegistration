<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.util.*,com.counciler.beans.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students Details</title>
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
			List<Student> students=(List<Student>)session.getAttribute("students");
		%>
	
	<table width="600" border="2" align="center" bgcolor="yellow">
		<caption><b><u> Students Details</u></b></caption>
		
		
		<tr><td>IDDD</td><td>Name</td><td>Address</td><td>Email</td><td>Contact No.</td><td>Course_ID</td></tr>
		
			<% if(students != null){%>
		<%for(Student st: students){ %>
		
		<tr><td><%=st.getS_id() %></td><td><%=st.getS_name() %></td><td><%=st.getS_address() %></td><td><%=st.getS_email() %></td><td><%=st.getS_contact() %></td><td><%=st.getCourse().getC_id() %></td></tr>
		<%} }else{%>
			<b>Course Not Found..!</b>
		<%} %>
		
	</table>
	<br></br>
	
	<table width="600" align="center" bgcolor="lightgreen">
		<tr><td align="left" bgcolor="lightgreen"><a href="home.jsp"><b>Home</b></a></td></tr>
	</table>
	
</body>
</html>