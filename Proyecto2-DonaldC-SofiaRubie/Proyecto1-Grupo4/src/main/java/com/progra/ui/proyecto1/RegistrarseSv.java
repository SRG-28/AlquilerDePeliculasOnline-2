package com.progra.ui.proyecto1;

import com.progra.ui.proyecto1.entities.Login;
import com.progra.ui.proyecto1.services.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RegistrarseSv")
public class RegistrarseSv extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarseSv() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String nombre, contra1, contra2, usuario, rol;
        nombre = request.getParameter("nombre");
        usuario = request.getParameter("username");
        contra1 = request.getParameter("password");
        contra2 = request.getParameter("confirmarPassword");
        rol="user";

        // se instancia al constructor de Login.
        Login login = new Login();
        login.setUsuario(usuario);
        login.setNombre(nombre);
        login.setPassword(contra1);
        login.setRol(rol);


        LoginService loginServices = new LoginService();
        boolean ingreso;

        if(contra1.equals(contra2)){
            ingreso = loginServices.insertarUsuario(login);
        }else{
            ingreso = false;
        }

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
