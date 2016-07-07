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
                <form:form action="/category/save" role="form" method="post" modelAttribute="categoryForm">

                    <div class="form-group col-sm-12">
                        <label for="nameInput">Name: </label>
                        <form:input path="name" id="nameInput" class="form-control"/>
                    </div>

                    <div class="form-group col-sm-12">
                        <label for="descriptionInput">Description: </label>
                        <form:input path="description" id="descriptionInput" class="form-control"/>
                    </div>

                    <div class="form-group col-sm-3 material-switch">
                        <%--<label for="lockedInput">Locked: </label>--%>
                        <%--<form:checkbox path="locked" id="lockedInput" class="label-default form-control"/>--%>
                        <div class="material-switch">
                            Locked:
                            <input path="active" id="someSwitchOptionDefault" name="someSwitchOption001" type="checkbox"/>
                            <label for="someSwitchOptionDefault" class="label-danger"></label>
                        </div>
                    </div>

                    <div class="form-group col-sm-12">
                        <button type="submit" class="btn btn-default">Save</button>
                        <a href="/category/index" class="btn btn-default">Back</a>
                    </div>

                </form:form>




            </div>
        </div>
        <!-- /.col-lg-12 -->
    </div>

</div>
</body>
</html>
