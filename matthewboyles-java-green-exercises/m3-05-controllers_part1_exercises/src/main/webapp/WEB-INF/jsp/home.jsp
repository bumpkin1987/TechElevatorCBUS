<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>
<!-- Form goes here -->

<div>
<c:url var="formAction" value="/actorList" />
<form method="GET" action="${formAction}">
<button type="submit" value="submit">Go to actor search</button>
</form> 
<br>
<c:url var="formAction" value="/customerList" />
<form method="GET" action="${formAction}">
<button type="submit" value="submit">Go to customer search</button>
</form> 
<br>
<c:url var="formAction" value="/filmList" />
<form method="GET" action="${formAction}">
<button type="submit" value="submit">Go to film search</button>
</form> 
</div>


<%@include file="common/footer.jspf"%>