<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Shopping Cart Sample - Confirm Order</title>
	<style>
	* {font-family: arial;}
	</style>
</head>
<body>
	<h3>Confirm Order</h3>
	<form action="" method="post">
	<table border="1" style="border-collapse: collapse;">
		<thead>
			<tr>
				<th>Name</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>SubTotal</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${order.items}" varStatus="status">
			<tr>
				<td>${item.name}</td>
				<td>${item.price}</td>
				<td>${item.quantity}</td>
				<td>${item.subTotal}</td>
			</tr>
			</c:forEach>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="3">Total</td>
				<td>${order.totalPrice}</td>
			</tr>
		</tfoot>
	</table>
	<input type="button" value="Submit and Pay" onclick="alert('click to pay');" />
	</form>
	<a href="../logout">Logout</a>
</body>
</html>