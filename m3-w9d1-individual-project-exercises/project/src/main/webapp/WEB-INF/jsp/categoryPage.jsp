<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<h1>Category: <c:out value="${category.name}"/></h1>
<section id="cards">
	<c:forEach items="${allCards}" var="card">
       	    <c:url var="cardUrl" value="/cardPage?id=${card.id}"></c:url>
            <li><a href="${cardUrl}"><c:out value="${card.cardName}"/></a></li>
        </c:forEach>
    <section id="available-cards" class="available-cards">

</section>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />