<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

select {
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
 .login-box{
    width: 400px;
    height: 300px;
    background: lightgrey;
    color: #fff;
    top: 50%;
    left: 50%;
    position: absolute;
    transform: translate(-50%,-50%);
    box-sizing: border-box;
    padding: 35px 30px;
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


</style>
</head>
<body>
<h1>Hospital Management System</h1>
<form action="AddDiagnostics" method="get">
<div class="login-box">
<h2>Diagnostics</h2>
<p>select diagnostics test:</p> 
<select name="DiagId" required>
    <option value="">--Please choose an option--</option>
    <option value="1">CT Scan</option>
    <option value="2">XRay</option>
    <option value="3">Scanning</option>
    </select>



<input type="submit" value="Add"/></td>

</form>
</div>
</body>
</html>