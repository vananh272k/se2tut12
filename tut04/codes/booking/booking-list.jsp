<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- Include the JSTL Core library in JSP --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Booking Management</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<br>
		<h3 class="text-center">BOOKING LIST</h3>
		<br>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Start date time</th>
					<th>Stop date time</th>
					<th>Payed</th>
				</tr>
			</thead>
			<tbody>
				<%-- c:forEach => basic iteration tag --%>
				<c:forEach var="booking" items="${listBooking}">
					<tr>
						<%-- c:out => for expressions --%>
						<td><c:out value="${booking.start_date_time}" /></td>
						<td><c:out value="${booking.stop_date_time}" /></td>
						<td><c:out value="${booking.payed}" /></td>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>