<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flight Reservation Registration</title>
<style>
body {
	font-family: 'Arial', sans-serif;
	background-color: #f9f9f9;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	min-height: 100vh;
}

.container {
	background-color: #fff;
	border-radius: 10px;
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
	padding: 30px;
	text-align: center;
	width: 80%;
	max-width: 400px;
}

h2 {
	color: #333;
	margin-bottom: 20px;
}

label {
	display: block;
	text-align: left;
	margin-bottom: 5px;
	font-weight: bold;
}

input[type="text"], input[type="email"], input[type="password"] {
	width: 100%;
	padding: 10px;
	margin-bottom: 15px;
	border: 1px solid #ccc;
	border-radius: 3px;
	font-size: 16px;
}

input[type="submit"] {
	background-color: #007bff;
	color: #fff;
	border: none;
	padding: 12px 20px;
	border-radius: 5px;
	font-size: 16px;
	cursor: pointer;
	transition: background-color 0.3s ease;
}

input[type="submit"]:hover {
	background-color: #0056b3;
}

/* Custom styling for labels */
.form-label {
	color: #555;
}
</style>
</head>
<body>
	<div class="container">
		<h2>Flight Reservation Registration</h2>
		<form action="RegisterServlet" method="post">
			<label class="form-label" for="firstName">First Name:</label> <input
				type="text" id="firstname" name="firstname" required> <label
				class="form-label" for="lastName">Last Name:</label> <input
				type="text" id="lastname" name="lastname" required> <label
				class="form-label" for="email">Email:</label> <input type="email"
				id="email" name="email" required> <label class="form-label"
				for="password">Password:</label> <input type="password"
				id="password" name="password" required> <input type="submit"
				value="Register">
		</form>
	</div>
</body>
</html>
