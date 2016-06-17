<%--
  Created by IntelliJ IDEA.
  User: fjmora
  Date: 17/06/16
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@include file="../templates/structure.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <form role="form" action="/login" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <div>
            <label for="email">Email address</label>
            <input type="email" name="email" id="email" required autofocus>
        </div>
        <div>
            <label for="password">Password</label>
            <input type="password" name="password" id="password" required>
        </div>
        <div>
            <label for="remember-me">Remember me</label>
            <input type="checkbox" name="remember-me" id="remember-me">
        </div>
        <button type="submit">Sign in</button>
    </form>

    <#if error>
        <p>The email or password you have entered is invalid, try again.</p>
    </#if>
</head>
<body>

</body>
</html>
