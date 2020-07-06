<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.tcs.ilp.models.Medicine"%>
    <%@page import="com.tcs.ilp.models.patientM"%>
    <%@page import="java.util.List"%>
   
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

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hosptial Management System</h1>

<%
int sum=0;
	List<Medicine> diags =(List<Medicine>)session.getAttribute("MedicineInfo");
//List<Integer> quants =(List<Integer>)session.getAttribute("quantList");
   if(!(diags.isEmpty()))
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
 for(Medicine d: diags)
 {i=1;
%>

<tr>
 <td> <%=d.getMedi_id() %> </td>
	      <td> <%=d.getMedi_name()    %> </td>
	       <td> <%=d.getMedi_quant() %> </td>
	      <td> <%=d.getMedi_rate()   %> </td>
	     
	     </tr>
	     <%
	     sum+=(d.getMedi_quant()*d.getMedi_rate());
	    i++; }
 %>
 
 
</table>

<h2> Total Price:<%=sum %></h2>

<form action="IssueMedicine.jsp" >
<center>
<input type="submit" value="AddNewMedicine">
</center>
</form>
<form action="medicine.jsp" >
<center>
<input type="submit" value="Back to Main">
</center>
</form>

</body>
</html>