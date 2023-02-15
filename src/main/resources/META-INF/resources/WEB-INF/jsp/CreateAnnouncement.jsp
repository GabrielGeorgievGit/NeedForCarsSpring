<%@page import="bg.tuvarna.usp.entity.CarFuel"%>
<%@page import="bg.tuvarna.usp.entity.CarDrivetrain"%>
<%@page import="bg.tuvarna.usp.entity.CarType"%>
<%@page import="bg.tuvarna.usp.entity.City"%>
<%@page import="bg.tuvarna.usp.entity.AnnouncementType"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Announcement</title>
<link rel="stylesheet" href="webapp/style/style.css">
</head>
<body>
	<%
		List<AnnouncementType> announcementTypes = (List<AnnouncementType>) request.getAttribute("announcementTypes");
		List<City> cities = (List<City>) request.getAttribute("cities");
		List<CarType> carTypes = (List<CarType>) request.getAttribute("carTypes");
		List<CarDrivetrain> carDrivetrains = (List<CarDrivetrain>) request.getAttribute("carDrivetrains");
		List<CarFuel> carFuels = (List<CarFuel>) request.getAttribute("carFuels");
	%>
	<div class="center">
		<h1>Create Announcement</h1>
	<form action="create-announcement" method="post">
		<div class="textField">
			<input type="text" required name="title">
			<span></span>
			<label for="title">Title</label>
		</div>
		<div class="select-box">
		<span class ="label"> Announcement Type :</span>
		<select name="announcementTypeId">
		<% for(int i = 0; i < announcementTypes.size(); ++i) { 
			AnnouncementType type = announcementTypes.get(i);
		%>
			<option value="<%=type.getIdType() %>"><%=type.getName() %></option>
		<%} %>
		</select> <br>
		</div>
		<div class="textField">
			<input type="text" required name="contactName">
			<span></span>
			<label for="Contact Name">Contact Name</label> 
		</div>
		<div class="textField">
			<input type="text" required name="contactNumber"> 
			<span></span>
			<label for="Contact Number">Contact Number</label> 
		</div>
		<div class="select-box">
		<span class ="label"> City :</span>
		<select name="cityId">
		<% for(int i = 0; i < cities.size(); ++i) { %>
			<option value="<%=cities.get(i).getId() %>"><%=cities.get(i).getName() %></option>
		<%} %>
		</select> <br>
		</div>
		<br>
		<!-- Тук за разнообразие съм го направил да е радио бутон, направи го както мислиш че ще е най добре -->
		<label><p style="color:grey">Car type :</p></label> <br>
		<p style="color:grey"><label class = "container"><%=carTypes.get(0).getCoupe() %>
		<input type="radio" name="carTypeId" value="<%=carTypes.get(0).getId() %>" checked>
		<span class="checkmark"></span>
		</label></p>
	    <% for(int i = 1; i < carTypes.size(); ++i) { %>
	    <p style="color:grey"><label class = "container"><%=carTypes.get(i).getCoupe() %>
	    <input type="radio" name="carTypeId" value="<%=carTypes.get(0).getId() %>">
	    <span class="checkmark"></span>
	    </label></p>
	    <%} %> 
	    <div class="textField">
	    	<input type="text" required name="brand">
	    	<span></span>
	    	<label for="Brand">Brand</label> 
	    </div>
	    <div class="textField">
	    	<input type="text" required name="model">
	    	<span></span>
	    	<label for="Model">Model</label> 
	    </div>
	    <label><p style="color:grey">Drivetrain :</p></label> <br>
		<p style="color:grey"><label class = "container"><%=carDrivetrains.get(0).getName() %>
		<input type="radio" name="drivetrainId" value="<%=carDrivetrains.get(0).getId() %>" checked>
		<span class="checkmark"></span>
		</label></p>
		<% for(int i = 1; i < carDrivetrains.size(); ++i) { 
			CarDrivetrain drivetrain = carDrivetrains.get(i);
		%>
		<p style="color:grey"><label class = "container"><%=drivetrain.getName() %>
		<input type="radio" name="drivetrainId" value="<%=drivetrain.getId() %>">
		<span class="checkmark"></span>
		</label></p>
		<%} %> <br>
		<div class="textField">
			<input type="text" required name="color">
			<span></span>
			<label for="Color">Color</label> 
		</div>
		<div class="textField">
			<input type="number" required name="power">
			<span></span>
			<label for="Horse power">Horse power</label> 
		</div>
		<div class="select-box">
		<span class = "label">Transmission : </span>
		<select name="transmission">
			<option value="0">Automatic</option>
			<%for(int i = 5; i < 9; ++i) { %>
				<option value="<%=i %>"><%=i %> gears</option>
			<%} %>
		</select> <br>
		</div>
		<div class="textField">
			<input type="text" required name="engine">
			<span></span>
			<label for="Engine">Engine</label>
		</div>
		<div class="textField">
			<input type="number" required name="doors">
			<span></span>
			<label for="Door number">Door number</label>
		</div>
		<div class="textField">
			<input type="number" required name="weight">
			<span></span>
			<label for="Wight">Weight (KG)</label> 
		</div>
		<div class="select-box">
		<span class ="label"> Fuel Type :</span>
		<select name="fuelId">
		<% for(int i = 0; i < carFuels.size(); ++i) { 
			CarFuel fuel = carFuels.get(i);
		%>
			<option value="<%=fuel.getIdFuel() %>"><%=fuel.getName() %></option>
		<%} %> 
		</select> <br>
		</div>
		<div class="textField">
			<input type="number" required name="displacement">
			<span></span>
			<label for="Displacement">Displacement (cc)</label>
		</div>
		
		<p style="color:grey"><label>Description:</label></p> <br>
		<textarea name="description" rows="5" cols="40"></textarea> <br>
		<div class="textField">
			<input type="number" required name="price">
			<span></span>
			<label for="Price">Price</label>
		</div>
		<br>
		<input type="submit" value="Submit">
		<br>
		<div class="signup">
			Go back to Home Page <a href ="index.jsp">Home</a>
		</div>
	</form>
</div>
</body>
</html>