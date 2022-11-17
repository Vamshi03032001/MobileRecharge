<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.example.demo.model.Offers"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Offers o = (Offers) request.getAttribute("myplan");  %>
bill for Re-Charge on mobile Number : ${phonenumber}<br><br>
Transaction-Id : ${tid}<br><br>
valid for: <%=o.getValidity() %><br><br>
Talk Time : <%=o.getTalktime() %><br><br>
Data balance : <%=o.getData() %><br><br>
Amount Payable : <%=o.getPrice() %><br><br>

<a href="/" >Return</a>
</body>
</html>