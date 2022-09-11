<%--
  Created by IntelliJ IDEA.
  User: Donald
  Date: 29/11/2021
  Time: 05:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Catalogo TMDB</title>
    <base href="www.CatalogoTMDB.com">
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

<!--CATALOGO2-->
<div id="introduccion">
    <h5> CATÁLOGO</h5>
    <h5><a class="playIcon"><i class="fa fa-reply-all" aria-hidden="true" style="color:rgb(114, 7, 25)"></i></a>
        <a class="playIcon"><i class="fa fa-play-circle-o" aria-hidden="true" style="color:rgb(114, 7, 25)"></i></a>
        <a class="playIcon"><i class="fa fa-volume-up" aria-hidden="true" style="color:rgb(114, 7, 25)"></i></a>
        <a class="playIcon"><i class="fa fa-stop-circle-o" aria-hidden="true" style="color:rgb(114, 7, 25)"></i></a></h5>
</div>
<!--Botones-->

<div>
    <br>
    <button class="botonPeli" id="botonNuevo"  onclick= "getMovies(URL = 'https://api.themoviedb.org/3/movie/popular?api_key=1ca720de964a241da44209135bf3ccf7')">POPULAR</button>
    <button class="botonPeli2" id="botonMejor" onclick="getMovies(URL = 'https://api.themoviedb.org/3/movie/top_rated?api_key=1ca720de964a241da44209135bf3ccf7')">MEJORES</button>
    <button class="botonPeli" id="botonPopu" onclick="getMovies(URL = 'https://api.themoviedb.org/3/movie/upcoming?api_key=1ca720de964a241da44209135bf3ccf7')">NUEVOS</button>
</div>

<!--ESTRUCTURA PELICULA-->
<section >

    <div id="tags"></div>
    <div id="myNav"></div>
    <main id="main"></main>


</section>
<!--Formulario-->
<script src="js/functions.js"></script>

<!-- / PIE DE PAGINA -->
<%@include file="footer.jsp" %>

<!-- / PIE DE PAGINA -->
</body>
</html>
