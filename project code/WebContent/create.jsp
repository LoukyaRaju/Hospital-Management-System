<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!--  <meta charset="ISO-8859-1">
<title>Insert title here</title>-->

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
<form action="createController" method="get">
<h1>Hospital Management System</h1>
<div class="login-box">

<h1>Create Patient</h1>
<h2>ssn:</h2> <input type="number" name="ssn" pattern="^[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$" placeholder="enter ssn number" required>
<h2>Patient Id:</h2> <input type="number" name="patient_id" pattern="^[0-9]{9}$" placeholder="enter patient id" required>
<h2>patient_name:</h2> <input type="text" name="patient_name" placeholder="enter patient name" pattern="[A-Za-z]+"  required>

<h2>address:</h2><input type="text" name="address"  placeholder="enter address" pattern="[A-Za-z]+" required>

<h2>age:</h2> <input type="number" name="age" pattern="[0-9]{0,3}" placeholder="enter patient age" required>

<h2>Date:</h2> <input type="date" name="doj"
       value="2018-07-22"
       min="2018-01-01" max="2023-12-31" placeholder="YYYY-MM-DD" required>
<h2>Room Type:</h2>
<select name="room_type" required>
    <option value="">--Please choose an option--</option>
    <option value="General">General</option>
    <option value="SemiSharing">SemiSharing</option>
    <option value="Single">Single</option>
    </select>
<h2>city: </h2>
<input type="text" name="city"  placeholder="City" pattern="[A-Za-z]+" required>
<h2>state:</h2> <input type="text" name="state"  placeholder="state" pattern="[A-Za-z]+" required>
<h2>status:</h2> <input type="text" name="status" placeholder="admitted/discharged" pattern="[A-Za-z]+" required><br><br>

<center>
<input type="submit" value="create"/>
</center></td>



</form>
</div>
</body>
</html>