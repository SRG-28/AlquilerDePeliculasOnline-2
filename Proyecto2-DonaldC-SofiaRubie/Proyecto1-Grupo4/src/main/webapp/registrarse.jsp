<%@ page contentType="text/html;charset=UTF-8"  %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Registrarse</title>
    <base href="www.IllusionWeb.com">
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

<!--Registrarse-->
<section >
    <div class="container"  style="background-image: url(images/login.png);" >
        <div id="square3">
            <form name= "Registrarse" action="RegistrarseSv" method="POST"   onsubmit="validarTodo()">
                <h1 i class="fa fa-users , form-group">&nbsp;&nbsp; REGISTRARSE</h1>
                <div class="form-group">Nombre <input type="text" name="nombre" class="nombre" id="nombre" required placeholder="Escriba su nombre"/></div>
                <div class="form-group">Username <input type="text" name="username" class="user" id="user" required placeholder="Escriba su usuario de login"/></div>
                <div class="form-group">Password <input type="password" name="password" class="password" id="password" required placeholder="***********"/></div>
                <div class="form-group">Confirmar Password <input type="password" name="confirmarPassword" class="password" id="confirmarPassword" required placeholder="***********"/></div><br>
                <!--Boton-->
                <div>
                    <input class="boton" id="boton" type="submit" value="Enviar" />
                </div>
            </form>
        </div>
    </div>
</section>
<!--Registrar-->

<!-- / PIE DE PAGINA -->
<%@include file="footer.jsp" %>
<!-- / PIE DE PAGINA -->

</body>
</html>
