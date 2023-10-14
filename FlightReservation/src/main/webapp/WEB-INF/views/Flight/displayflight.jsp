<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Flights:</h2>
	<c:if test="${not empty flights}">
		<table border="1">
			<tr>
				<th>Flight NO</th>
				<th>Airlines</th>
				<th>Departure City</th>
				<th>Arrival City</th>
				<th>Departure Time</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${flights}" var="flight">
				<tr>
					<td>${flight.flightnumber}</td>
					<td>${flight.operatingairline}</td>
					<td>${flight.departurecity}</td>
					<td>${flight.arrivalcity}</td>
					<td>${flight.estimatedDepartureTime}</td>
					<td><a href="showCompleteReservation?flightId=${flight.id}">Select</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<c:if test="${empty flights}">
		<p>No flights available</p>
	</c:if>



</body>
</html>