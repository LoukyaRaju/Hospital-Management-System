<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<!-- <meta charset="ISO-8859-1">
<title>Insert title here</title>-->
<style >
input[type="number"] {
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
<form action="deletepatient" method="get">
<h1>Hospital Management System</h1>
<div class="login-box">
<h2>Delete Patient</h2>
<br>
<p>Enter the patient id to delete:</p>
<input type="number" name="patientId" placeholder="Enter patient id" required>

<input type="submit" value="Delete"/></td>

</form>

</body>
</html>