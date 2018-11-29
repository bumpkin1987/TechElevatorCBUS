<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 3 - Echo</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 3 - Echo</h1>
		
		<ul>
			 <%--sets up variable with value form is "${parameter of count} --%>
			 <c:set var ="count" value="${param.count}"/>
			 
			 <%--sets up variable with value form is "${parameter of word} --%>
			 <c:set var ="word" value="${param.word}"/>
			 
			<%--sets up loop with begin is initial value like i is in for loops. end is being fed value of parameter count --%>
			 <c:forEach begin="0" end="${count}" var ="decrement"><
			 	<li style ="font-size: ${count - decrement}px">${word}</li>
			 </c:forEach>
		<%--
			Given two query string parameters, "word" and "count":
			
			Add a number of list items equal to "count".  Each list item should contain the value passed in "word".
			
			The font size of the first list item should be equal to "count".  The font size of each subsequent list
			item should be decreased by 1.
			 
			See exercise3-echo.png for example output
		 --%>
		</ul>
		
	</body>
</html>