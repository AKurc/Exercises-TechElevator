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
		
		<c:set var="firstNum" value= "0" />
		<c:set var="secondNum" value= "1" />
		
			<c:forEach begin="1" end="25" >
				<c:set var="temp" value="${firstNum+secondNum}" />
					<li> <c:out value="${temp}" />
					</li>

				<c:set var="firstNum" value= "${secondNum}" />
				<c:set var="secondNum" value= "${temp}" />
			</c:forEach>
			<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				See exercise2-fibonacci.png for example output
			 --%>
		</ul>
	</body>
</html>