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
   <input type="number" name="userMobileNumber" placeholder="Enter the UserMobileNumber" required autofocus /> 
   <br>
   <br>
	<label for="userEmail">User Email: </label> 
   <input type="text" name="userEmail" placeholder="Enter the UserEmail" required autofocus /> 
   <br>
   <br>		
	<button class="btn btn-primary" type="submit">Submit</button>	
	</form>	

</body>
</html>