<%@page import="in.jegan.dto.CartItemDTO"%>
<%@page import="java.util.List"%>
<%@page import="in.jegan.model.Vegetable"%>
<%@page import="in.jegan.service.VegetableManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>order Details</title>
</head>
<body>
    <jsp:include page="header.jsp"></jsp:include>
	<%
	List<CartItemDTO> cartItems = (List<CartItemDTO>) session.getAttribute("CART_ITEMS");
	
    String grossTotal = request.getParameter("grossTotal");
	%>
	
	<main class="container-fluid">
	
	<h3>Order Details</h3>
	<table class="table table-bordered">
		<caption>List of order details</caption>
		<thead>
			<tr>
			    <th id="col">Sno</th>
				<th id="col">Vegetable Name</th>
				<th id="col">Price(per kg)</th>
				<th id="col">Quantity</th>
				<th id="col">Total Price</th>
			</tr>
		</thead>
		<tbody>
		<%
		if(cartItems ==null){ %>
			<tr><td>No Items in Cart </td></tr>
	<%}else{
		int i=0;
		for(CartItemDTO dto: cartItems){
			i++;
	%>
			<tr>
			<td><%=i %></td>
			<td><%=dto.getVegetableName() %></td>
			<td>Rs.<%=dto.getVegetablePrice() %></td>
			<td><%=dto.getVegetableQuantity() %> kg</td>
			<td>Rs.<%=dto.getTotalPrice() %></td>
			</tr>
			
			
			
			<%}} %>
			<tr><th id="col" colspan=4 class="text-center">Total bill Amount </th>
			<%if(grossTotal != null){ %>
			<th id="col">Rs.<%=grossTotal %></th>
			<%} %>
			</tr>
		</tbody>
	</table>
	<%if(grossTotal != null){ %>
	<div><strong>Rs.<%=grossTotal %></strong></div>
	<%} %>
	<br>
	<a href="GrossTotalPaymentServlet"  class="btn btn-primary" role="button"><strong>pay</strong></a>
	<br>
	<br>
	<a class="btn btn-success" role="button" href="ListVegetables.jsp"><strong>order again</strong></a>
	</main>
	</body>
</html>