<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Vegetable</title>
</head>
<body>
    <jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
	
	<h1>Add Product</h1>
	<form action="AddProductServlet" method=get>
	<label for="vegetableName">Vegetable Name : </label>
	<input type="text" name="vegetableName" placeholder="Enter the VegetableName" required autofocus/>
	<br>
	<br>
	<label for="vegetablePrice">Vegetable Price : </label>
	<input type="text" name="vegetablePrice" placeholder="Enter the price" required autofocus/>
	<br>
	<br>
	<label for="vegetableQuantity">Vegetable Quantity : </label>
	<input type="text" name ="vegetableQuantity" placeholder="Enter the qantity" required autofocus/>
	<br>
	<br>
	<button class="btn btn-primary" type="submit">Submit</button>
	</form>
</body>
</html>