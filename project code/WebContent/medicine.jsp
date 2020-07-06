<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<!-- <meta charset="ISO-8859-1">
<title>Insert title here</title>-->
<style >
input[type="text"] {
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

</style>
</head>
<body>
<h1>Hosptial Management System</h1>
<form action="GetMedicines" method="get">
<div class="login-box">
<h1>Medicine</h1>
<p>Enter Patient Id:</p>
<input type="text" name="patientId" placeholder="enter pateint id"required>

<input type="submit" value="View"/></td>

</form>


<br>
<form action="logout" method="get">


<input type="submit" value="Logout"/></td>

</form>

</body>
</html>