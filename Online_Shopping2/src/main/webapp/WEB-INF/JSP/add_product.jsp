<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body  bgcolor="LightBlue">

<h4 align=" right" >
    <a class="btn btn-primary" style="align-self: center" href="logout" role="button">Logout</a>
    </h4>
<center>

<h1>Add Mobile Here!!!!!</h1>

<form action="save" method="Get">
<!--  <input type="hidden" name="action" value="addcake">-->
<table>
<!--  <tr>
<td>Mobile ID</td>
<td><input type="text" name="mobileid" placeholder="Enter mobile Id" required="required"></td>
</tr>-->
<tr>
<td>Mobile Storage</td>
<td><input type="text" name="storage" placeholder="Enter mobile storage" required="required" ></td>
</tr>
<tr>
<td>Mobile Ram</td>
<td><input type="text" name="ram" placeholder="Enter mobile Ram" required="required"></td>
</tr>
<tr>
<td>Mobile Price</td>
<td><input type="text" name="price" placeholder="Enter mobile Price" required="required"></td>
</tr><tr>
<tr>
<td>Mobile Colour</td>
<td><input type="text" name="colour" placeholder="Enter Mobile Colour" required="required"></td>
</tr>
<tr>
<td>Mobile Display</td>
<td><input type="text" name="display" placeholder="Enter mobile Display" required="required"></td>
</tr>
<tr>
<td>Mobile Brand</td>
<td>
<select name="brand">
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
<input type="submit" value="add Mobile">
<input type="reset" value="clear">
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