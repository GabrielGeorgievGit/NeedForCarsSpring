<%@page import="bg.tuvarna.usp.entity.CarDescription"%>
<%@page import="bg.tuvarna.usp.entity.Announcement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webapp/style/style.css">
<title>View Announcement page</title>
</head>
<body>
	<div>
	<div class="center">
		<div>
		<% Announcement announce = (Announcement) request.getAttribute("viewAnnouncement");
			CarDescription car = announce.getCarDescription();
		%>
		<br>
		<h1><%= announce.getTitle() %></h1>
		<br>
		<p><h3>Announcement type:</h3> <%=announce.getAnnouncementType().getName() %> </p><br> 
		<p><h3>Title:</h3> <%= announce.getTitle() %></p> <br>
		<p><h3>Price:</h3> <%=announce.getPrice() %> лв.</p> <br>
		<p><h3>City:</h3> <%=announce.getCity().getName() %></p> <br>
		<p><h3>Contact Name:</h3> <%=announce.getContactName() %></p> <br>
		<p><h3>Contact Phone Number:</h3> <%=announce.getContactPhone() %></p> <br>
		</div>
		<div>
		<br>
		<h1>Car description:</h1>
		<br>
		<p><h3>Brand:</h3> <%=car.getBrand() %></p> <br>
		<p><h3>Model:</h3> <%=car.getModel() %></p> <br>
		<p><h3>Drivechain:</h3> <%=car.getDrivetrain().getName() %></p> <br>
		<p><h3>Car color:</h3> <%=car.getBrand() %></p> <br>
		<p><h3>Power:</h3> <%=car.getPower() %>HP</p> <br>
		<p><h3>Transmission:</h3> <%=car.getTransmissionName() %></p> <br>
		<p><h3>Engine:</h3> <%=car.getEngine() %></p> <br>
		<p><h3>Doors:</h3> <%=car.getDoorNumber() %></p> <br>
		<p><h3>Weight:</h3> <%=car.getWeight() %>KG</p> <br>
		<p><h3>Fuel:</h3> <%=car.getFuel().getName() %></p> <br>
		<p><h3>Displacement:</h3><%=car.getDisplacement() %> кубика</p> <br>
		<br>
		<br>
		Description: <br>
		<textarea rows="" cols=""><%=car.getDescription() %></textarea>
		</div>
	</div>
	</div>
</body>
</html>