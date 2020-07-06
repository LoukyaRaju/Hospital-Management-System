<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- <meta charset="ISO-8859-1">
<title>Insert title here</title>-->


<style>

body{
    margin: 0px 10px;
    padding: 0;
    background: url(https://us.123rf.com/450wm/urfingus/urfingus1712/urfingus171200021/91788432-stock-illustration-medical-concept-hospital-corridor-with-rooms-3d-illustration.jpg?ver=6);
     background-size: cover;
    background-position: center;
     background-attachment: fixed;
   font-family: sans-serif;
   height: 150px;
   width: 50%;
}

input[type=text]{
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
h1
{
text-align: center;
color: darkblue;
}
p
{

color: black;
}
 .login-box{
    width: 500px;
    height: 500px;
    background: rgba(0, 0, 0,0.4);
    color: #fff;
    top: 50%;
    left: 50%;
    position: absolute;
    transform: translate(-50%,-50%);
   box-sizing: border-box;
    padding: 20px 20px;
}
 
</style>


</head>




<body>


<div class="login-box">
<h1>Hospital Management System</h1>

<form action="LoginValid" method="get">
<h1>Login Page</h1>

<p>User Name:</p>
<input type="text" name="username" placeholder="Enter Name" pattern="[A-Za-z0-9]+" required>
<p>Password:</p>
<input type="password" name="password" placeholder="Enter Password"  pattern="[A-Za-z@0-9]+" required>

<input type="submit" value="Login">
</form>
</div>
</body>







</html>