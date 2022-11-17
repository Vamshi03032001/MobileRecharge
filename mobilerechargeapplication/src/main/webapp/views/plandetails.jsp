<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="com.example.demo.model.Offers"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IPL Home Page</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<% List<Offers> offersList = (List<Offers>) request.getAttribute("offerslist");  %>
	<% Long pno = (Long) request.getAttribute("phonenumber");  %>

	<div class = "container">
	<table class = "table">
		<tr>
		<th></th>
    	<th>Plan Id</th>
    	<th>Validity</th>
    	<th>Talktime</th>
    	<th>Data</th>
    	<th>Price</th>
 		</tr>
  <tr>
	<% for(Offers o: offersList) { %>
		<form action = "saveplan" method="post">
		<tr>
			<td>
			<input type="radio"  name="planId" value=<%= o.getPlanId() %>>
			</td>
			<td>
				<% out.print(o.getPlanId()); %>
			</td>
			<td>
				<% out.print(o.getValidity()); %>
			</td>
			<td>
				<% out.print(o.getTalktime()); %>
			</td>
			<td>
				<% out.print(o.getData()); %>
			</td>
			<td>
				<% out.print(o.getPrice()); %>
			</td>

		</tr>
	<% } %>	
		
	</table>
	  <input type="hidden"  name="phonenumber" value=<%=pno %>>
      <input type = "submit" value="Submit">
    </form>
</body>
	
	</div>

</body>
</html>