<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Zoo Animal List</title>
</head>
<body>

<table>
<c:forEach items="${requestScope.allAnimals}" var="currentAnimal">
<tr>
	<td><input type="radio" name="id" value="${currentAnimal.id}"></td>
	<td>${currentAnimal.species}</td>
	<td>${currentAnimal.name}</td>
</tr>
</c:forEach>

</table>

</body>
</html>