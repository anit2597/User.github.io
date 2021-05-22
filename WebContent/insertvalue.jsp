<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="./New.css">
<script type="text/javascript">  
function msg(){  
 alert("Record inserted Successfully");  
}  
</script>  
<meta charset="ISO-8859-1">
<title>www.database.com</title>
</head>
<body>
<form action="Database" method="Post">
    <div class="container">
     <div class="row">
         <div class="col-md-10">
         <div class="row">
         
         <div style="background-color" class="col-md-5 reg-left">
         <h4>Sign Up</h4>
         <p>Hello User</p>
         <button type="button" class="btn btn-primary">Sign Up</button>
         </div>
         <div align="center" class="col-md-7 reg-right">
         <h2 style="color:blue">Registration</h2>
         <div class="reg.form">
         <div class="form.group">
         <i class="fas fa-user"></i>
        Name:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  <input type="text"  name="n1"class="form-control" placeholder="Name">
        <br><br>
         </div>
                  <div class="form.group">
         <i class="fas fa-user"></i>
       User Name: <input type="text" name="n2"class="form-control" placeholder="User Name">
       <br><br>
         </div>
                  <div class="form.group">
         <i class="fas fa-envelope"></i>
      Email:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="email" name="n3"class="form-control" placeholder="Email">
       <br><br>
         </div>
                  <div class="form.group">
         <i class="fas fa-lock"></i>
       password:&nbsp&nbsp&nbsp&nbsp<input type="password" name="n4" class="form-control" placeholder="password">
        <br><br>
         </div>
         <div>
         <input type="submit" value="Register" id="but">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href="login.jsp">LOGIN</a>
         </div>
         
         </div>
         </div>
         </div>
        </div>
</div>
</div>
</form>
</body>
</html>