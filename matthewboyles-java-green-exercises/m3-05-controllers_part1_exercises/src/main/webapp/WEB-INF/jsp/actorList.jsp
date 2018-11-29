<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>
<!-- Form goes here -->
<c:url var="formAction" value="/actorsSearchResult" />
<form method="POST" action="${formAction}">
<div class="formInputGroup">
	<label for="search"></label> 
	<input type="text" name="search" id="search" placeholder="Search"/><!-- name= "search" is what gets sent for the requestparam search in controller -->
	<button type="submit" value="submit">Submit</button>
</div>
</form>

<table class="table">
<tr>
<th>Name</th>
</tr>
</table>
<%@include file="common/footer.jspf"%>