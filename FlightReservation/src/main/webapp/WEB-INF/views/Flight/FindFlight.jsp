<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Find Flights:</h2>
	<form action="find" method="post">
		From:<input type="text" name="from" /> 
		To:<input type="text" name="to" />
		Departure Date:<input type="date" name="dateOfDeparture" /> 
		<input type="submit" />
	</form>
	
	<h2><a href="showAllReservations">Show All Reservations</a></h2>
</body>
</html>