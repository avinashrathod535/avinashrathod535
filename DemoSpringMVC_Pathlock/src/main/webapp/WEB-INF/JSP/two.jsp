<!DOCTYPE html>
<%@page import="com.pathlock.Model.Student,java.util.ArrayList" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome To my Spring MVC program</h1>



<br>
<%-- <h3>${sobj.getSname()}</h3> --%>

<%-- <% ArrayList<Student> al=(ArrayList<Student>)request.getAttribute("studentlist"); %> --%>
${stud}
<table border="2">
<tr>
<th>ID</th>
<th>Name</th>
<th>Percent</th>
<th>City</th>
<th>Action</th>
</tr>
<c:forEach var="s1" items="${studentlist}">
<tr>
<td>${s1.getSid()}</td>
<td>${s1.getSname()}</td>
<td>${s1.getPercent()}</td>
<td>${s1.getCity()}</td>
<td><a href="Edit?sid=${s1.getSid()}">Edit</a> &nbsp;&nbsp;<a href="Delete">Delete</a></td>
</tr>

</c:forEach>
</table>

<%-- <% for(Student s1:al) 
{
%>
<tr>
<td><%=s1.getSid()%></td>
<td><%=s1.getSname()%></td>
<td><%=s1.getPercent()%></td>
<td><%=s1.getCity()%></td>
</tr>
<%
}
%>

</table> --%>

</body>
</html>


