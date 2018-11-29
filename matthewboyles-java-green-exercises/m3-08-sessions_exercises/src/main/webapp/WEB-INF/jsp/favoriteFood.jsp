<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div style="width:575px;height:300px;border:1px solid #000;">
<br>
<font size="6.9" style= "margin: 20px;"><strong>Favorite Things Exercise</strong></font>
<br>
<div>
<br>
<font size="5" style= "margin: 20px;"><strong>What is your favorite food?</strong></font>
</div>
<br>
<c:url var="favoriteFood" value="/favoriteFood" />
<form style= "margin: 20px;" action="${favoriteFood}" method="POST">
	<label for="Food"></label>
	<input type="food" name="food" id="food"/>
	<div>
	<br>
    <button type="submit" value= "submit">Next >>></button>
	</div>
</form>
</div>
