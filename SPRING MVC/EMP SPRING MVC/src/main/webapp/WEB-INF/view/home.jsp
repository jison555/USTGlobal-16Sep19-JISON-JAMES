<%@page import="com.ustglobal.empspringmvc.dto.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    	EmployeeBean bean = (EmployeeBean)session.getAttribute("bean");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./changepassword">change password</a>  
<a href="./update">update profile</a> 
<a href="./delete">Delete profile</a>
<a href="./logout" style="float: right;">logout</a>

<h2>Welcome <%=bean.getName()%></h2>


<fieldset>
	<legend>Search Employee</legend>
	<form action="./search">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="number" name="id"></td>
				<td><input type="submit" name="Search"></td>	
			</tr>			
		</table>	
	</form>
</fieldset>
<%
EmployeeBean employeebean = (EmployeeBean)request.getAttribute("bean");
%>

<%
if(employeebean!=null){
%>

<table>
	<tr>	
	<th>Name</th>
	<th>Email</th>
	<th>Gender</th>
	<th>DOJ</th>
	</tr>
	
	<tr>
		<td><%=employeebean.getName() %></td>
		<td><%=employeebean.getEmail() %></td>
		<td><%=employeebean.getGender()%></td>
		<td><%=employeebean.getDoj() %></td>
	</tr>
</table>

<%	
}else{
%>
<h3>${msg}</h3>
<%} %>
</body>
</html>