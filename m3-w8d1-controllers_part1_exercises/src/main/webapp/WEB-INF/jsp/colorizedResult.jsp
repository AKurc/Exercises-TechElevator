<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%-- this is just a different way to do the same thing
<html>
	<head>
		<title></title>
	</head>
	<body>
		<h2>Colorized Name</h2>
		First Name: <c:out value="${colorizedName.firstName}"/><br>
		Last Name: <c:out value="${colorizedName.lastName}"/>
		
		<c:forEach var="eachColor" items="${colorizedName.color}">
			<div style="color:<c:out value="{eachColor}"/>;">
				<c:out value="${colorizedName.firstName}"/> <c:out value="${colorizedName.lastName}"/>
			</div>
			</c:forEach>
	</body>
</html> --%>

<!DOCTYPE html>

<html>
<head>
<title></title>
</head>
<body>
<h2>Colorized Name</h2>
First Name: <c:out value="${colorizedName.firstName}"/><br>
Last Name: <c:out value="${colorizedName.lastName}"/><br>

    <c:if test="${colorizedName.red}"> 
        <div style="color:red;">
        <c:out value="${colorizedName.firstName}"/> <c:out value="${colorizedName.lastName}"/>
        </div>
    </c:if>
    
    <c:if test="${colorizedName.blue}"> 
        <div style="color:blue;">
        <c:out value="${colorizedName.firstName}"/> <c:out value="${colorizedName.lastName}"/>
        </div>
    </c:if>
    
    <c:if test="${colorizedName.green}"> 
        <div style="color:green;">
        <c:out value="${colorizedName.firstName}"/> <c:out value="${colorizedName.lastName}"/>
        </div>
    </c:if>
    
    <div>
        <label></label>
        <input type="submit" value="Submit"/>   
    </div>

</body>
</html>