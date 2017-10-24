<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Uncommon Cards</title>
    <c:url value="/css/uncommonCards.css" var="cssHref" />
    <link rel="stylesheet" href="${cssHref}">
</head>

<body>
    <header>
    		<c:url value="/" var="homePageHref" />
    	<%-- 	<c:url value="/img/ssg_logo.png" var="logoSrc" /> --%>
        <a href="${homePageHref}">
        		<%-- <img src="${logoSrc}" alt="Solar System Geek logo" /> --%>
        </a>
        <h1>Uncommon Cards</h1>
        <p>Meeting the Need for Pragmatic Cards Fifty Percent of the Time.</p>
    </header>
   <nav>
       
    </nav>