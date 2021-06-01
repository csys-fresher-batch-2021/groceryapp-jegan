<link rel="stylesheet" href="assets/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/css/fontawesome.min.css">
<link rel="stylesheet" href="assets/css/style.css">
<%
String userEmail = (String)session.getAttribute("userEmail");
String role=(String)session.getAttribute("ROLE");
%>
<header>
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
  <a class="navbar-brand" href="index.jsp">GroceryApp</a>
  <button class="navbar-toggler d-lg-none" type="button" data-toggle="collapse" data-target="#collapsibleNavId" aria-controls="collapsibleNavId"
      aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="collapsibleNavId">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      <% if(role != null && role.equalsIgnoreCase("admin")) {%>
      <li class="nav-item">
        <a class="nav-link" href="addVegetable.jsp">Add Vegetables</a>
      </li>
      
      <%} %>
       <li class="nav-item">
        <a class="nav-link" href="ListVegetables.jsp">Vegetables</a>
      </li>
    </ul>
     <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
     <%if (userEmail == null && role==null) {%>
      <li class="nav-item active">
        <a class="nav-link" href="userRegistration.jsp">Register</a>
        
      </li>
      <li class="nav-item">
        <a class="nav-link" href="userLogin.jsp">Login</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="adminLogin.jsp">AdminLogin</a>
      </li>
      <%}else { %>
     <%  if(role!=null && role.equalsIgnoreCase("admin")){ %>
      <li class="nav-item active">
        <a class="nav-link" href="#">Welcome <%=role %></a>
      </li>
      <%} %>
      <li class="nav-item">
        <a class="nav-link" href="AdminLogOutServlet">Logout</a>
      </li>
      <%} %>
      </ul>
   
  </div>
</nav>
</header>