<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

<!--   $ {products} List <Product> ModelAndView("this page") -->


 <table style="width:100%">
  <tr>
    <th>Name</th>
    <th>Price</th>
  </tr>
  
  <c:forEach var="$ {product}" items="$ {products}" >
  
  <tr>
    <td>$ {product.name}</td>
    <td>$ {product.price}</td>
  </tr>
  
  </c:forEach>
  
  
  <tr>
    <td></td>
    <td></td>
  </tr>
</table> 


</body>
</html>