<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!--  <meta charset="ISO-8859-1">
<<title>Insert title here</title>-->
<style>
input[type=text], input[type="number"], input[type="date"] select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid grey;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
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
h1,h2,h3
{
text-align: center;
color: darkblue;
}

    .login-box{
    width: 500px;
    height: 600px;
    background: lightgrey;
    color: #fff;
    top: 50%;
    left: 50%;
    position: absolute;
    transform: translate(-50%,-50%);
    box-sizing: border-box;
    padding: 35px 30px;
}
</style>


</head>
<body>
<h1>Hospital Management System</h1>
<div class="login-box">
<h2>Welcome Admin</h2>
<form action="create.jsp" >
<input type="submit" value="Create patient">
</form>
<form action="updatepatient.jsp" >
<input type="submit" value="Update patient">
</form>
<form action="del.jsp" >
<input type="submit" value="Delete patient">
</form>
<form action="ViewPatients" >
<input type="submit" value="View patients">
</form>
<form action="searchpatient.jsp" >
<input type="submit" value="Search patient">
</form>
<form action="finalbilling.jsp" >
<input type="submit" value="Final Billing">

</form>
<form action="logout" >
<input type="submit" value="Logout">

</form>

</div>
</body>
</html>