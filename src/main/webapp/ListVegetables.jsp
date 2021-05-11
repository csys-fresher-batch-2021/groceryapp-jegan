
<%@page import="java.util.List"%>
<%@page import="in.jegan.model.Vegetable"%>
<%@page import="java.util.ArrayList"%>
<%@page import="in.jegan.service.VegetableManager"%>
<html>
<head>
<title>GroceryApp</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>List Of Vegetables</h3>
		<table class="table table-bordered">
		<thead>
		<tr><th>Sno</th> <th>Vegetable Name</th> <th>Price</th> <th>Quantity</th> </tr>
		</thead>
		<tbody>
		<%
		List<Vegetable> vegetableList =VegetableManager.getVegetableList();
		int i=0;
		for(Vegetable vegetable : vegetableList )
		{
			i++;
		%>
		
		<tr>
		<td><%=i %></td> <td><%=vegetable.getVegetableName() %> </td> 
		<td>Rs.<%=vegetable.getPrice() %></td> 
		<td><%=vegetable.getQuantity() %></td>
		</tr>
		
		<% } %>
		</tbody>
		</table>
	</main>
</body>
</html>
