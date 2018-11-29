<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>
<!-- Form goes here -->
<c:url var="formAction" value="/filmSearchResult" />
<form method="GET" action="${formAction}">
<div class="formInputGroup">	
	<label for="minLength"></label> 
	<label for="maxLength"></label> 
	<input value="60" type="text" name="minLength" id="minLength" placeholder="MinLength"/>
	<input value="120" type="text" name="maxLength" id="maxLength" placeholder="MaxLength"/><!-- name= "search" is what gets sent for the requestparam search in controller -->
	<select name= "genre">
		<option>Action</option>
		<option>Animation</option>
		<option>Children</option>
		<option>Classics</option>
		<option>Comedy</option>
		<option>Documentary</option>
		<option>Drama</option>
		<option>Family</option>
		<option>Foreign</option>
		<option>Games</option>
		<option>Horror</option>
		<option>Music</option>
		<option>New</option>
		<option>Sci-Fi</option>
		<option>Sports</option>
		<option>Travel</option>
		<option>Mathmagical</option>
	</select>
	<button type="submit" value="submit">Submit</button>
</div>
</form>

<%@include file="common/footer.jspf"%>