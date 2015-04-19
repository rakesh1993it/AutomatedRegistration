<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*,com.counciler.beans.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lightgreen">
	
	<%
		List<Course> courses = (List<Course>)session.getAttribute("courses");
	%>
	
	
	<table width="600" align="center" bgcolor="lightgreen">
		<tr><td align="center"><h2><u>Register New Student</u></h2></td></tr>
	</table>
	
	<form method="GET" action="RegisterStudent">
		<table align="center" height="100">
		
			<tr><td><input type="hidden" name="uid" value="SomeValue"></td></tr>
			<tr><td bgcolor="yellow">Name : </td><td><input type="text" name="sname"></td></tr>
			<tr><td bgcolor="yellow">Address : </td><td><input type="text" name="sadd"></td></tr>
			<tr><td bgcolor="yellow">Email : </td><td><input type="text" name="email"></td></tr>
			<tr><td bgcolor="yellow">Contact No. : </td><td><input type="text" name="cnct_no"></td></tr>
			<tr><td bgcolor="yellow">Course : </td><td><select name="c_id">
											<%
											if(courses!=null){
											for(Course c:courses){ %>
					<option value="<%=c.getC_id()%>"><%=c.getC_name() %></option>
				<%}}else{ %>
					<option value="no">Course Not Found</option>
				<%}%>	
			
												</select></td></tr>
			
						
			
			<tr><td colspan = "2" align="right"><input type="submit" name="ss" value="RegisterStudent"></td></tr>
			
			
		</table>
	</form>
	<br></br>
	<table width="250" align="center" bgcolor="lightgreen">
		<tr><td align="left" bgcolor="lightgreen"><a href="home.jsp"><b>Home</b></a></td></tr>
	</table>
	
	
	
	
</body>
</html>