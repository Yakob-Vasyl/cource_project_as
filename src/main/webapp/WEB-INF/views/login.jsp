<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8">
    <%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">--%>
    <%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>--%>
    <%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>
    <script src="/resources/js/jquery-3.1.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/resources/css/styles.css"/>
    <script src="/resources/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-12 col-xs-12">
                <form:form class="form-horizontal" action="/login" method="POST">
                    <div class="form-group">
                        <label class="col-sm-offset-2 col-sm-10"><form:errors path="email"/></label>
                    </div>
                    <div class="form-group">
                        <label for="login" class="col-sm-2 control-label">Login</label>
                        <div class="col-sm-6">
                            <input class="form-control" name="login" id="login">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-offset-2 col-sm-10"><form:errors path="password"/></label>
                    </div>
                    <div class="form-group">
                        <label for="password" class="col-sm-2 control-label">Password</label>
                        <div class="col-sm-6">
                            <input class="form-control" type="password" name="password" id="password">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <div class="checkbox">
                                <label>
                                    <input name="remember-me" type="checkbox"> Remember me
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-default">Sign in</button>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</body>
</html>