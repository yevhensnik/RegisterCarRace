<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<title>Автомобільний клуб | K-Team |</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<link rel="stylesheet" href="<c:url value="resources/stylereg.css" />" />
</head>
<body>
	<div class="container">
    <section class="register">
      <h1>Register </h1>
      	
      <sf:form method="POST" modelAttribute="application" action="index.html">
      
	      <div class="reg_section personal_info">
	      <h3>Your Personal Information</h3>
			  <input type="text" name="name" value="" placeholder="Your Name">
			  <input type="text" name="dateofbirdth" value="" placeholder="Your Date of birdth">
			  <input type="text" name="username" value="" placeholder="Your Username">
			  <input type="text" name="cityName" value="" placeholder="Your City">
			  <input type="text" name="sexName" value="" placeholder="Your Sex">
			  
		
	      </div>
	      
	      <div class="reg_section password">
		    <h3>Your Car</h3>
			<input type="text" name="licensePlate" value="" placeholder="Your license Plate">
			<input type="text" name="engineCapacity" value="" placeholder="Your Engine Capacity">
			<input type="text" name="carYear" value="" placeholder="Your Year Car">
			<input type="text" name="carBrand" value="" placeholder="Your Carbrand">
			<input type="text" name="carBrandModel" value="" placeholder="Your Car Brand Model">
			<input type="text" name="carStyle" value="" placeholder="Your Car Style">
			<input type="text" name="carBody" value="" placeholder="Your Car Body">
			<input type="text" name="carFuel" value="" placeholder="Your Car Fuel">
			<input type="text" name="carOrderDrive" value="" placeholder="Your Car order drive">
			<input type="text" name="moreInfo" value="" placeholder="More info for you">
	      </div>
	  
	  
			<a href="users.html">Submit</a>
	      <p class="submit"><input type="submit" name="commit" value="Sign Up"></p>
      </sf:form>
    </section>
  </div>
</body>
</html>