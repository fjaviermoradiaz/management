<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<body>
<%@include file="../templates/structure.jsp" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div id="page-wrapper">
    <div class="row">
        <h1 class="page-header">Create</h1>
        <div class="col-sm-6">

            <!-- /.row -->
            <div class="row">
                <form:form action="/customer/save" role="form" method="post" modelAttribute="customerForm">

                    <div class="form-group col-sm-12">
                        <label for="nameInput">Name: </label>
                        <form:input path="name" id="nameInput" class="form-control"/>
                    </div>

                    <div class="form-group col-sm-12">
                        <label for="areaInput">Area: </label>
                        <form:input path="area" id="areaInput" class="form-control"/>
                    </div>

                    <div class="form-group col-sm-4">
                        <%--<label>First name</label><input type="text" class="form-control" placeholder="First">--%>
                        <label for="creationDatePicker">Creation Date: </label>
                        <div class='input-group date' >
                            <form:input type='text' class="form-control" id='creationDatePicker' path="creationDate" />
                            <span class="input-group-addon">
                                <span class="glyphicon glyphicon-calendar"/>
                            </span>
                            <script type="text/javascript">
                                $(function () {
                                    $('#creationDatePicker').datepicker();
                                });
                            </script>
                        </div>
                    </div>
                    <div class="form-group col-sm-8">
                        <%--<label>Last name</label><input type="text" class="form-control" placeholder="Last">--%>
                        <label for="personSelect">Contact: </label>
                        <div class="input-group">
                            <form:select class="form-control" id="personSelect" path="contact">
                                <form:option value="">-</form:option>
                                <c:forEach items="${personList}" var="person" varStatus="itr">
                                    <form:option value="${person.id}">${person.name}</form:option>
                                </c:forEach>
                            </form:select>
                            <span class="input-group-btn">
                                <button class="btn btn-secondary" type="button" data-toggle="modal" data-target="#createPerson">New</button>
                            </span>
                        </div>
                    </div>

                    <div class="form-group col-sm-4">
                        <label for="phoneInput">Phone: </label>
                        <form:input path="phone" id="phoneInput" class="form-control"/>
                    </div>

                    <%--<div class="form-group col-sm-12">--%>
                        <%--<label for="phoneInput">Phone: </label>--%>
                        <%--<form:input path="phone" id="phoneInput" class="form-control"/>--%>
                    <%--</div>--%>

                    <div class="form-group col-sm-12">
                        <label for="addressInput">Address: </label>
                        <form:textarea path="address" id="addressInput" class="form-control"/>
                    </div>



                    <div class="form-group col-sm-12">
                        <label for="descriptionInput">Description: </label>
                        <form:textarea path="description" id="descriptionInput" class="form-control"/>
                    </div>

                    <div class="form-group col-sm-3 material-switch">
                        <%--<label for="lockedInput">Locked: </label>--%>
                        <%--<form:checkbox path="locked" id="lockedInput" class="label-default form-control"/>--%>
                        <div class="material-switch">
                            Locked:
                            <input path="locked" id="someSwitchOptionDefault" name="someSwitchOption001" type="checkbox"/>
                            <label for="someSwitchOptionDefault" class="label-danger"></label>
                        </div>
                    </div>

                    <div class="form-group col-sm-12">
                        <button type="submit" class="btn btn-default">Save</button>
                        <a href="/customer/index" class="btn btn-default">Back</a>
                    </div>

                </form:form>




            </div>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <div id="createPerson" class="modal fade" role="dialog">
        <div class="modal-dialog">

            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Create new person</h4>
                </div>
                <div class="modal-body">

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                </div>
            </div>

        </div>
    </div>


</div>
</body>
</html>
