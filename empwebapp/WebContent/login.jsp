<%@page import="javax.servlet.annotation.WebServlet"%>
<%@page import="javax.xml.ws.WebEndpoint"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>

<%
	String id = "";
	Cookie[] cookies = request.getCookies();

	if (cookies != null) {
		for (Cookie cookie : cookies) {

			if (cookie.getName().equals("alwaysRemember")) {
				id = cookie.getValue();
			}
		}
	}
%>

<body>
<h4><%=msg %></h4>

	<form action='./login' method='post'>
		<fieldset>
			<table align='center'>
				<tr>
					<td>ID</td>
					<td><input type='number' name='id' value='<%=id%>' ></td>
				</tr>
				<tr>
					<td>password</td>
					<td><input type='password' name='password'></td>
				</tr>
				<tr>
					<td><input type='checkbox' name='rememberme' value='check'></td>
					<td>Remember me</td>
				</tr>
				<tr>
					<td><input type='submit' name='login'></td>
				</tr>
				<tr>
					<td><a href='register.html'>Register</a></td>
				</tr>
			</table>
		</fieldset>
	</form>



</body>
</html>