<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*,com.counciler.beans.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage Course Details</title>
</head>
<style type="text/css">
caption {
font-style: italic;
font-size: xx-large;
padding-top: 9px;
}
</style>

<body bgcolor="lightgreen">

		<% 
		
		List<Course> courses= (List<Course>)session.getAttribute("courses");
		%>
		
	
	<form method="get" action="IncreseSeat" >
		<table align="center" height="100">
			<caption><b><u>Manage Course Seat</u></b></caption>
			
			
	     <tr><td>Enter No_of_seat: <input type="text" name="no_ofseat"></td></tr>
			
			<tr><td bgcolor="">Course_Name:</td><td><select name="c_id">
											<%if(courses!=null){
											for(Course c:courses){ %>
					<option value="<%=c.getC_id()%>"><%=c.getC_name() %></option>
				<%}}else{ %>
					<option value="no">Course Not Found</option>
				<%}%>	
			
												</select></td></tr>
			
						
		
			<tr><td colspan = "2" align="right"><input type="submit" name="ss" value="Increse"></td></tr>
			
		</table>
	</form>
	<br></br>
	<table  bgcolor="lightgreen">
		<tr><td align="left" bgcolor="lightgreen"><a href="home.jsp"><b>Home</b></a></td></tr>
	</table>
	</body>
</html>