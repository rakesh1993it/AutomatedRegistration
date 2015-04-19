<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage Course Details</title>
</head>
<style type="text/css">
caption {
bgcolor: lightgreen;
font-style: normal;
font-size: xx-large;
padding-top: 9px;
}
</style>

<body>
	<center><table bordercolor="red" border="0" height="300" width="600" bgcolor="lightgreen">
	<caption><b><u>Manage Course Details</u></b></caption>
		<tr>
			<td bgcolor="yellow">
				<form method="post" action="">
					<table align="center" height="100" width="100">
						<tr><td bgcolor="yellow">Course_ID : </td><td><SELECT NAME="S">
                                 			<OPTION VALUE="Java8">1</OPTION>
                                 			<OPTION VALUE="J2EE">2</OPTION>
                                 			<OPTION VALUE="php">3</OPTION>
                                 			<OPTION VALUE="Android">4</OPTION>
                                 			<OPTION VALUE="C#.net">5</OPTION>
                                 			<OPTION VALUE="DBMS">6</OPTION>
                        			</SELECT></td></tr>
                        <tr><td bgcolor="yellow">No. of Seats : </td><td><input type="text" name="sname"></td></tr>
                        <tr><td><br></td></tr>
						<tr><td colspan = "2" align="right"><input type="submit" name="ss" value="Register"></td></tr>
						<tr><td><br></td></tr>
						<tr><td><table width="100" align="center">
									<tr><td align="left"><a href="counsilerHome.jsp"><b>Home</b></a></td></tr>
								</table>
						</td></tr>
					</table>
				</form>
			</td>
			<td>
				<table align="center" height="100" width="50" border="1" >
					<tr><td bgcolor="yellow">Course_Name</td><td bgcolor="yellow">Course_ID</td></tr>
					<tr><td>Java 8</td><td>1</td></tr>
					<tr><td>J2EE</td><td>2</td></tr>
					<tr><td>PHP</td><td>3</td></tr>
					<tr><td>Android</td><td>4</td></tr>
					<tr><td>C#.net</td><td>5</td></tr>
					<tr><td>DBMS</td><td>6</td></tr>
				</table>
			</td>
		</tr>
	</table></center>
	</body>
</html>