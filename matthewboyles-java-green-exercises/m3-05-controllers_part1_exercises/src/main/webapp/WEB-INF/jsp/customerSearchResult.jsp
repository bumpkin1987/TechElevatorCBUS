<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<%@include file="common/header.jspf"%>
<!-- Form goes here -->
<c:url var="formAction" value="/customersSearchResult" />
<form method="GET" action="${formAction}">
<div class="formInputGroup">
	<label for="Name"></label> 
	<input type="text" name="param" id="param" placeholder="Search"/><!-- name= "search" is what gets sent for the requestparam search in controller -->
	<select name= "sort">
		<option value= "last_name">Last Name</option>
		<option value= "email">Email</option>
		<option value= "activebool">Active</option>
	</select>
	<button type="submit" value="submit">Submit</button>
</div>
</form>

<table class="table">
<tr>
<c:forEach var="customer" items="${customers}">
		<tr>
			<td id="firstName">${customer.firstName}</td>
			<td id="lastName">${customer.lastName}</td>
			<td id="email">${customer.email}</td>
			<td id="active">${customer.active}</td>	
		</tr>    	
</c:forEach> 
</tr>
</table>
<%@include file="common/footer.jspf"%>