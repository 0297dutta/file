<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead | Info</title>
</head>
<body>
First Name:${contact.firstName}<br/>
Last Name:${contact.lastName}<br/>
Lead Source:${contact.leadSource}<br/>
Email:${contact.email}<br/>
Mobile:${contact.mobile}<br/>
<form action="composeEmail" method="post">
<input type="hidden" name="email" value="${lead.email}"/>
email<input type="submit" value="send email"/>
</form>
<form action="convertLead" method="post">
<input type="hidden" name="id" value="${lead.id}"/>
<input type="submit" value="convert"/>
</form>
</body>
</html>