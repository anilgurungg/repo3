<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>User Registration</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Expires" content="0">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
  <title>User Login</title>
</head>
<body>
<div class="container">
 ${message} <p/>
  <a href="getAllEmployees">Get All Users</a>
  <h2>User Update</h2>
    <img src="images/register.jpg" height=150 width=150/>
  <form action="employeeUpdate" method="post">
  <div class="form-group">
      <label for="username">Employee ID:</label>
      <input type="text" class="form-control" value="${employee.employeeId}" name="employeeId" readonly >
    </div>
     <div class="form-group">
      <label for="username">Employee Name:</label>
      <input type="text" class="form-control" value="${employee.employeeName}" name="employeeName">
    </div>
     <div class="form-group">
      <label for="pwd">Email:</label>
      <input type="email" class="form-control"  value="${employee.emailId}" name="emailId">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="text" class="form-control"  value="${employee.password}" name="password">
    </div>
   
    <div class="form-group">
      <label for="pwd">Date:</label>
      <input type="date" class="form-control"  value="${employee.date}" name="date">
    </div>
    <div class="form-group">
      <label for="pwd">Salary:</label>
      <input type="text" class="form-control"  value="${employee.salary}" name="salary">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
    <button type="reset" class="btn btn-danger">Reset</button>
  </form>
  

  
</div>


</body>
</html>