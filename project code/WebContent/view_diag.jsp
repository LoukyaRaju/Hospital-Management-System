<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.tcs.ilp.models.Diagnostics"%>
    <%@page import="com.tcs.ilp.models.patientM"%>
    <%@page import="java.util.List"%>
    
<!DOCTYPE html>
<html>
<head>
<style>
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
h1,h2
{
text-align: center;
color: darkblue;
}
p
{
color: black;
}
  .login-box{
    width: 400px;
    height: 400px;
    background: lightgrey;
    color: #fff;
    top: 50%;
    left: 50%;
    position: absolute;
    transform: translate(-50%,-50%);
    box-sizing: border-box;
    padding: 35px 30px;
}
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

h1
{
text-align: center;
color: darkblue;
}
</style>

</head>
<body>
<h1>Hospital Management System</h1>
<h2>Diagnostics</h2>

<%
List<patientM> patients;
String name;


%>
<h2>Patient Details</h2><br>
<%

	patients = (List<patientM>)session.getAttribute("patientList");
   if(patients.isEmpty())
   {
	   %>
	   <h1>No record found</h1>
<%} %>

<table border="1">
<tr>
     <th> ssn </th>
	
	<th> id </th>
	<th>  Name </th>
	<th> address</th>
	<th> age </th>
	<th> doj </th>
	<th> room </th>
	<th> city </th>
	<th> state </th>
	<th> status </th>
	
	
</tr>
	   <%
   
	for(patientM p : patients)
	{
	%>
  
		<tr> 
		   <td> <%=p.getSsn() %> </td>
	      <td> <%=p.getPatient_id() %> </td>
	     
	      
	      <td> <%=p.getPatient_name() %> </td>
	      
	         <td> <%=p.getAddress() %> </td>
	      <td> <%=p.getAge() %> </td>
	      <td> <%=p.getDoj() %> </td>
	      <td> <%=p.getRoom_type() %> </td>
	      <td> <%=p.getCity() %> </td>
	      <td> <%=p.getState() %> </td>
	      <td> <%=p.getStatus() %> </td>
	    
	     </tr>

<% 
}
%>
</table>

<%!int sum=0; %>

<%

	List<Diagnostics> diags =(List<Diagnostics>)session.getAttribute("diagInformation");
   if(!(diags.isEmpty()))
   {
%>
<h2>Diagnostics</h2>
<br>

<table border="1">
<tr>
<th>Diagnostic Name</th>
<th>Charge</th>
</tr>
<% 
   }
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
<h2>Diagnostics charges:</h2><%out.println("<h2>"+sum+"</h2>");sum=0; %>



<form action="adddiagnostics.jsp" method="get">
<center>
<input type="submit" value="Add Diagnostics"/>
</center>
</form>

<center>
<a href="Diagnostics.jsp"><input type="button" value="Back"></a>

</center>
</body>
</html>



















