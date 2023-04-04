<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<title>Create a new list</title>
<style>
	input:invalid {
	  border: 2px solid red;
	}
	
	input:valid {
	  border: 2px solid black;
	}
</style>
<script>

	function check(){
			document.getElementById('js-submit').removeAttribute('disabled');
			document.getElementById('fullNameCheck').style.display = "none";
	};
</script>
</head>
<body>
<h2>Create a new list: </h2>
<form id="signup-form" action = "createNewListServlet" method="post">
List Name: <input type="text" name = "listName"  required><br />
<div style="color:red;" id="fullNameCheck"> Please make sure to input your first and last name</div>
Zoo Keeper Name: <input onChange="check()" type="text" name ="keeperName"  id="fullName" required><br>

Last Shift: <input type="number" name = "month" placeholder="mm"
size="4" max=12 required> <input type="number" name="day" placeholder="dd" size="4" max=31 required>
<input type="number" name="year" placeholder="yyyy" size="4" max=thisYear() min=4 required>
<br />

Available Animals: <br />

<select name="allAnimalsToAdd" multiple size="6">
<c:forEach items="${requestScope.allAnimals}" var="currentAnimal">
	<option value = "${currentAnimal.id}">${currentAnimal.name} | ${currentAnimal.species}</option>
</c:forEach>
</select>
<br />
<input type= "submit" value="Create list and Add Animals" id="js-submit" disabled>
</form>
<a href="index.html">Go add new animals instead.</a></body>
</html>