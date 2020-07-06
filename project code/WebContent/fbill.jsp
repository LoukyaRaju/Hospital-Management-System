<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="com.tcs.ilp.models.Diagnostics"%>
    <%@page import="com.tcs.ilp.models.patientM"%>
     <%@page import="com.tcs.ilp.models.Medicine"%>
   
    <%@page import="java.util.List"%>
    <%@page import="java.text.SimpleDateFormat" %>
    <%@page import="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<style>
input[type="button"] {
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
</style>

</head>
<body>
<h1>Hospital Management System</h1>
<%
List<patientM> patients;
String doj="";
String dod="";
String room="";
int amt=0,bed=0,tot=0;
int sum=0;
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
	<th> dod </th>
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
	      <%doj=p.getDoj(); %>
	      <td > <%java.text.DateFormat df=new java.text.SimpleDateFormat("yyyy-MM-dd"); %>
	      <%= df.format(new java.util.Date()) %>
	      <% dod=df.format(new java.util.Date()); %>
	    </td>
   
	      <td> <%=p.getRoom_type() %> </td>
	       <%room=p.getRoom_type(); %>
	     
	      <td> <%=p.getCity() %> </td>
	      <td> <%=p.getState() %> </td>
	      <td> <%=p.getStatus() %> </td>
	    
	     </tr>

<% 
}

%>

</table>

<%

Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(doj); 
Date date2=new SimpleDateFormat("yyyy-MM-dd").parse(dod); 
long difference =  (date1.getTime()-date2.getTime())/86400000;
long diff= Math.abs(difference);
if(room.equals("Single"))
{
	amt=1000;
}
else if(room.equals("SemiSharing"))
{
	amt=500;
}
if(room.equals("General"))
{
	amt=250;
}
 bed=(int)(diff*amt);
%>
<h2> No of Days:<%=diff %></h2>
<h2>Bed Charge:<%=bed%></h2>





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
<h2>Diagnostics charges:<%=sum %></h2>

<% 

%>



<br>
<%
int sum1=0;
	List<Medicine> diags1 =(List<Medicine>)session.getAttribute("MedInformation");
//List<Integer> quants =(List<Integer>)session.getAttribute("quantList");
   if(!(diags1.isEmpty()))
   {
%>
<h2>Medicines Issued</h2>
<br>

<table border="1">
<tr>
<th>Medicine Id</th>

<th>Medicine Name</th>
<th>Quantity</th>

<th>Price</th>
</tr>
<% 
   }
   int i=0;
 for(Medicine d1: diags1)
 {i=1;
%>

<tr>
 <td> <%=d1.getMedi_id() %> </td>
	      <td> <%=d1.getMedi_name()    %> </td>
	       <td> <%=d1.getMedi_quant() %> </td>
	      <td> <%=d1.getMedi_rate()   %> </td>
	     
	     </tr>
	     <%
	     sum1+=(d1.getMedi_quant()*d1.getMedi_rate());
	    i++; }
 %>
 
 
</table>

<h2> Total Price:<%=sum1 %></h2>

<%
tot=bed+sum+sum1;
sum=0;
%>
<br>
<h2> Total Charge:<%=tot %></h2>




<form action=cancel method="get">
<center>
<input type="submit" value="confirm">
</center>
</form>

</body>
</html>




