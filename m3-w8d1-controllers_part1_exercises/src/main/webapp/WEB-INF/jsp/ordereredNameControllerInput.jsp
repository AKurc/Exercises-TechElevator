<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<section class="centeredPanel">
<html>
<head>
<title></title>
</head>
<body>
	<c:url var="formAction" value="/orderedNameControllerResult" />
	<form method="GET" action="${formAction}">
		<h2>Enter Name</h2>
		<div>
			<label for="firstName">First Name:</label> <input type="text"
				name="firstName" id="firstName">
		</div>
		<div>
			<label for="middleInitial">Middle Initial:</label> <input type="text"
				name="middleInitial" id="middleInitial" />
		</div>
		<div>
			<label for="lastName">Last Name:</label> <input type="text"
				name="lastName" id="lastName" />
		</div>
		
		<h2>Choose Order</h2>
		<div>
			<input type="radio" name="firstMiLast" value="true"> First MI Last
		</div>
		<div>
			<input type="radio" name="firstLast" value="true"> First Last
		</div>
		<div>
			<input type="radio" name="lastFirstMi" value="true"> Last, First MI
		</div>
		<div>
			<input type="radio" name="lastFirst" value="true"> Last, First
		</div>
		<input type="submit" value="Submit">
	</form>
</body>

</body>
	</body>
	</html>	
</section>