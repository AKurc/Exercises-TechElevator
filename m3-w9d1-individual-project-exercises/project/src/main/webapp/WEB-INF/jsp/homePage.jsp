<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

 <h2>Explore Categories</h2>
       
        <ul>
        <c:forEach items="${categories}" var="category">
       	    <c:url var="categoryUrl" value="/categoryPage?categoryId=${category.id}"></c:url>
            <li><a href="${categoryUrl}"><c:out value="${category.name}"/></a></li>
        </c:forEach>
           
                     
        </ul>
<%-- <section id="cards">

    <section id="available-cards" class="cards">
        <h1>Card Categories:</h1>
        <section class="relationships">
            <h2>Relationships: A relationship is just two idiots who don't know a damn thing except that they're willing to figure it out together</h2>
            <c:url var="mercuryImgSrc" value="/img/mercury.jpg" />
            <img src="${mercuryImgSrc}" alt="relationship">
            <p>I am not going anywhere, so I hope you are okay with that. Because I love you.</p>
        </section>

		<section class="petsPassing"> 
            <h2>Pet Passing Cards: No matter how long we get with our pets, it's never enough</h2>
            <c:url var="venusImgSrc" value="/img/venus.jpg" />
            <img src="${venusImgSrc}" alt="Venus">
            <p>Squirrels Run Slower In Heaven</p>
        </section>

        <section class="empathy">
            <h2>Empathy Cards: saying what needs to be said when you don't know how to say it</h2>
            <c:url var="earthImgSrc" value="/img/earth.jpg" />
            <img src="${earthImgSrc}" alt="Earth">
            <p>I wish I could take away all of your pain. Or, at least take away the people who compare it to the time their hamster died.</p>
        </section>

        <section class="oops">
            <h2>Oops: For all the take-backs you wish you had</h2>
            <c:url var="marsImgSrc" value="/img/mars.jpg" />
            <img src="${marsImgSrc}" alt="Mars">
            <p>Oops!!! Some days you should just stay in bed</p>
        </section>
    </section>



 --%>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />