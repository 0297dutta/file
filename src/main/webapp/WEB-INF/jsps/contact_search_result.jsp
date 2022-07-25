<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>

<th>First Name</th>
<th>Last Name</th>
<th>Lead Source</th>
<th>Email</th>
<th>Mobile</th>
</tr>
<c:foreach items="${contacts}" var="lead">

<tr>
<td><a href="contactInfo?id=${lead.id}">${lead.firstName}</a></td>
<td>${lead.lastName}</td>
<td>${lead.leadSource}</td>
<td>${lead.email}</td>
<td>${lead.mobile}</td>
</tr>
</c:foreach>

</table>

</body>
</html>