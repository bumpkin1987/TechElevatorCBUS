<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<%@include file="common/header.jspf"%>
<!-- Form goes here -->
<c:url var="formAction" value="/customerSearchResult" />
<form method="GET" action="${formAction}">
<div class="formInputGroup">
	<label for="Name"></label> 
	<input type="text" name="param" id="param" placeholder="Search"/><!-- name= "search" is what gets sent for the requestparam search in controller -->
	<select name="sort" id="sort">
		<option value="last_name">Last Name</option>
		<option value="email">Email</option>
		<option value="activebool">Active</option>
	</select>
	<button type="submit" value="submit">Submit</button>
</div>
</form>
<%@include file="common/footer.jspf"%>