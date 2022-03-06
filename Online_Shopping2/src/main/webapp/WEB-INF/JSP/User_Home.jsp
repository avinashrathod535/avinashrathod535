<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import ="java.util.List,com.think.Model.User" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="LightBlue">
<h4 align=" right" >
    <a class="btn btn-primary" style="align-self: center" href="logout" role="button">Logout</a>
    </h4>

<center>
<!--<jsp:include page="Header.jsp"></jsp:include>-->

<h1 >USER SECTION </h1>
<h2>Welcome <%=session.getAttribute("username") %></h2>

<form action="xyz">
<input type="submit" name="Submit" value="ProductList">
</form>


<!--<a href="xyz">Product List</a>-->
</center>
<h4 align="center" >
    <a class="btn btn-primary" style="align-self: center" href="login" role="button">Back</a>
    </h4>
</body>
</html>