<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>S_6296002626_HW2</title>
	    <style>
        a:link, a:visited {
            background-color: #f44336;
            color: white;
            padding: 14px 25px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
        }
        
        a:hover, a:active {
            background-color: red;
        }
        h2.pos_right {
            position: relative;
            left: 1800px;
        }
        </style>
</head>
<body>
	<form action="index" method="post">
		<a href="index.jsp">Home</a>
        <h1 style="text-align: center; border: 10px;">STOU Online School</h1>
        
        <a href="stou-signin.jsp">SignIn</a>    <label>|</label>
        <a href="stou-login.jsp">Login</a>     	<label>|</label>
        <a href="stou-profile.jsp">Profile</a>  <label>|</label>
        <a href="stou-search.jsp">Search</a>    <label>|</label>
        <a href="stou-enroll.jsp">Enroll</a>    <label>|</label>
        <a href="stou-logout.jsp">Logout</a>
    </form>
</body>
</html>