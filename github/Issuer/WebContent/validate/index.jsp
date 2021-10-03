<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<h2 style="color:green;">Transaction Successful</h2><br>
	<h3>
	<label>Transaction Id: </label><%=request.getAttribute("trx_id") %><br>
	<label> Amount: </label><%=request.getAttribute("amount") %><br>
	<label> Credit Card No: </label><%=request.getAttribute("card-no") %>
	<label> </label>
	</h3>
	</div>
</body>
</html>