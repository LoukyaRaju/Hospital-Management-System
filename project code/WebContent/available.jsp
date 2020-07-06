<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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

</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hospital Management System</h1>
 <form  action="updation" method="get">
   
<br>
<br>

    <h2>Your Requested Medicine is Available</h2>
    <h3>Do you want to proceed ?</h3>  
    <br>
    <center>
 <input type="submit"  value="OK" name="submit">
 </center>
 </form>

</body>
</html>