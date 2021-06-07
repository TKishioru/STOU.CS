<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.*"%>
<%@ page import="net.stou.database.*"%>
<%@ page import="net.stou.control.*"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.Collection"%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Customer Service</title>

</head>
<body>
	<h1>Customer Service</h1>

	<form action="CustomerController?action=listCustomer" method="post">
		<input style="width: 25%; text -algin: left; background-color: aqua;"
			type="submit" value="ListCustomer" />
	</form>
	<form action="NewCustomer.jsp">
		<input
			style="width: 25%; text -algin: left; background-color: aquamarine;"
			type="submit" value="NewCustomer" />
	</form>
	<h2>List Customer</h2>
	Search Text
	<form action="index.jsp">
		<input type="text" name=secrchtext id="myInput"/> <input type="submit"
			value="Search" name="search" />
	</form>
	<br>
	<table  id="myTable" border="1"
		style="width: 100%; text -algin: left; background-color: gold;">
		<thead>
			<tr>
				<th>profileName</th>
				<th>firstname</th>
				<th>lastname</th>
				<th>phone</th>
				<th colspan=2>Action</th>
			</tr>
		</thead>

		<tbody>

		</tbody>
	</table>

</body>
</html>