<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./home">Home</a>
	<br>
	<a href="./logout" style="float: right;">Logout</a>
	<fieldset>
		<legend style="color: green"><h2>Update Password</h2></legend>
		<form action="./updatepassword" method="post">
			<table>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Confirm Password:</td>
					<td><input type="password" name="confirmpassword"></td>
				</tr>
				<tr>
					<td><input type="submit" name="change"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>