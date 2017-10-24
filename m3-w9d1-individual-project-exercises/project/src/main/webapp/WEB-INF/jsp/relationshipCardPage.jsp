<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="common/header.jsp"%>

<%-- INPUT
	<section class="centeredPanel">
	<h2>Alien Age Calculator</h2>

	<c:url var="alienAgeUrl" value="/alienAgeResults" />
	<form method="GET" action="${alienAgeUrl}">
		<div>
			<label for="planet">Choose a planet</label> <select name="planet"
				id="planet">
				<option value="mercury">Mercury</option>
				<option value="venus">Venus</option>
				<option value="mars">Mars</option>
				<option value="jupiter">Jupiter</option>
				<option value="saturn">Saturn</option>
				<option value="uranus">Uranus</option>
				<option value="neptune">Neptune</option>
			</select>
		</div>
		<div>
			<label for="age">Enter your Earth age</label> <input type="number"
				name="age" id="age" placeholder="Between 1 and 100" />

		</div>
		<div>
			<label></label> <input type="submit" value="Calculate Age" />
		</div>
	</form>
</section> --%>

<%-- RESULT
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@include file="common/header.jsp"%>
<section class="centeredPanel">
	<c:url var="planetImageUrl" value="/img/${calculator.planet}.jpg" />
	<img src="${planetImageUrl}" />
	<h2>
		If you are
		<c:out value="${calculator.age}" />
		years old on planet earth, then you are
		<c:out value="${calculator.alienAge}" />
		<span class="title-case"></span>
		<c:out value="${calculator.planet}" />
		years old
	</h2> 
</section>--%>

<%@include file="common/footer.jsp"%>