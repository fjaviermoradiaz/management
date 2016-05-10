<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<body>
<%@include file="../templates/structure.jsp" %>
<div id="page-wrapper">
    <div class="row">
        <div class="col-md-12">
            <h1 class="page-header">Projects</h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    <div class="row">

        <table class="table table-striped">
            <tr>
                <th>Name</th>
                <th>Initial date</th>
                <th>End date</th>
                <th>budget</th>
                <th>Parent project</th>
                <th>Customer</th>
                <th>Responsible</th>
            </tr>
            <tbody>
            <c:forEach items="${projects}" var="project" varStatus="itr">
                <tr>
                    <td>${project.name}</td>
                    <td>${project.initialDate}</td>
                    <td>${project.endDate}</td>
                    <td>${project.budget}</td>
                    <td>${project.parentProject}</td>
                    <td>${project.customer}</td>
                    <td>${project.responsible}</td>
                    <td><a href="/project/edit/${person.id}" class="btn btn-warning btn-xs">Edit</a> </td>
                </tr>
            </c:forEach>
            </tbody>

        </table>
        <a href="/project/create" class="btn btn-success">Add Project</a>

    </div>

</div>
</body>
</html>