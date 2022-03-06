<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.List,com.think.Model.Product" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
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
<h1>EDIT YOUR PRODUCT HERE!!!</h1>

<form action="update" method="get">
<table>
<tr>
<td>Mobile ID</td>
<td><input type="text" name="mobileid" value="${mobile.getMobileid()}" required="required" readonly></td>
</tr>
<tr>
<td>Mobile Storage</td>
<td><input type="text" name="storage" value="${mobile.getStorage()}" required="required"></td>
</tr>
<tr>
<td>Mobile Ram</td>
<td><input type="text" name="ram" value="${mobile.getRam()}"  required="required"></td>
</tr>
<tr>
<td>Mobile Price</td>
<td><input type="text" name="price" value="${mobile.getPrice()}" required="required"></td>
</tr>
<tr>
<td>Mobile Colour</td>
<td><input type="text" name="colour" value="${mobile.getColour()}"  required="required"></td>
</tr>
<tr>
<td>Mobile Display</td>
<td><input type="text" name="display" value="${mobile.getDisplay()}" required="required"></td>
</tr>
<tr>
<td>Mobile Brand</td>
<td>
<select name="brand" value="${mobile.getBrand()}">
<option value="">Select Mobile Brand</option>
<option value="iphone">iphone</option>
<option value="OnePLUS">OnePlus</option>
<option value="Realme">Realme</option>
<option value="vivo">vivo</option>
<option value="Oppo">Oppo</option>

</select>
</td>
</tr>
<tr>
<td></td>
<td>
<input type="submit" value="Edit Product">
<!-- <input type="reset" value="clear">-->

</td>
</tr>
</table>
</form>
</center>
<h4 align="center" >
    <a class="btn btn-primary" style="align-self: center" href="abc" role="button">Back</a>
    </h4>
</body>
</html>