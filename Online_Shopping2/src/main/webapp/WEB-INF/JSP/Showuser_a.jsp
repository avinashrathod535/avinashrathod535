<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.List,com.think.Model.User" isELIgnored="false" %>
 <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     
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
<jsp:include page="Header.jsp"></jsp:include>
<h1> ADMIN SECTION</h1>
<h2><a href="add">Add Admin</a></h2>
<table border="2" >
<tr>
<th>UserName</th>
<th>UserEmail</th>
<th>UserPass</th>
<td>UserPhoneno</td>
<td>UserGender</td>
<td>UserAddress</td>
 <td>Action</td>
</tr>
 <c:forEach  var="s1" items="${userlist}">
<tr>
<td>${s1.getUserid()}</td>
<td>${s1.getUname()}</td>
<td>${s1.getUemail()}</td>
<td>${s1.getUpass()}</td>
<td>${s1.getPhoneno()}</td>
<td>${s1.getGender()}</td>
<td>${s1.getAddress()}</td>
<td><a href="edit?id=${s1.getUserid()}">Edit</a>
<a href="delete?id=${s1.getUserid()}">Delete</a>
</td>
</tr>
</c:forEach> 
</table>
</body>
</html>