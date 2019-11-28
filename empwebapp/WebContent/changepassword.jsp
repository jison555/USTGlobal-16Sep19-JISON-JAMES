<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>


<body>

<form action="./changepassword" method="post">
<fieldset>
<table>

<a href="./home">home</a>   
<a style="float:right" href="./logout">Logout</a>
<h4><%=msg%></h4>
	<tr>
		<td>New Password</td>
		<td><input type = "password" name= "password"></td>
	</tr>
		<tr>
		<td>Confirm Password</td>
		<td><input type = "confirmpassword" name ="confirmpassword"></td>
	</tr>
		<tr>
		<td><input type="reset" value = "reset"></td>
		<td><input type = "submit" name="changepassword"></td>
	</tr>
</table>

</fieldset>
</form>

</body>
</html>