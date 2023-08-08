<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>User Registration</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
  <title>User Login</title>
</head>
<body>
<div class="container">
 ${message}
  <h2>User Registration</h2>
    <img src="images/register.jpg" height=150 width=150/>
  <form action="employeeRegister" method="post">
 <!-- <div class="form-group">
      <label for="username">Employee ID:</label>
      <input type="text" class="form-control" placeholder="Enter Id" name="employeeId">
    </div>  -->
    <div class="form-group">
      <label for="username">Employee Name:</label>
      <input type="text" class="form-control" placeholder="Enter username" name="employeeName">
    </div>
     <div class="form-group">
      <label for="pwd">Email:</label>
      <input type="email" class="form-control"  placeholder="Enter email" name="emailId">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="text" class="form-control"  placeholder="Enter password" name="password">
    </div>
   
    <div class="form-group">
      <label for="pwd">Date:</label>
      <input type="date" class="form-control"  placeholder="Enter department" name="date">
    </div>
    <div class="form-group">
      <label for="pwd">Salary:</label>
      <input type="text" class="form-control"  placeholder="Enter department" name="salary">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
    <button type="reset" class="btn btn-danger">Reset</button>
    <a href="login" class="btn btn-info" role="button">Login</a>
  </form>
  
 <a href="getAllEmployees">Get All Users</a>
  
</div>


</body>
</html>