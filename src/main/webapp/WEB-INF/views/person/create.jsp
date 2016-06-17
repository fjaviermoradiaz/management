<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<body>
<%@include file="../templates/structure.jsp" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<style>
    .upload-button {
        padding: 4px;
        border: 1px solid black;
        border-radius: 5px;
        display: block;
        float: left;
    }
</style>
<script>
    $(document).ready(function() {


        var readURL = function(input) {
            if (input.files && input.files[0]) {
                var reader = new FileReader();

                reader.onload = function (e) {
                    $('.profile-pic').attr('src', e.target.result);
                }

                reader.readAsDataURL(input.files[0]);
            }
        }


        $(".file-upload").on('change', function(){
            readURL(this);
        });

        $(".upload-button").on('click', function() {
            $(".file-upload").click();
        });
    });
</script>

<div id="page-wrapper">
    <!-- Inicio Pruebas con angular -->
    <%--<h1>Hola {{nombre}}</h1>--%>
    <%--<div class="contenedor">--%>
        <%--<form action="">--%>
            <%--¿Cómo te llamas? <input type="text" ng-model="nombre">--%>
        <%--</form>--%>
    <%--</div>--%>

    <%--<div ng-app ng-init="pensamientos = [];">--%>
        <%--<h1>Altavoz AngularJS</h1>--%>
        <%--<p>--%>
            <%--¿Qué hay de nuevo?--%>
            <%--<br />--%>
            <%--<input type="text" ng-model="nuevoPensamiento" />--%>
            <%--<input type="button" value="Agregar" ng-click="pensamientos.push(nuevoPensamiento); nuevoPensamiento = '';" />--%>
        <%--</p>--%>
        <%--<h2>Pensamientos que has tenido</h2>--%>
        <%--<p ng-repeat="pensamiento in pensamientos" ng-init="paso = $index">--%>
            <%--Pensaste esto: {{pensamiento}} (Iteración con índice {{paso}})--%>
        <%--</p>--%>
    <%--</div>--%>

    <%--<input type="text" ng-model="campotexto">--%>
    <%--<br />--%>
    <%--{{ campotexto }} - {{ camposelect }}--%>
    <%--<br />--%>
    <%--<select ng-model="camposelect">--%>
        <%--<option value="uno">1</option>--%>
        <%--<option value="dos">2</option>--%>
    <%--</select>--%>
    <%--<input type="button" ng-click="campotexto='DesarrolloWeb.com'" value="Pulsa aquí">--%>
    <!-- Fin pruebas con angular -->
    <div class="row">


        <h1 class="page-header">Create</h1>
        <form:form action="/person/save" method="post" modelAttribute="personForm">
        <div class="col-md-6">
            <!-- /.row -->
            <div class="row" id="createPerson">


                    <div class="form-group">
                        <label for="nameInput">Name: </label>
                        <form:input path="name" id="nameInput" class="form-control"/>
                    </div>
                    <div class="form-group">
                        <label for="emailInput">Email: </label>
                        <form:input path="email" id="emailInput" class="form-control"/>
                    </div>
                    <div class="form-group">
                        <label for="mobileInput">Mobile: </label>
                        <form:input path="mobile" id="mobileInput" class="form-control"/>
                    </div>

                    <!--<input type="submit" value="Submit" />-->
                    <button type="submit" class="btn btn-default">Save</button>
                    <!--<button type="reset" class="btn btn-default">Back</button>-->
                    <a href="/person/index" class="btn btn-default">Back</a>

            </div>
        </div>
        <!-- /.col-lg-12 -->
        <div class="col-md-1">
        </div>
        <div class="col-md-4">
            <img class="profile-pic" src="http://cdn.cutestpaw.com/wp-content/uploads/2012/07/l-Wittle-puppy-yawning.jpg" />
            <div class="upload-button">Upload Image</div>
            <input class="file-upload" type="file" accept="image/*"/>
        </div>

    </div>
    </form:form>

</div>
</body>
</html>
