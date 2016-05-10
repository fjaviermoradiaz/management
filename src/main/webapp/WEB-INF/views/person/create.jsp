<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<body>
<%@include file="../templates/structure.jsp" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<style>
    .image{
        width:120px;
        height:120px
    }
</style>
<script>
    $(document).on('ready', function() {
        $('#profile_image').change( function(e) {

            var img = URL.createObjectURL(e.target.files[0]);
            $('.image').attr('src', img);
        });
    });

    $(function(){
        $('#profile_image').trigger('change')( function(e) {

            var img = URL.createObjectURL(e.target.files[0]);
            $('.image').attr('src', img);
        });
    });

    function changePhoto(e) {
        console.log("Foto cambiada");
        var img = URL.createObjectURL($('#profile_image').valueOf()[0].value);
        $('.image').attr('src', img);
    }

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
            <!-- /.row -->
            <div>
                <img src="http://www.drodd.com/images12/facebook-profile-picture24.jpg" class="image">
            </div>

            <input onchange="changePhoto()" type="file" id="profile_image">
        </div>

    </div>
    </form:form>

</div>
</body>
</html>
