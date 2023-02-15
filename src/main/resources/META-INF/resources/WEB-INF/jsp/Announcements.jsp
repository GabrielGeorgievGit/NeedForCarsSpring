<%@page import="bg.tuvarna.usp.entity.AnnouncementType"%>
<%@page import="bg.tuvarna.usp.entity.City"%>
<%@page import="bg.tuvarna.usp.entity.Announcement"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webapp/style/style.css">
<title>Announcement page</title>
</head>
<body>
	<%
		List<Announcement> announcements = (List<Announcement>)request.getAttribute("announcementsList");
		List<City> cities = (List<City>)request.getAttribute("citiesList");
		List<AnnouncementType> announcementTypes = (List<AnnouncementType>)request.getAttribute("announcementTypesList");
	%>
	<div class="center">
		<h1>Anouncements</h1>
		<form action="search-announcements" method="post">
			<div class="textField">
				<input type="text" required name="carBrand">
				<span></span> 
				<label for="Brand">Brand:</label>
			</div>
			<div class="textField">
				<input type="text" required name="carModel">
				<span></span>
				<label for ="Model">Model:</label>
			</div>
			
			<div class="select-box">
			<span class="label">City :</span>
			<select name="cityId">
			<!-- <c:forEach items="${citiesList}" var="citiesList">
				<c:out value="${city.id }"/>
				<c:out value="${city.name }"/>
			</c:forEach>
			 
				<option value="${city.id }" selected="selected">${city.name}</option>
				-->
			<% for(int i = 0; i < cities.size(); ++i) { %>
				<option value="<%=cities.get(i).getId() %>"><%=cities.get(i).getName() %></option>
			<%} %>
			</select>
			 <br>
			</div><br>
			<div class="select-box">
			<span class="label">Announcement type: </span>
			<select name="carTypeId">
			<% for(int i = 1; i < announcementTypes.size()+1; ++i) { %>
				<option value="<%=announcementTypes.get(i-1).getIdType() %>"><%=announcementTypes.get(i-1).getName() %></option>
			<%} %>
			</select> <br>
			</div><br><br>
			<input type="submit" value="Filter">
		</form>
		<div class="signup">
			<a href ="/announcements">Remove filter</a>
		</div>
	<ol>
		<% for(Announcement announce : announcements) 
			{
		%>
			<li>
				<form method="post" action="announcements">
					<input type="hidden" name="id" value="<%=announce.getId() %>">
					Announcement type: <%=announce.getAnnouncementType().getName() %><br>
					Title: <%= announce.getTitle() %> <br>
					Price: <%=announce.getPrice() %> <br>
					City: <%=announce.getCity().getName() %> <br>
					<input type="submit" value="View">
				</form>
			</li>
		 <%}%>
	</ol>
	<div class="signup">
			Go back to Home Page <a href ="index.jsp">Home</a>
		</div>
	</div>	
	
</body>
</html>