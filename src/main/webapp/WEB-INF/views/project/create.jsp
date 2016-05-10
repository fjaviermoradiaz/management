<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<body>
<%@include file="../templates/structure.jsp" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div id="page-wrapper">
    <div class="row">
        <h1 class="page-header">Create</h1>
        <div class="col-md-6">

            <!-- /.row -->
            <div class="row">
                <form:form action="/project/save" method="post" modelAttribute="projectForm">
                    <div class="form-group col-sm-12">
                        <label for="nameInput">Name: </label>
                        <form:input path="name" id="nameInput" class="form-control"/>
                    </div>

                    <div class="form-group col-sm-4">
                        <label for="initialDatePicker">Initial Date: </label>
                        <div class='input-group date' >
                            <form:input type='text' class="form-control" id='initialDatePicker' path="initialDate" />
                            <span class="input-group-addon">
                                <span class="glyphicon glyphicon-calendar"/>
                            </span>
                            <script type="text/javascript">
                                $(function () {
                                    $('#initialDatePicker').datepicker();
                                });
                            </script>
                        </div>
                    </div>

                    <div class="form-group col-sm-4">
                        <label for="endDatePicker">End Date: </label>
                        <div class='input-group date' >
                            <form:input type='text' class="form-control" id='endDatePicker' path="endDate" />
                            <span class="input-group-addon">
                                <span class="glyphicon glyphicon-calendar"/>
                            </span>
                            <script type="text/javascript">
                                $(function () {
                                    $('#endDatePicker').datepicker();
                                });
                            </script>
                        </div>
                    </div>

                    <div class="form-group col-sm-4">
                        <label for="budgetInput">Budget: </label>
                        <div class="input-group">
                            <form:input path="budget" type="text" id="budgetInput"  class="form-control" placeholder="Amount"/>
                            <div class="input-group-addon">€</div>
                        </div>
                    </div>

                    <!-- TODO: listado de proyectos-->
                    <%--<div class="form-group" >--%>
                        <%--<label for="personSelect">Candidate: </label>--%>
                        <%--<div class="input-group">--%>

                            <%--<form:select class="form-control" id="personSelect" path="person">--%>
                                <%--<form:option value="">-</form:option>--%>
                                <%--<c:forEach items="${candidateList}" var="candidate" varStatus="itr">--%>
                                    <%--<form:option value="${candidate.id}">${candidate.name}</form:option>--%>
                                <%--</c:forEach>--%>
                            <%--</form:select>--%>
                            <%--<span class="input-group-btn">--%>
                                <%--<button class="btn btn-secondary" type="button" data-toggle="modal" data-target="#createPerson">New</button>--%>
                            <%--</span>--%>
                        <%--</div>--%>

                    <%--</div>--%>

                    <!-- TODO: listado de customers -->
                    <%--<div class="form-group" >--%>
                    <%--<label for="personSelect">Candidate: </label>--%>
                    <%--<div class="input-group">--%>

                    <%--<form:select class="form-control" id="personSelect" path="person">--%>
                    <%--<form:option value="">-</form:option>--%>
                    <%--<c:forEach items="${candidateList}" var="candidate" varStatus="itr">--%>
                    <%--<form:option value="${candidate.id}">${candidate.name}</form:option>--%>
                    <%--</c:forEach>--%>
                    <%--</form:select>--%>
                    <%--<span class="input-group-btn">--%>
                    <%--<button class="btn btn-secondary" type="button" data-toggle="modal" data-target="#createPerson">New</button>--%>
                    <%--</span>--%>
                    <%--</div>--%>

                    <div class="form-group col-sm-12" >
                        <label for="employeeSelect">Responsible: </label>
                        <div class="input-group">
                            <form:select class="form-control" id="employeeSelect" path="responsible">
                                <form:option value="">-</form:option>
                                <c:forEach items="${employeeList}" var="employee" varStatus="itr">
                                    <form:option value="${employee.id}">${employee.person.name}</form:option>
                                </c:forEach>
                            </form:select>
                            <span class="input-group-btn">
                                <button class="btn btn-secondary" type="button" data-toggle="modal" data-target="#createEmployee">New</button>
                            </span>
                        </div>

                    </div>

                    <div class="form-group col-sm-12">
                        <label for="descriptionInput">Description: </label>
                        <form:textarea path="description" id="descriptionInput" class="form-control"/>
                    </div>


                    <button type="submit" class="btn btn-default">Save</button>
                    <a href="/project/index" class="btn btn-default">Back</a>
                </form:form>
            </div>
        </div>
        <!-- /.col-lg-12 -->
    </div>


</div>
</body>
</html>
