<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List,com.think.Model.Mobile" isELIgnored="false" %>
 <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>WELCOME IN JAVA</h1>
<h1> Mobile Shopi</h1>
<h2><a href="add">Add Mobile</a></h2>
<table border="2" >
<tr>
<th>MobileID</th>
<th>MobileStorage</th>
<th>MobileRam</th>
<th>MobilePrice</th>
<td>MobileColour</td>
<td>MobileDisplay</td>
<td>MobileBrand</td>
<td>Action</td>
</tr>
<c:forEach  var="s1" items="${mobilelist}">
<tr>
<td>${s1.getMobileid()}</td>
<td>${s1.getStorage()}</td>
<td>${s1.getRam()}</td>
<td>${s1.getPrice()}</td>
<td>${s1.getColour()}</td>
<td>${s1.getDisplay()}</td>
<td>${s1.getBrand()}</td>
<td><a href="edit?id=${s1.getMobileid()}">Edit</a>
<a href="delete?id=${s1.getMobileid()}">Delete</a>
</td>
</tr>
</c:forEach>
</table>

</body>
</html>