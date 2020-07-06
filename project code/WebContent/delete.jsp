<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.tcs.ilp.models.patientM"%>
    <%@page import="java.util.List"%>
  
<!DOCTYPE html>
<html>
<head>
<!-- <meta charset="ISO-8859-1">
<title>Insert title here</title>-->


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
  width: 100%;
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
input[type=text], input[type="number"], input[type="date"] select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid grey;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=password], select {
  width: 100%;
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

input[type=submit]:hover {
  background-color: grey;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
h1
{
text-align: center;
color: darkblue;
}
h2
{

color: darkblue;
}

input[type="date"]
{
 width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid grey;
  border-radius: 4px;
  box-sizing: border-box;
    }
   
</style>

</head>
<body>
<h1>Hospital Management System</h1>
<form action="delete" method="get">
<div class="login-box">
<h1>Update Patient</h1>
<%
List<patientM> patients;
String name;


%>
<%

	patients = (List<patientM>)session.getAttribute("patientlist");
   if(!(patients.isEmpty()))
   {
	   %>
<h1>Patient List</h1>
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
<center>
<input type="submit" value="Confirm Delete"/>
</center></td>



</form>
</div>

</body>
</html>