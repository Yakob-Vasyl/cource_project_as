<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <script src="/resources/js/jquery-3.1.1.min.js"></script>
    <%--<link rel="stylesheet" href="/resources/css/bootstrap-theme.min.css"/>--%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/resources/css/main.css"/>
    <script src="/resources/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container-fluid">
    <div class="row">
        <nav class="navbar navbar-brand col-md-12">
            <div class="navbar-header">
                <c:forEach var="automationSystem" items="${automationSystemsList}">
                    <a href="/${automationSystem.id}">${automationSystem.name}</a>
                    <br/>
                </c:forEach>
            </div>
        </nav>
    </div>

    <h3>${automationSystem.name}</h3>

    <table class="table table-bordered">
        <thead>
        <tr>
            <th>АС</th>
            <th>Модель загроз</th>
            <th>Поведінка порушника</th>
            <th>Технології захисту АС</th>
            <th>Нормативне забезпечення захисту АС</th>
        </tr>
        </thead>
        <tbody>

        <tr>
            <td>
                <div class="table-td-inner">
                    <h2>${automationSystem.name}</h2>
                    <img src="/resources/images/${automationSystem.id}.png">
                    Функції
                    <br>
                    <ul>
                        <c:forEach items="${automationSystem.functions}" var="functions">
                            <li>${functions}</li>
                        </c:forEach>
                    </ul>

                    <br>
                    Приклади
                    <br>
                    <ul>
                        <c:forEach items="${automationSystem.examlpes}" var="example">
                            <li>${example}</li>
                        </c:forEach>
                    </ul>

                </div>
            </td>
            <td>
                <div class="table-td-inner">
                    <c:forEach var="threat" items="${automationSystem.threats}">
                        <strong>${threat.name}</strong>
                        Апаратні
                        <ul>
                            <c:forEach items="${threat.hardwareThreats}" var="hardwareThreat">
                                <li>
                                        ${hardwareThreat}
                                </li>
                            </c:forEach>
                        </ul>
                        Програмні
                        <ul>
                            <c:forEach items="${threat.softwareThreats}" var="softwareThreat">
                                <li>
                                        ${softwareThreat}
                                </li>
                            </c:forEach>
                        </ul>

                    </c:forEach>
                </div>
            </td>
            <td>
                <div class="table-td-inner">
                    <c:forEach var="intruder" items="${automationSystem.intruders}">
                        <strong>${intruder.name}</strong>
                        <ul>
                            <c:forEach var="intruderInner" items="${intruder.intruders}">
                                <li>
                                        ${intruderInner}
                                </li>
                            </c:forEach>
                        </ul>
                    </c:forEach>
                </div>
            </td>
            <td>
                <div class="table-td-inner">
                    <c:forEach var="protection" items="${automationSystem.protections}">
                        <strong>${protection.name}</strong>
                        <ul>
                            <c:forEach items="${protection.protections}" var="protectionInner">
                                <li>
                                        ${protectionInner}
                                </li>
                            </c:forEach>
                        </ul>
                    </c:forEach>
                </div>
            </td>
            <td>
                <div class="table-td-inner">
                    <c:forEach var="regulation" items="${automationSystem.regulations}">
                            <span>
                                    ${regulation.name}
                            </span>
                    </c:forEach>
                </div>
            </td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
