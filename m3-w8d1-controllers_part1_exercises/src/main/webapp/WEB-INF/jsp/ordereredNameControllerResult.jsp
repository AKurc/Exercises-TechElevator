<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
<title></title>
</head>
<body>
<h2>Ordered Name</h2>
First Name: <c:out value="${orderedNameController.firstName}"/><br>
Middle Initial: <c:out value="${orderedNameController.middleInitial}"/><br>
Last Name: <c:out value="${orderedNameController.lastName}"/><br>

    <c:if test="${orderedNameController.firstName}"> 
        <div>
        <c:out value="${orderedNameController.firstName}"/> <c:out value="${orderedNameController.lastName}"/>
        </div>
    </c:if>
    
    <c:if test="${orderedNameController.middleInitial}"> 
          <div>
        <c:out value="${orderedNameController.middleInitial}"/> <c:out value="${orderedNameController.middleInitial}"/>
        </div>
    </c:if>
    
    <c:if test="${orderedNameController.lastName}"> 
        <div>
        <c:out value="${orderedNameController.lastName}"/> <c:out value="${orderedNameController.lastName}"/>
        </div>
    </c:if>
    
    <div>
        <label></label>
        <input type="submit" value="Submit"/>   
    </div>

</body>
</html>