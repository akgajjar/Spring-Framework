<%@page import="com.springframework.bin.student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%
	student student = (student) session.getAttribute("student");
	session.removeAttribute("student");
%>
<body>

	<form action="StudentController" method="post">
		<table align = "center"  >
			
			<tr>
				<td><b>Student Registration Form</b></td>
			</tr>
			<input type="hidden" name="id" value="<%=student.getId()%>">
			
			<tr>
				<td>fname</td>
				<td><input type="text" name="fname" value = "<%=student.getFname()%>">
			</tr>
			<tr>
				<td>lname</td>
				<td><input type="text" name="lname" value="<%=student.getLname()%>">
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="UpdateStudent" name="action">
			</tr>
		
		</table>

	</form>
<a href="showallstudents.jsp">Show All Students</a>
</body>
</html>