<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead | Create</title>
</head>
<body>
<h2>Lead | Create</h2>
<div>
${emailerror}
</div>
<form action="saveLead" method="post">
<pre>
First Name<input type="text" name="firstName"/>
Last Name<input type="text" name="lastName"/>
Lead Source:<select name="leadSource">
  <option value="newspaper">Newspaper</option>
  <option value="internet">Internet</option>
  <option value="radio">Radio</option>
  <option value="tv">TV</option>
</select>
email<input type="email" name="email"/>
mobile<input type="number" name="mobile"/>
<input type="submit" value="save"/>
</pre>
</form>
</body>
</html>