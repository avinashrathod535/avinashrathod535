<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ADD NEW STUDENT RECORD</h1>
<FORM method="get" action="save" >
<table>
<tr>
<th>Sid:</th>
<td> <input type="text" name="sid"></td>
</tr>
<tr>
<th>Name:</th>
<td><input type="text" name="name"></td>
</tr>
<tr>
<th>City</th>
<td><input type="text" name="city"></td>
</tr>
<tr>
<td colspan="2">
<input type="submit" value="submit">
</td>
</tr>
</table>
</FORM>
</body>
</html>