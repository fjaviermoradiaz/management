<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add new employees</title>
    <link type="text/css" href="/css/bootstrap.css" rel="stylesheet" />

</head>

<body>

<h2>Registration Form</h2>

<form:form method="POST" modelAttribute="employee">
    <form:input type="hidden" path="id" id="id"/>
    <table>
        <tr>
            <td><label for="name">Name: </label> </td>
            <td><form:input path="name" id="name" class="form-control"/></td>
            <td><form:errors path="name" cssClass="error"/></td>
        </tr>

        <!--             <tr> -->
        <!--                 <td><label for="joiningDate">Joining Date: </label> </td> -->
            <%--                 <td><form:input path="joiningDate" id="joiningDate"/></td> --%>
            <%--                 <td><form:errors path="joiningDate" cssClass="error"/></td> --%>
        <!--             </tr> -->

        <tr>
            <td><label for="salary">Salary: </label> </td>
            <td><form:input path="salary" id="salary" class="form-control"/></td>
            <td><form:errors path="salary" cssClass="error" class="form-control"/></td>
        </tr>

        <tr>
            <td colspan="3">
                <c:choose>
                    <c:when test="${edit}">
                        <input type="submit" value="Update" class="btn btn-success"/>
                    </c:when>
                    <c:otherwise>
                        <input type="submit" value="Register" class="btn btn-success"/>
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
    </table>
</form:form>
<br/>
<br/>
Go back to <a href="<c:url value='/list' />" class="btn btn-success">List of All Employees</a>
</body>
</html>