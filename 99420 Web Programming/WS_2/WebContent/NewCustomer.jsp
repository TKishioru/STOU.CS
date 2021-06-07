<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.*"%>
<%@ page import="net.stou.database.*"%>
<%@ page import="net.stou.control.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Service</title>
</head>
<body>
	<%
		String action = request.getParameter("action");
	%>
	<h1>Customer Service</h1>
	<form action="CustomerController?action=listCustomer" method="post">
		<input style="width: 25%; text -algin: left; background-color: aqua;"
			type="submit" value="List Customer">
	</form>
	<form action="NewCustomer.jsp">
		<input
			style="width: 25%; text -algin: left; background-color: aquamarine;"
			type="submit" value="New Customer">
	</form>

	<h2><%=action%></h2>
	<form action="CustomerController?action=add" method="post"
		style="width: 25%; text -algin: center; background-color: gold;">
		profileName <input type="text" name="profilename"
			value="${customer.profilename }"/> <br>
		firstname <input type="text" name="firstname"
			value="${customer.firstname }"/> <br>
		lastname <input type="text" name="lastname"
			value="${customer.lastname }"/> <br> phone <input
			type="text" name="phone" value="${customer.phone }"/>
		<br> <input type="submit" value="Save" /><br>
	</form>


</body>
</html>