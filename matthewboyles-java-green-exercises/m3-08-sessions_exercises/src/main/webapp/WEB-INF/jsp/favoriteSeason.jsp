<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div style="width:575px;height:300px;border:1px solid #000;">
<br>
<font size="6.9" style= "margin: 20px;"><strong>Favorite Things Exercise</strong></font>
<br>
<div>
<br>
<font size="5" style= "margin: 20px;"><strong>What is your favorite season?</strong></font>
</div>
<br>
<c:url var="favoriteSeason" value="/favoriteSeason" />
<form style= "margin: 20px;" action="${favoriteSeason}" method="POST">
	<label for="Season"></label>
	<input type="text" name="season" id= "season"/>
	<div>
	<br>
    <button type="submit" value= "submit">Next >>></button>
	</div>
</form>
</div>
