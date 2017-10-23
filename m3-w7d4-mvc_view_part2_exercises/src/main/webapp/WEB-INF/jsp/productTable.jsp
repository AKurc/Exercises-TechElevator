<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product Table View</title>
    <link rel="stylesheet" href="css/site.css" />
</head>
<body>
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>        
    </header>
    <nav>
        <ul>
            <li><a href="#">Link 1</a></li>
            <li><a href="#">Link 2</a></li>
        </ul>
        
    </nav>
    <section id="main-content">
<h2>Recipes</h2>
	<section class="flexContainer">
		
			<table id="productTable">
			<tr>
				<th>&nbsp; </th>
				<c:forEach items="${product}" var="product">
					<td><img src="img/product${product.productId}.jpg" class="toyItem"/></td>
				</c:forEach>
			</tr>
				
			<tr class="greySpace">
				<th>Name </th>
					<c:forEach items="${product}" var="product">
						<td><c:out value="${product.name}" /></td>
					</c:forEach>
				</tr>
				<tr>
				<th>Type</th>
					<c:forEach items="${product}" var="product">
						<td><c:out value="${product.productType}" /></td>
						</c:forEach>
				</tr>
				<tr class="greySpace">
				<th>Cook Time</th>
					<c:forEach items="${recipes}" var="recipes">
						<td><c:out value="${recipes.cookTimeInMinutes}" /> min</td>
					</c:forEach>
				</tr>
				<tr>
				<th>Ingredients</th>
					<c:forEach items="${recipes}" var="recipes">
						<td><c:out value="${recipes.ingredients.size()}" /> Ingredients</td>
					</c:forEach>
				</tr>
				<tr class="greySpace">
				<th>Rating</th>
					<c:forEach items="${recipes}" var="recipes">
						<td><fmt:formatNumber  maxFractionDigits="0" value="${recipes.averageRating}" var="formattedRating" />
						<img src="img/${formattedRating}-star.png" class="rating"/>
						</td>
					</c:forEach>
				</tr>
				</table>
		
	
	</section>
       

    </section>
</body>
</html>