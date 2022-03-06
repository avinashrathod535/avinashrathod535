<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  bgcolor="LightBlue">

<%
String user=(String)session.getAttribute("user");
String email=(String)session.getAttribute("email");
%>

<center>
<a href="">Home</a>
<a href="">About Us</a>
<a href="">Contact Us</a>
<a href="mobiles">Product List</a>


<%if(user!=null && user.equals("user")) { %>
<a href="">Profile</a>
<a href="Cart">My Cart</a>
<a href="cmobiles"> Product List</a>
<a href="">My Order</a>
<%} %>
<% if(user==null) { %>
<a href="adduser">Register</a>
<a href="login">Login</a>
<%} %>
<%if(user!=null && user.equals("admin")) { %>
<a href="addproduct">Add Product.jsp</a>
<% } %>
<% if(user!=null) { %>
<a href="logout">Logout</a>
<%} %>
</center>
</body>
</html>