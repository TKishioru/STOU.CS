<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>S_6296002626_HW2</title>
</head>
<body>
	<form action="signin" method="post">
		
        <h1 style="text-align: center; border: 10px;">Student Registration</h1>

	    <br><label>ID 			</label><input type="text" name="S_id">
	    <br><label>Name 		</label><input type="text" name="S_name">
	    <br><label>Loginname	</label><input type="text" name="S_loginname">
	    <br><label>Password 	</label><input type="password" name="S_password">
        <br><input type="submit" value="Register"/>
		<a href="index.jsp">Back</a>
	</form>
</body>
</html>