<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="StudentController" method="post">
		<table align = "center"  >
			
			<tr>
				<td><b>Student Registration Form</b></td>
			</tr>
			<tr>
				<td>fname</td>
				<td><input type="text" name="fname">
			</tr>
			<tr>
				<td>lname</td>
				<td><input type="text" name="lname">
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="AddStudent" name="action">
			</tr>
		
		</table>

	</form>
<a href="showallstudents.jsp">Show All Students</a>
</body>
</html>