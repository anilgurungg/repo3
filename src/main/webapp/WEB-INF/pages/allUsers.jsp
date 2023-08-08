<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>Success</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Expires" content="0">

    
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container">
        <!-- Brand/logo -->
         <img src="images/emp.png" height=50 width=50 class="navbar-brand"/> 
      
        <!-- Navbar items -->
        <div class="navbar-collapse justify-content-end">
            <ul class="navbar-nav">
            <li class="nav-item">
               
                <li class="nav-item">
                    <!-- Add your Logout link here -->
                    <a href="logout" class="btn btn-danger mx-2" role="button">Logout</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

 

<div class="container">
${message}
 ${successMessage}
 ${errorMessage}
  <h2>User Details</h2>        
  <table class="table table-striped text-center">
    <thead>
      <tr >
      <th>Employee Id</th>
        <th>Employee name</th>
        <th>Password</th>
        <th>Email</th>
        <th >Salary</th>
        <th >Date</th>
        <th colspan="2" >Actions</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${employeeDTOs}" var="employee">
    	<tr>
    	<td><a href="viewEmployee?employeeId=${employee.employeeId}" >${employee.employeeId}</a></td>
        <td>${employee.employeeName}</td>
        <td>${employee.password}</td>
        <td>${employee.emailId}</td>
        <td>${employee.salary}</td>
        <td>${employee.date}</td>
         <td> <a href="deleteEmployee?employeeId=${employee.employeeId}" class="btn btn-danger" role="button">Delete</a></td>
    <td> <a href="updateEmployee?employeeId=${employee.employeeId}" class="btn btn-info" role="button">Update</a></td>         
      </tr>
    </c:forEach> 

    </tbody>
  </table>
</div>
</body>
</html>