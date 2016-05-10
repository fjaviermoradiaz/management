<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <body>
        <%@include file="../templates/structure.jsp" %>
        <div id="page-wrapper">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="page-header">Persons</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">

                <table class="table table-striped">
                    <tr>
                        <th>S.No</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Mobile</th>
                        <th>Action</th>
                    </tr>
                    <tbody>
                    <c:forEach items="${persons}" var="person" varStatus="itr">
                        <tr>
                            <td>${itr.index+1}</td>
                            <td>${person.name}</td>
                            <td>${person.email}</td>
                            <td>${person.mobile}</td>
                            <td><a href="/person/edit/${person.id}" class="btn btn-warning btn-xs">Edit</a> </td>
                        </tr>
                    </c:forEach>
                    </tbody>

                </table>
                <a href="/person/create" class="btn btn-success">Add Person</a>

            </div>

        </div>
    </body>
</html>