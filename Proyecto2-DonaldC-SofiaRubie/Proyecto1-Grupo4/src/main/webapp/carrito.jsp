<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Compra</title>
    <base href="www.compra.com">
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
    <div class="container"  style="background-image: url(images/fondo1.png);" >
        <div id="squareTarjeta">
            <form name= "comprar" action="." method="POST"   onsubmit="validarCompra()">
                <h1 i class="fa fa-cart-plus , form-groupA"> &nbsp; COMPLETAR LA COMPRA</h1>
                <div class="form-group"> Numero de tarjeta <input type="numberTa" class="Ntarjeta" id="Ntarjeta" required placeholder="Número de tarjeta"/></div>
                <!--Fabricante-->
                <div class="form-group">Fabricante de la tarjeta
                    <select name="fabricante" id="fabricante" size="3">
                        <option value="VISA" selected onclick="">
                            VISA
                        </option>
                        <option value="Mastercard" onclick="">
                            Mastercard
                        </option>
                        <option value="AMEX" onclick="">
                            AMEX
                        </option>
                    </select>
                </div>

                <div class="form-group">Fecha de vencimiento <input type="date" class="vencimiento" id="vencimiento" required/></div>
                <div class="form-group">Código de seguridad <input type="number" class="codigo" id="codigo" required placeholder="Código de seguridad"/></div>
                <div class="form-group">Dirección del envio del producto<input type="text" class="direccion" id="direccion" required placeholder="Escriba su dirección"/></div>
                <div class="form-group">Tarjeta de asociado <input type="text" class="tarjeta" id="tarjeta" name="tarjeta" placeholder="XX-XX-XX"/></div>
                <div class="form-group">Desea comprar o rentar
                    <label for="radioComprar">
                        <input type="radio" class="form-group control" id="radioComprar" name="radio" value="Comprar" required> Comprar
                    </label>
                    <label for="radioRentar">
                        <input type="radio" class="form-group control" id="radioRentar" name="radio" value="Rentar" required> Rentar
                    </label>
                </div>
                <div class="form-group">Cantidad <input type="number" class="cantidad" id="cantidad" name="cantidad" required/></div>
                <!--Boton-->
                <div>
                    <input class="boton" id="boton" type="submit" value="Enviar" />
                </div>

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