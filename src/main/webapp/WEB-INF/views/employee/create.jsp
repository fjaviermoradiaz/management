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
                <form:form action="/employee/save" method="post" modelAttribute="employeeForm">
                    <div class="form-group" >
                        <label for="personSelect">Candidate: </label>
                        <div class="input-group">

                            <form:select class="form-control" id="personSelect" path="person">
                                <form:option value="">-</form:option>
                                <c:forEach items="${candidateList}" var="candidate" varStatus="itr">
                                    <form:option value="${candidate.id}">${candidate.name}</form:option>
                                </c:forEach>
                            </form:select>
                            <span class="input-group-btn">
                                <button class="btn btn-secondary" type="button" data-toggle="modal" data-target="#createPerson">New</button>
                            </span>
                        </div>

                    </div>

                    <div class="form-group">
                        <label for="joiningDatePicker">Joining Date: </label>
                        <div class='input-group date' >
                            <form:input type='text' class="form-control" id='joiningDatePicker' path="joiningDate" />
                            <span class="input-group-addon">
                                <span class="glyphicon glyphicon-calendar"/>
                            </span>
                            <script type="text/javascript">
                                $(function () {
                                    $('#joiningDatePicker').datepicker();
                                });
                            </script>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="salaryInput">Salary: </label>
                        <div class="input-group">
                            <form:input path="salary" type="text" id="salaryInput"  class="form-control" placeholder="Amount"/>
                            <div class="input-group-addon">€</div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="rolInput">Rol: </label>
                        <form:input path="rol" id="rolInput" class="form-control"/>
                    </div>

                    <!--<input type="submit" value="Submit" />-->
                    <button type="submit" class="btn btn-default">Save</button>
                    <!--<button type="reset" class="btn btn-default">Back</button>-->
                    <a href="/person/index" class="btn btn-default">Back</a>
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
