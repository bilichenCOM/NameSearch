<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/plain; charset=UTF-8" />
<title>NameSearch</title>
<style type="text/css">

input[type=text] {
	-webkit-transition: width 0.4s ease-in-out;
	transition: width 0.4s ease-in-out;
	border: 2px solid blue;
	border-radius: 4px;
}

input[type=text]:focus {
	width: 100%;
}

.search-button {
  background-color: blue;
  color: black;
  border: 2px solid #4CAF50;
  border-radius: 4px;
  color: white;
  text-shadow: aqua;
}

</style>
</head>
<body style="background-image: url('https://www.backgroundsy.com/file/large/silky-blue-background.jpg'); background-size: cover;">
	<h2>
		<i><strong style="color: blue">NameSearch сервіс</strong></i>
	</h2>
	<form action="./search-name" method="POST">
		<table>
			<tr>
				<th>Enter name:</th>
			</tr>
			<tr>
				<td><input type="text" value="" name="desirableName"></td>
			</tr>
			<tr>
				<td><input class="search-button" type="submit" value="Search"></td>
		</table>
	</form>
	<div align="right" style="color: pink;">
		<strong>DropTable Team. SQL-Challenge 2019</strong>
	</div>
</body>
</html>