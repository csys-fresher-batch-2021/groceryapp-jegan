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
		<jsp:include page="message.jsp"></jsp:include>
	
	<main class="container-fluid"></main>

	<h1>Add Vegetable</h1>
	<form action="AddProductServlet" method=get>
		<label for="vegetableName">Vegetable Name : </label> <input
			type="text" name="vegetableName"
			placeholder="Enter the VegetableName" required autofocus /> <br>
		<br> <label for="vegetablePrice">Vegetable Price(Rs.) : </label> <input
			type="number" name="vegetablePrice" placeholder="Enter the price"
			required autofocus min="10"/> <br> <br> <label
			for="vegetableQuantity">Vegetable Quantity(kg) : </label> <input
			type="text" name="vegetableQuantity" placeholder="Enter the quantity"
			required autofocus /> <br> <br>
		<button class="btn btn-primary" type="submit">Submit</button>
	</form>
</body>
</html>