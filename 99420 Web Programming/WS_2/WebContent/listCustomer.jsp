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
	<script>
function myFunction() {
  var input, filter, table, tr, td, i, txtValue;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  table = document.getElementById("myTable");
  tr = table.getElementsByTagName("tr");
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[0];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }       
  }
}
</script>
</head>
<body>
	<h1>Customer Service</h1>

	<form action="CustomerController?action=listCustomer" method="post">
		<input style="width: 25%; text -algin: left; background-color: aqua;"
			type="submit" value="ListCustomer" />
	</form>
	<form action="NewCustomer.jsp?action=newcustomer">
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
			<%
				HashMap<String, Customer> Customers = (HashMap<String,Customer>)request.getAttribute("customerservice");
			%>
			<%
				for (String j : Customers.keySet()) {
					Customer c = Customers.get(j);
					String pn = c.getProfilename();
					String fn = c.getFirstname();
					String ln = c.getLastname();
					String p = c.getPhone();
			%>
			<tr>
				<td><%=pn%></td>
				<td><%=fn%></td>
				<td><%=ln%></td>
				<td><%=p%></td>
				<td>
					<form action="CustomerController?action=edit&profilename=<%=pn%>"
						method="post">
						<input type="submit" value="edit">
					</form>
				</td>
				<td><form
						action="CustomerController?action=delete&profilename=<%=pn%>"
						method="post">
						<input type="submit" value="delete">
					</form></td>
			</tr>
			<%
				}
			%>

		</tbody>
	</table>

</body>
</html>