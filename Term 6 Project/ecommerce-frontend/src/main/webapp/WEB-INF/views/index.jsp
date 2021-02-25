<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<a href="display-products">Products</a>
<h2>Student Names:</h2>


<ol>
<c:forEach var="name" items="${message}">
 <li>${name }</li>
</c:forEach>
</ol>

</body>
</html>


