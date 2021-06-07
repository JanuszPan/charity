<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <title>Donations</title>
    <link rel="stylesheet" href="<c:url value="../resources/css/style.css"/>"/>
    <style>
        table, th, td {
            border: 1px solid khaki;
            font-family: 'Merriweather', serif;
            font-weight: 500;
            font-size: 2.2rem;
        }
    </style>
</head>
<body>
    <jsp:include page="header.jsp"/>
<h2>Dary</h2>
<table id="customTables" class="center">
    <caption><b>Lista przekazanych darów.</b></caption><br>
    <tr>
        <th>Kategoria</th>
        <th>Ilość worków</th>
        <th>Data odbioru</th>
        <th>Godzina odbioru</th>
    </tr>
    <c:forEach items="${donationsAll}" var="donation">
        <tr>
            <td>
                <c:forEach
                    items="${donation.categories}" var="category">${category.name};
                </c:forEach>
            </td>
            <td>${donation.quantity}</td>
            <td>${donation.pickUpDate}</td>
            <td>${donation.pickUpTime}</td>
<%--            <td>--%>
<%--                <a href="/admin/donations/delete/${donation.id}">Usuń</a><br>--%>
<%--                <a href="/user/donations/edit/${donation.id}">Edytuj</a><br>--%>
<%--            </td>--%>
        </tr>
    </c:forEach>
</table>
    <jsp:include page="footer.jsp"/>
    <script src="<c:url value="../resources/js/app.js"/>"></script>
</body>
</html>
