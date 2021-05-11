<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
     <h1>Login </h1>
     <label for="userName">UserName : </label>
     <input type = "text" name="userName" id="userName" placeholder="Enter Username" required>
     <br>
     <br>
     <label for="passWord">PassWord : </label>
     <input type="password" name="passWord" id="passWord" placeholder="Enter Password" required>
     <br>
     <br>
     <button>submit</button>
    </main> 
</body>
</html>