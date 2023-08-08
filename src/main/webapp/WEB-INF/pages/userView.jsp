<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>Success</title>
 
 <meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Expires" content="0">
    <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
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
               
                <li class="nav-item"><a href="getAllEmployees" class="btn btn-info danger" role="button">Get All Employees</a></li>
               
               
                <li class="nav-item">
                    <!-- Add your Logout link here -->
                    <a href="logout" class="btn btn-danger mx-2" role="button">Logout</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
 
 
 

<div class="container">
	
   <div class="d-flex justify-content-center">
 <div class="card d-flex justify-content-center" style="width:20rem;margin:20px 0 24px 0">
  <img class="card-img-top" src="images/img_avatar3.png" alt="image" style="width:100%">
  <div class="card-body">
    <h4 class="card-title">${employeeDTO.employeeName}</h4>
    <p class="card-text">${employeeDTO.password}</p>
    <p class="card-text">${employeeDTO.emailId}</p>
    <p class="card-text">${employeeDTO.salary}</p>
    <p class="card-text">${employeeDTO.date}</p>
    
  </div>
  
  </div>
</div>     
 
</div>
</body>
</html>