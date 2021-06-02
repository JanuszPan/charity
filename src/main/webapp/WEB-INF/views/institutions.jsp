<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <title>Institutions</title>
    <link rel="stylesheet" href="<c:url value="../resources/css/style.css"/>"/>
</head>
<body>
<jsp:include page="header.jsp"/>
<section class="help">
    <h2>Fundacje</h2>
    <div class="help--slides active" data-id="1">
        <table class="help--slides-items">
            <caption>Lista zweryfikowanych Fundacji, z którymi współpracujemy.</caption>
            <tr class="help--slides-items">
                <th>ID</th>
                <th>Fundacja</th>
                <th>Cel i misja</th>
            </tr>
            <c:forEach items="${fundations}" var="fundation" varStatus="theCount">
                <tr class="help--slides-items">
                    <div class="col">
                        <td>${theCount.index}</td>
                        <td>${fundation.name}</td>
                        <td>${fundation.description}</td>
                    </div>
                </tr>
            </c:forEach>
        </table>
    </div>
</section>
<jsp:include page="footer.jsp"/>
<script src="<c:url value="../resources/js/app.js"/>"></script>
</body>
</html>