<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
			<c:set value = "0" var = "a"/>
			<c:set value = "1" var = "b"/>
			<c:set value = "${a + b}" var = "c"/>
				<li>0</li>
				
			<c:forEach begin="0" end="25" var= "fib">
				<li>${c}</li>
				<c:set value = "${a + b}" var = "c"/>
				<c:set value = "${b}" var = "a"/>
				<c:set value = "${c}" var = "b"/>		
			</c:forEach>
			<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
			 --%>
		</ul>
	</body>
</html>