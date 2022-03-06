<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String msg=(String)request.getAttribute("msg");
if(msg!=null)
	out.print(msg);
%>
<jsp:include page="Header.jsp"></jsp:include>

<center>
<h1>Login Here!!!</h1>
<h3>Please enter username and password</h3>
<form action="log" method="post">
<table>
<tr>
<!-- <td>UserType</td>
<td><input type="radio" value="admin" name="utype">admin
<input type="radio" value="user" name="utype">user</td>
</tr>-->
<tr>
<td>UserName</td>
<td><input type="text" name="uname"  pattern="[A-Za-z]{2,}"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="upass" pattern=".{3,}"></td>
</tr>
<tr>
<td>
<input type="submit" value="login">
</td>
</tr>
</table>

</form>
</center>

</body>
</html>