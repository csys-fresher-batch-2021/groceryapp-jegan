<%@page import="in.jegan.model.Vegetable"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Order</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<%
	String vegetableName = request.getParameter("name");
	Integer vegetablePrice = Integer.parseInt(request.getParameter("price"));
	%>
	<main class="container-fluid">
		<h2>place a order</h2>
		<form action="OrderServlet" method=get>
			<label for="vegetableName">Vegetable Name : </label> <input
				type="text" name="vegetableName" value=<%=vegetableName%> required
				autofocus readonly /> <br> <br> <label
				for="vegetablePrice">Vegetable Price : </label> <input type="text"
				name="vegetablePrice" id="rate" value=<%=vegetablePrice%> required
				autofocus readonly /> <br> <br> <label
				for="vegetableQuantity">Vegetable Quantity : </label> <input
				type="text" name="vegetableQuantity" id="quantity" required
				autofocus />
			<button type="button" onclick="calculatetotalPrice()">get price</button>
			<br> <br> <label for="totalPrice"> Total
				Price(Rs.): </label> <input type="text" name="totalPrice" id="totalPrice"
				autofocus /> <br> <br>
			<button type="submit">order</button>

		</form>

	</main>

<script>
				function calculatetotalPrice() {
					var vegetablePrice = document.getElementById("rate").value;
					var vegetableQuantity = document.getElementById("quantity").value;
					document.getElementById("totalPrice").value = vegetablePrice
							* vegetableQuantity;
				}
			</script>
</body>
</html>