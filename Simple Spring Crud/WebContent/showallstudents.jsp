<%@page import="com.springframework.bin.student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	List<student> students = (List) session.getAttribute("students");
	session.removeAttribute("students");
%>
<body>
<br>
<br>
<br>
	<table align="center" margin-top="100px" border="3">

		<tr>
			<th>id</th>
			<th>fname</th>
			<th>lname</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>

		<%
			for (student s : students) {
		%>
		<tr>
			<td><%=s.getId()%></td>
			<td><%=s.getFname()%></td>
			<td><%=s.getLname()%></td>
			<td><form action="StudentController" method="post">
					<input type="hidden" name="id" value="<%=s.getId()%>"><input
						type="submit" name="action" value="update">
				</form></td>
			<td><form action="StudentController" method="post">
					<input type="hidden" name="id" value="<%=s.getId()%>"><input
						type="submit" name="action" value="Delete">
				</form></td>

		</tr>

		<%
			}
		%>
	</table>

<a href="index.jsp">Add New Student</a>
</body>
</html>