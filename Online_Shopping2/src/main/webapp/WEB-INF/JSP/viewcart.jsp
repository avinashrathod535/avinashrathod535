<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@page import="java.util.List,com.think.Model.Product" isELIgnored="false" %>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  bgcolor="LightBlue">
<h4 align=" right" >
    <a class="btn btn-primary" style="align-self: center" href="logout" role="button">Logout</a>
    </h4>
<center>
<c:if test="${itemlist==null} ">
<h1>Your cart is empty</h1>
</c:if>
<c:if test="${itemlist!=null}">
<h1>ShopNow</h1>

<br>
<h3> Hi <%=session.getAttribute("username") %> your cart is here!</h3>
<% int total=0; %>
<table border="1">
<tr>
<th>Mobileid</th>
<th>Brand</th>
<th>Price</th>
<th>Qty</th>

</tr>
<c:forEach  var="p1" items="${itemlist}">
<tr>
<td>${p1.getIteamid()}</td>
<td>${p1.getBrand()}</td>
<td>${p1.getPrice()}</td>
<td>${p1.getQty()}</td>
<td>${p1.getQty()*p1.getPrice()}</td>

</tr>
</c:forEach>
<br>
total Amount:${total}
<tr>
<h2><a href="order">Place Order</a></h2><tr>
</table>
</c:if>
</body>
<!-- <h2><a href="xyz">BackAddToCart</a></h2><tr>-->

</html>
</center>
<h4 align="center" >
    <a class="btn btn-primary" style="align-self: center" href="xyz" role="button">Back</a>
    </h4>