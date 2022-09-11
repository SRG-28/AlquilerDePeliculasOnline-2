<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Nueva Contraseña</title>
    <base href="www.nuevaContra.com">
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
        <div id="square4">
            <form name= "NuevaContra" action="CambiarContrasenaSv" method="POST"   onsubmit="validarTodo()">
                <h1 i class="fa fa-key , form-group">&nbsp;&nbsp; CAMBIO DE CONTRASEÑA</h1>
                <div class="form-group">Username <input type="text" class="user" name="userName" required placeholder="Escriba su usuario de login"/></div>
                <div class="form-group">Contraseña actual <input type="password" class="password" name="password" required placeholder="***********"/></div>
                <div class="form-group">Nueva contraseña <input type="password" class="newPassword" name="newPassword" required placeholder="***********"/></div>
                <div class="form-group">Repita la nueva contraseña <input type="password" class="newPassword" name="newPasswordConfirm" required placeholder="***********"/></div>

                <!--Boton-->
                <div>
                    <input class="boton" id="boton" type="submit" value="Enviar" onclick="return confirm('Está seguro de cambiar la contraseña?') "/>
                </div>

            </form>
        </div>
    </div>
</section>
<!--Registrar-->


<!-- / PIE DE PAGINA -->
<%@include file="footer.jsp" %>
<!-- / PIE DE PAGINA -->
<script>
    function videoSlider(links) {
        document.querySelector(".slider").src = links;
    }
</script>
</body>
</html>
