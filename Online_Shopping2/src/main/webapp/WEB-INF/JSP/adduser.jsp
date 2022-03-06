<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  bgcolor="LightBlue">

<!-- <jsp:include page="Header.jsp"></jsp:include>-->

<center>
<h1>Register Here!</h1>
<form action="Registeruser" method="post">

<table>
<tr>
<td>User ID</td>
<td><input type="text" name="userid" placeholder="Enter user Id" required="required" ></td>
</tr>

<tr>
<td>User Name</td>
<td><input type="text" name="uname" placeholder="Enter user name" required="required" pattern="[A-Za-z]{2,}"></td>
</tr>
<tr>
<td>User Email</td>
<td><input type="text" name="uemail" placeholder="Enter user email" required="required" pattern=".{2,}"></td>
</tr>
<tr>
<td>User Password</td>
<td><input type="text" name="upass" placeholder="Enter user Pass" required="required" pattern=".{3,}"></td>
</tr>
<tr>
<td>User Phoneno</td>
<td><input type="text" name="phoneno" placeholder="Enter Phone No" required="required" pattern="[789]{1}[0-9]{9}">></td>
</tr>
<tr>
<td>User gender</td>
<td><input type="radio" name="gender" value="male">Male<br>
<input type="radio" name="gender" value="female">Female<br>
</tr>
<tr>
<tr>
<td>User Address</td>
<td><input type="text" name="address" placeholder="Enter user address" required="required" pattern=".{2,}"></td>
</tr>
<td>
<input type="submit" value="add User">
<input type="reset" value="clear">
</td>
</tr>
</table>
</form>
</center>
<h4 align="center" >
    <a class="btn btn-primary" style="align-self: center" href="index" role="button">Back</a>
    </h4>
</body>
</html>