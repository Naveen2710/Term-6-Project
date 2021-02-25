<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
<h2>Products Page</h2>
<hr>
<table border="1">
     <tr>
        <th>Product Id</th>
        <th>Name</th>
        <th>Price</th>
        <th>Quantity</th>
        <th>Manufacturing Date</th>
        <th>Expiry Date</th>
        <th>Description</th>
        <th>Product Actions</th>
     </tr>
   
     <c:forEach var="product" items="${list }">
       <tr>
        <td>${product.id }</td>
        <td>${product.name }</td>
        <td>${product.price }</td>
        <td>${product.quantity }</td>
        <td>${product.mfg }</td>
        <td>${product.expiryDate }</td>
        <td>${product.description }</td>
        <td>
           <a href="" >Update</a>
           <a href="" >Delete</a>
        </td>
         </tr>
     </c:forEach>
    
     
     
</table>

</body>
</html>