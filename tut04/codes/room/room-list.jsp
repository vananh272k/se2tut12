<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- Include the JSTL Core library in JSP --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Room Management</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<br>
		<h3 class="text-center">ROOM LIST</h3>
		<br>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID Number</th>
					<th>Grace Period Hours</th>
					<th>Fixed Booking Charge</th>
				</tr>
			</thead>
			<tbody>
				<%-- c:forEach => basic iteration tag --%>
				<c:forEach var="room" items="${listRoom}">
					<tr>
						<%-- c:out => for expressions --%>
						<td><c:out value="${room.id_number}" /></td>
						<td><c:out value="${room.grace_period_hours}" /></td>
						<td><c:out value="${room.fixed_booking_charge}" /></td>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>