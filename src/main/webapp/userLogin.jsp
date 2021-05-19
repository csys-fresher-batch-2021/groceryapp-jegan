<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
     <jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid"></main>

     <h1>User Login</h1>
     <br>
     <form action="UserLoginServlet" method=get>
     <label for="userEmail">UserEmail : </label>
     <input type="text" name="userEmail" placeholder="Enter the Email" required autofocus>
     <br>
     <br>
     <label for="passWord">Password : </label>
     <input type="password" name="passWord" placeholder="Enter the password" required autofocus>
     <br>
     <br>
     <button class="btn btn-primary" type="submit">Submit</button>
     </form>
</body>
</html>