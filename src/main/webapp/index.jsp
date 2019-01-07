<%--
  Created by IntelliJ IDEA.
  User: yo
  Date: 07/01/2019
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Product Discount Calculator</title>
  <link rel="stylesheet" type="text/css">
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="/display-discount" method="post">
  <input type="text" name="txtDescription" placeholder="Product Description: "/>
  <input type="text" name="txtPrice" placeholder="List Price: "/>
  <input type="text" name="txtDiscount" placeholder="Discount Percent: "/>
  <input type = "submit" id = "submit" value = "Result"/>
</form>
</html>
