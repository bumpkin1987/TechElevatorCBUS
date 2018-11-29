<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>
<!-- Form goes here -->
<c:url var="formAction" value="/actorsSearchResult" />
<form method="POST" action="${formAction}">
<div class="formInputGroup">
	<label for="search"></label> 
	<input type="text" name="search" id="search" placeholder="Search"/>
	<button>Submit</button>
</div>
</form>

<table class="table">
	<tr>
		<th>Name</th>
	</tr>

	<c:forEach var="actor" items="${actors}">
		<div>
			<p id="firstname">${actor.firstName}</p>
			<p id="lastname">${actor.lastName}</p>	
		</div>    	
	</c:forEach> 
</table>



	




<%@include file="common/footer.jspf"%>