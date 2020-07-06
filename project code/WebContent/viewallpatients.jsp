<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.tcs.ilp.models.patientM"%>
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

h1
{
text-align: center;
color: darkblue;
}
</style>
</head>
<body>
<h1>Hospital Management System</h1>

<%
List<patientM> patients;
String name;


%>
<%

	patients = (List<patientM>)session.getAttribute("patientsList");
if(!(patients.isEmpty()))
{
	 

%>
<h1>Patients List</h1>
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
}
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
<br>
<br>
<center>
<a href="admin.jsp"><input type="button" value="Back">
</center></a>

</body>
</html>