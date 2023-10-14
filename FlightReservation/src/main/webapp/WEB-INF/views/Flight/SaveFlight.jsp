<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Flight Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }
 
        .container {
            background-color: #ffffff;
            max-width: 500px;
            margin: 20px auto;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
        }

        h2 {
            text-align: center;
            color: #333;
        }

        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }

        input[type="text"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
            font-size: 16px;
        }

        input[type="text"]:focus {
            outline: none;
            border-color: #007bff;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            border-radius: 3px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Enter Flight Details</h2>
        <form action="SaveFlight" method="post">
            <label for="flightNumber">Flight Number:</label>
            <input type="text" id="flightnumber" name="flightnumber" required><br>

            <label for="operatingAirline">Operating Airline:</label>
            <input type="text" id="operatingairline" name="operatingairline" required><br>

            <label for="departureCity">Departure City:</label>
            <input type="text" id="departurecity" name="departurecity" required><br>

            <label for="arrivalCity">Arrival City:</label>
            <input type="text" id="arrivalcity" name="arrivalcity" required><br>

            <label for="dateOfDeparture">Date of Departure (dd-MM-yyyy):</label>
            <input type="date" id="dateofdeparture" name="dateofdeparture" pattern="\d{2}-\d{2}-\d{4}" required><br>

            <label for="departureTime">Departure Time (HH:mm:ss):</label>
<input type="time" id="estimatedDepartureTime" name="estimatedDepartureTime" step="1" pattern="([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]" placeholder="HH:mm:ss" required>

            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>
