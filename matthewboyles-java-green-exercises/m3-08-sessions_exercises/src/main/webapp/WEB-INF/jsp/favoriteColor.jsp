<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div style="width:575px;height:300px;border:1px solid #000;">
<br>
<font size="6.9" style= "margin: 20px;"><strong>Favorite Things Exercise</strong></font>
<br>
<div>
<br>
<font size="5" style= "margin: 20px;"><strong>What is your favorite color?</strong></font>
</div>
<br>
<c:url var="favoriteColor" value="/favoriteColor" />
<form style= "margin: 20px;" action="${favoriteColor}" method="POST">
	<label for="color"></label>
	<input type="text" name="color" id="color"/>
	<div>
	<br>
    <button type="submit" value= "submit">Next >>></button>
	</div>
</form>
</div>
