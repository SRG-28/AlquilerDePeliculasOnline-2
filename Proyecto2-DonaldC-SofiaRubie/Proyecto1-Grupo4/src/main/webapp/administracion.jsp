<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Administración</title>
    <base href="www.ADMINISTRACION.com">
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

<!--MENU DE PANTALLA-->
<section class="containerMenu2">
    <div id="col-1">
        <div class = "admiMenu">
            <img src="images/peli.png" alt="MANTENIMIENTO PELICULAS">
            <li> <a target="_self" style="text-decoration: none; color: gray;">MANTENIMIENTO DE PELICULAS</a>
                <div class = "subMenu">
                    <ul>
                        <li> <a href="insertarPelicula.jsp" style="color:rgb(114, 7, 25);">INSERTAR</a> </li>
                        <li> <a href="modificarPelicula.jsp" style="color:rgb(114, 7, 25);">ACTUALIZAR</a> </li>
                        <li> <a href="consultarPelicula.jsp" style=" color:rgb(114, 7, 25);">CONSULTAR</a> </li>
                        <li> <a href="eliminarPelicula.jsp" style="color:rgb(114, 7, 25);">ELIMINAR</a> </li>
                    </ul>
                </div>
            </li>
        </div>
    </div>

    <div id="col-2">
        <div class = "admiMenu">
            <img src="images/user2.png" alt="MANTENIMIENTO USUARIO">
            <li> <a target="_self" style="text-decoration: none; color: gray;">MANTENIMIENTO DE USUARIOS</a>
                <div class = "subMenu">
                    <ul>
                        <li> <a href="agregarUsuario.jsp" style="color: rgb(14, 13, 13);">AGREGAR</a> </li>
                        <li> <a href="listarUser.jsp" style="color:rgb(14, 13, 13);">LISTAR</a> </li>
                        <li> <a href="modificarUser.jsp" style="color:rgb(14, 13, 13);">MODIFICAR</a> </li>
                        <li> <a href="eliminarUsuario.jsp" style="color: rgb(14, 13, 13);">ELIMINAR</a> </li>
                    </ul>
                </div>
            </li>
        </div>
    </div>
</section>

<!--MENU DE PANTLLA--->


<!-- / PIE DE PAGINA -->
<%@include file="footer.jsp" %>
<!-- / PIE DE PAGINA -->
</body>
</html>