<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h5>${msg}</h5>
<h5>List of Products</h5>
<form:form method="post" action="Selectedproducts" commandName="ProductsList">
<form:checkboxes items="${myList}" path="myList" delimiter="<br/>" />
<br/>	
<td><input type="submit" value="Submit" /></td>
</form:form>


</body>
</html>