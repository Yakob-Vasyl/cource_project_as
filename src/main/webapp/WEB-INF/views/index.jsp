<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">--%>
    <meta charset="UTF-8">
    <%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>--%>
    <%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>
    <script src="/resources/js/jquery-3.1.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/resources/css/styles.css"/>
    <script src="/resources/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container">

    <div class="row">
        <nav class="navbar navbar-brand col-md-12">
            <div class="navbar-header">
                <c:forEach var="categoryItem" items="${listCategory}">
                    <a href="/${categoryItem.id}">${categoryItem.name}</a>
                    <br/>
                </c:forEach>
            </div>
        </nav>
    </div>

    <h3>${category}</h3>

    <table class="table table-bordered">
        <thead>
        <tr>
            <th>Сегменти</th>
            <th>Складові сегментів</th>
            <th>Загрози</th>
            <th>Захист</th>
            <th>Нормативне забезпечення</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${segments}" var="segment">
            <tr>
                <td>
                        ${segment.name}
                </td>
                <td>
                    <div class="table-td-inner">
                        <c:forEach var="subS" items="${segment.subSegments}">
                                <span>
                                        ${subS.name}
                                </span>
                        </c:forEach>
                    </div>
                </td>
                <td>
                    <div class="table-td-inner">
                        <c:forEach var="threat" items="${segment.threatProtections}">
                                <span>
                                        ${threat.threat}
                                </span>
                        </c:forEach>
                    </div>
                </td>
                <td>
                    <div class="table-td-inner">
                        <c:forEach var="protect" items="${segment.threatProtections}">
                            <span>
                                    ${protect.protections}
                            </span>
                        </c:forEach>
                    </div>
                </td>
                <td>
                    <div class="table-td-inner">
                        <c:forEach var="regulation" items="${segment.regulations}">
                            <span>
                                    ${regulation.name}
                            </span>
                        </c:forEach>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
