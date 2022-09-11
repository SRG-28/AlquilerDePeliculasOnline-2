package com.progra.ui.proyecto1;

import com.progra.ui.proyecto1.entities.Login;
import com.progra.ui.proyecto1.services.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class AgregarProducto
 */
@WebServlet("/agregarUsuarioSv")
public class agregarUsuarioSv extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public agregarUsuarioSv() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String nombre, contra, rol, rolValue, usuario;
        nombre = request.getParameter("nombre");
        rol = request.getParameter("rol");
        usuario = request.getParameter("username");
        contra = request.getParameter("password");

        if(rol.contains("usuario")){
            rolValue="user";
        }else
            rolValue="admin";

        // se instancia al constructor de Login.
        Login login = new Login();
        login.setUsuario(usuario);
        login.setNombre(nombre);
        login.setPassword(contra);
        login.setRol(rolValue);

        // Se instancia al servicio de la capa logica de negocio
        LoginService loginServices = new LoginService();
        boolean ingreso = loginServices.insertarUsuario(login);

        if(ingreso){
            request.setAttribute("respuesta", "Ingresado con exito!!");
            request.getRequestDispatcher("Mostrar.jsp").forward( request, response);




        }else{
            request.setAttribute("respuesta", "Error");
            request.getRequestDispatcher("Mostrar.jsp").forward( request, response);
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        this.doGet(request, response);
    }

}
