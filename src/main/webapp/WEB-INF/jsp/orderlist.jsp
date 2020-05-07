<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Order List</title>
    <style>
        .no {
            color: green;
        }

        .yes {
            color: red;
        }
    </style>
</head>
<body>
<section>
    <h3><a href="index.html">Home</a></h3>
    <hr/>
    <h2>OrderList</h2>
    <table border="1" cellpadding="8" cellspacing="0">
        <thead>
        <tr>
            <th>ProductName</th>
            <th>ProductPrice</th>
        </tr>
        </thead>
        <c:forEach items="${products}" var="product">
            <jsp:useBean id="product" type="OMA.model.Product"/>
            <tr>
                <td>${product.name}</td>
                <td>${product.price}</td>
            </tr>
        </c:forEach>
    </table>
    <h3><a href="ordereditor">Edit</a></h3>
</section>
</body>
</html>