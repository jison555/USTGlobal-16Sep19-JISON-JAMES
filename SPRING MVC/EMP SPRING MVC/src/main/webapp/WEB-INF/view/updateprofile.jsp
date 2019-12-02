<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./home">home</a>
<a href="./logout">logout</a>

<fieldset>
	<form action="./update" method="post">
		<table>
			<tr>
			<td>enter new name:</td>
			<td><input type="text" name="name"></td>
			</tr>
			
			<tr>
			<td>enter new password:</td>
			<td><input type="password" name="password"></td>
			</tr>
			
			<tr>
			<td>enter new email:</td>
			<td><input type="email" name="email"></td>
			</tr>
			
					<tr>
			<td>enter your gender:</td>
			<td><input type="text" name="gender"></td>
			</tr>
		
			<tr>
			<td>enter new doj:</td>
			<td><input type="date" name="doj"></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="update"></td>
			</tr>
		
		</table>
	</form>
</fieldset>



</body>
</html>