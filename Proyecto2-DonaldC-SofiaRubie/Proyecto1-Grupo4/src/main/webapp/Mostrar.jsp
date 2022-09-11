<%--
  Created by IntelliJ IDEA.
  User: Donald
  Date: 15/11/2021
  Time: 04:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Agregar Usuarios</title>
    <base href="www.agregarUsuario.com">
    <link rel="shortcut icon" href="images/favicon.ico">
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!--FONTS-->
    <meta name="keywords" content="free website templates, free bootstrap themes, free template, free bootstrap, free website template">
    <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Satisfy|Bree+Serif|Candal|PT+Sans">
    <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <!--FONTS-->
    <link rel="stylesheet" href="css/styles.css" />
    <script src="https://kit.fontawesome.com/f1798a0d53.js" crossorigin="anonymous"></script>

    <script defer src="js/functions.js"></script>
</head>


<body>
<!--banner-->
<%@include file="header.jsp"%>
<!--banner-->

<!--Formulario-->

<section>
    <div class="container"  style="background-image: url(images/mision1.png); ">
        <div id="square2">
            <% String respuesta = request.getAttribute("respuesta").toString(); %>
            <h1><i class="fa fa-spinner" aria-hidden="true"></i> &nbsp;<%=respuesta%></h1>
        </div>
    </div>
</section>
<!--Formulario-->

<!-- / PIE DE PAGINA -->
<%@include file="footer.jsp" %>

<!-- / PIE DE PAGINA -->
</body>
</html>
