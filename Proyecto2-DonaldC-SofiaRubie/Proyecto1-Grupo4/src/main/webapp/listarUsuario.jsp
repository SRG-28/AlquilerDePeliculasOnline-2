<%--
  Created by IntelliJ IDEA.
  User: Donald
  Date: 28/11/2021
  Time: 06:55
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
<section >
    <div class="container"  style="background-image: url(images/admiFondo.png);" >
        <div id="squareA">
            <form name= "agregarUsuario" action="ListarUsuariosServlet" method="POST"   onsubmit="validarTodo()">
                <h1 i class="fa fa-check , form-groupA"> &nbsp; MOSTRAR UN USUARIO</h1>

                <div class="form-groupA"> Codigo <input type="text" class="codigo" id="codigo" required placeholder="<%=session.getAttribute("codigo") %>"/></div>
                <div class="form-groupA"> Nombre <input type="text" class="nombre" id="nombre" required placeholder="<%=session.getAttribute("nombre") %>"/></div>
                <div class="form-groupA"> Fecha de creacion <input type="text" class="fechaCreacion" id="fechaCreacion" required placeholder="<%=session.getAttribute("fechaCreacion") %>"/></div>
                <div class="form-groupA"> Rol <input type="text" class="rol" id="rol" required placeholder="<%=session.getAttribute("rol") %>"/></div>
                <div class="form-groupA"> Usuario <input type="text" class="usuario" id="usuario" required placeholder="<%=session.getAttribute("usuario") %>"/></div>
                <div class="form-groupA"> Contraseña <input type="text" class="password" id="password" required placeholder="<%=session.getAttribute("password") %>"/></div>
                <div class="form-groupA"> Ultimo logeo <input type="text" class="fechaLogeo" id="fechaLogeo" required placeholder="<%=session.getAttribute("fechaLogeo") %>"/></div>
            </form>
        </div>
    </div>
</section>
<!--Formulario-->


<!-- / PIE DE PAGINA -->
<%@include file="footer.jsp" %>

<!-- / PIE DE PAGINA -->
</body>
</html>
