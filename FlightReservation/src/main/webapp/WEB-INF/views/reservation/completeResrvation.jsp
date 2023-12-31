<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete Reservation</title>
</head>
<body>
	<h2>Complete Reservation</h2>
	Airline: ${flight.operatingairline}
	<br /> Departure City: ${flight.departurecity}
	<br /> Arrival City: ${flight.arrivalcity}
	<br /> ID: ${flight.id}
	<br />
	<form action="completeReservation">
		<pre>
<h2>Passenger Details:</h2>
First Name:<input type="text" name="passengerFirstName" />
Middle Name:<input type="text" name="passengerMiddleName" />
Last Name:<input type="text" name="passengerLastName" />
Email:<input type="text" name="passengerEmail" />
Phone:<input type="text" name="passengerPhone" />

<h2>Card Details</h2>
Name On The Card:<input type="text" name="nameOnTheCard" />
Card No:<input type="text" name="cardNumber" />
Expiry Date:<input type="text" name="expirationDate" />
Three Digit Security Code:<input type="text" name="securityCode" />

<input type="hidden" name="id" value="${flight.id}" />
<input type="submit" value="Confirm" />
</pre>
	</form>
</body>
</html>