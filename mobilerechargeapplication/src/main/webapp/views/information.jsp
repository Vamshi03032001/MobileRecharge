<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/action_page.php">
 enter phone number:<input type="text" name="phonenumber"><br><br>
  <label for="cars">Choose operator:</label>
  <select name="operator" id="operator">
    <option value="jio">jio</option>
    <option value="airtel">airtel</option>
    <option value="idea">idea</option>
  </select>
  <br><br>
  <input type="submit" value="Submit">
</form>
</body>
</html>