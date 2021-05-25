
<%@page import="java.util.List"%>
<%@page import="in.jegan.model.Vegetable"%>
<%@page import="java.util.ArrayList"%>
<%@page import="in.jegan.service.VegetableManager"%>
<!DOCTYPE>
<html lang="en">
<head>
<title>GroceryApp</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>List Of Vegetables</h3>
		<table class="table table-bordered">
		<caption>Showing the List of Vegetables</caption>
		<thead>
		<tr><th id="col">Sno</th> <th id="col">Vegetable Name</th> <th id="col">Price</th> <th id="col">Quantity</th> </tr>
		</thead>
		<tbody>
		<%
		List<Vegetable> vegetableList =VegetableManager.showVegetable();
		int i=0;
		for(Vegetable vegetable : vegetableList )
		{
			i++;
		%>
		
		<tr>
		<td><%=i %></td> <td><%=vegetable.getVegetableName() %> </td> 
		<td>Rs.<%=vegetable.getPrice() %></td> 
		<td><%=vegetable.getQuantity() %></td>
		<td><a href="DeleteVegetableServlet?vegetableName=<%=vegetable.getVegetableName()%>" class="btn btn-danger">Delete</a>
		</tr>
		
		<% } %>
		</tbody>
		</table>
		<a class="btn btn-secondary" href="addVegetable.jsp">Add Product</a>
	</main>
</body>
</html>
