<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
   <jsp:include page="header.jsp"></jsp:include>
      <jsp:include page="message.jsp"></jsp:include>
   
	<main class="container-fluid"></main>

   <h1>User Registration</h1>
   <form action="RegistrartionServlet" method=post>
   <label for="userName">User Name : </label> 
   <input type="text" name="userName" placeholder="Enter the UserName" required autofocus /> 
   <br>
   <br>
   <label for="passWord">PassWord : </label> 
   <input type="password" name="passWord" placeholder="Enter the PassWord" required autofocus /> 
   <br>
   <br>
   <label for="userName">MobileNumber : </label>
   <input type="number" name="userMobileNumber" placeholder="start with 91" required autofocus />
    <br>
    <br>
	<label for="userEmail">User Email: </label> 
   <input type="text" name="userEmail" placeholder="Enter the UserEmail" required autofocus /> 
   <br>
   <br>		
	<button class="btn btn-primary" type="submit">Submit</button>	
	</form>	
<br>
<ul>
<li><h5>username only contains characters and number</h5></li>
<li><h5>password contains characters,special characters and numbers[Eg.Jegan@123]</h5></li>

</ul>

</body>
</html>