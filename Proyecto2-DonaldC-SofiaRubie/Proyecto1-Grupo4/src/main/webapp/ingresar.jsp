<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Ingresar</title>
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

<!--Ingresar-->
<section >
    <div class="container"  style="background-image: url(images/login.png);" >
        <div id="square4">
            <form name= "Ingresar" action="LoginSv" method="POST" onsubmit="validarTodo();">
                <h1 i class="fa fa-key , form-group">&nbsp;&nbsp; LOGIN</h1>
                <div class="form-group">Username <input type="text" name="login" class="user" id="user" required placeholder="Escriba su usuario de login"/></div>
                <div class="form-group">Password <input type="password" name="password" class="password" id="password" required placeholder="***********"/></div><br>
                <!--Boton-->
                <div>
                    <input class="boton" id="boton" type="submit" value="Enviar" />
                </div>
                <br><a class="newContra" href="newPassword.jsp">Cambio de contraseña</a>
            </form>
        </div>
    </div>

</section>
<!--Ingresar-->

<!-- / PIE DE PAGINA -->
<%@include file="footer.jsp" %>
<!-- / PIE DE PAGINA -->


</body>
</html>
