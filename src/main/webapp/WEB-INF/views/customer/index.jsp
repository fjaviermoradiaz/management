<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Employees</title>
    <link type="text/css" href="/css/bootstrap.css" rel="stylesheet" />

</head>


<body>
<%@include file="../templates/structure.jsp" %>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Customers</h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    <div class="row">

        <table class="table table-striped">
            <tr>
                <th>Name</th>
                <th>Date</th>
                <th>Phone</th>
                <th>Contact</th>
                <th>Area</th>
                <th>Locked</th>
            </tr>
            <tbody>
            <c:forEach items="${customerList}" var="customer">
                <tr>

                    <td>${customer.name}</td>
                    <td>${customer.creationDate}</td>
                    <td>${customer.phone}</td>
                    <td><a href="/person/edit/${customer.contact.id}" class="btn btn-link">${customer.contact.name}</a> </td>
                    <td>${customer.area}</td>
                    <td>${customer.locked}</td>
                    <td><a href="/customer/edit/${customer.id}" class="btn btn-warning btn-xs">Edit</a> </td>

                </tr>
            </c:forEach>
            </tbody>

        </table>
        <a href="/customer/create" class="btn btn-success">Add Customer</a>

    </div>

</div>

</body>
</html>