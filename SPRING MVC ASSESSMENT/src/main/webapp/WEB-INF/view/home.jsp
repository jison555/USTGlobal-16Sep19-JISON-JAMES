<%@page import="com.ustglobal.springmvcassesment.dto.ProductBean"%>
<%@page import="com.ustglobal.springmvcassesment.dto.RetailerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
	RetailerBean bean = (RetailerBean) session.getAttribute("bean");
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./updatepassword">Update Password</a>
	<a href="./logout" style="float: right;">Logout</a>
	<h1 style="color: green">
		Welcome to Home Page <%=bean.getName()%></h1>
	<fieldset>
		<legend>Search Product By Id</legend>
		<form action="./search">
			<table>
				<tr>
					<td>Id:</td>
					<td><input type="number" name="productid"></td>
					<td><input type="submit" name="Search"></td>
				</tr>
			</table>
		</form>
	</fieldset>

	<%
		ProductBean productbean = (ProductBean) request.getAttribute("bean");
	%>
	<%
		if (productbean != null) {
	%>
	<table border="1">
		<tr>
			<th>ProductId</th>
			<th>ProductName</th>
			<th>PricePerUNit</th>
			<th>Quantity</th>
			<th>AmountPayable</th>
		</tr>
		<tr>
			
			<td><%=productbean.getProductname()%></td>
			<td><%=productbean.getPriceperunit()%></td>
			<td><%=productbean.getQuantity()%></td>
			<td><%=productbean.getAmountpayable()%></td>
		</tr>
	</table>
	<%
		}
	%>
	<h3>${msg}</h3>
</body>
</html>