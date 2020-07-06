<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.tcs.ilp.models.Diagnostics"%>
   <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>


<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
input[type=button] {
  width: 50%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

p
{
color: black;
}

h1
{
text-align: center;
color: darkblue;
}
input[type="button"] {
  width: 50%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid grey;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=submit] {
  width: 50%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
</style>
</head>
<body>
<h1>Hospital Management System</h1>
<form action="adddiagnostics.jsp">
<h1> Diagnostics added successfully</h1>
<%!int sum=0; %>
<table border="1">
<tr>
<th>Diagnostic Name</th>
<th>Charge</th>
</tr>

<%

	List<Diagnostics> diags =(List<Diagnostics>)session.getAttribute("diagInfo");
 for(Diagnostics d: diags)
 {
%>
<tr>
 <td> <%=d.getDiagnosticTestName() %> </td>
	      <td> <%=d.getCharge() %> </td>
	     </tr>
	     <%
	     sum+=d.getCharge();
	     } %>
</table>
<h2>Diagnostics charges:</h2><%out.println("<h2>"+sum+"</h2>");
sum=0;%>
<center>
<input type="submit" value="Add Diagnostics">
</center>
</form>
<center>
<a href="Diagnostics.jsp"><input type="button" value="Back"></a>
</center>

</body>
</html>