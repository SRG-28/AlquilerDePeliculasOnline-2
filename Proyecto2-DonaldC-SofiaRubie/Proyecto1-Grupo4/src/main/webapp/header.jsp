<section id="banner">
    <div class="bg-color">
        <header id="header">
            <div style="float:right;color:white;">
                <br>Bienvenido, <%=session.getAttribute("nombre")%>
                <a href="LogOutSv">Desconectar&nbsp;&nbsp;</a>
                <br/>
            </div>
            <img src="images/Logo3.png" id="logo" alt=""/>
            <button class="boton_personalizado" id ="boton_personalizado.oculto" href="" onclick="location.href='ingresar.jsp'"> INGRESAR </button>
            <button class="boton_personalizado" id ="boton_personalizado.oculto2" href="" onclick="location.href='registrarse.jsp'"> REGISTRARSE </button>
            <button class="boton_personalizado" href=""  onclick="location.href='carrito.jsp'"><i class="fa fa-shopping-cart" aria-hidden="true" style="font-size: 225%;"></i></button>
            <input  type="search" name="nombre" placeholder="Buscar">
        </header>

    </div>
    <div id="mySidenav"  class="sidenav col-md-15" >
        <ul>
            <li> <a href= "index.jsp" target="_self">INICIO </a> </li>
            <li> <a>ILLUSION WEB</a>
                <!--submenu-->
                <ul>
                    <li> <a href="historia.jsp">NUESTRA HISTORIA</a> </li>
                    <li> <a href="mision.jsp">NUESTRA MISION</a> </li>
                    <li> <a href="vision.jsp">NUESTRA VISION</a> </li>
                </ul>
            </li>
            <!--submenu-->

            <li> <a href="peliculas.jsp">CATALOGO</a> </li>
            <li> <a href="visitenos.jsp" target="_self">VISITENOS</a> </li>
            <li> <a href="contacto.jsp" target="_self">CONTACTENOS</a> </li>
            <li> <a href="administracion.jsp" target="_self">ADMINISTRACION</a> </li>
        </ul>
    </div>
</section>