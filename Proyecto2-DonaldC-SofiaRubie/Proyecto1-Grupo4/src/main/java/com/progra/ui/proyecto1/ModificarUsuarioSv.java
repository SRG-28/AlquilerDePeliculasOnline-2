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
 *
 * @author Dario
 */
@WebServlet(name = "ModificarUsuarioSv", urlPatterns = {"/ModificarUsuarioSv"})
public class ModificarUsuarioSv extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre, nombreUsuario, rol,rolValue;

        nombre = request.getParameter("nombre");
        nombreUsuario = request.getParameter("nombreUsuario");
        rol = request.getParameter("rol");

        if(rol.contains("usuario")){
            rolValue="user";
        }else
            rolValue="admin";

        // se instancia al constructor de producto.
        Login login = new Login();
        login.setUsuario(nombreUsuario);
        login.setNombre(nombre);
        login.setRol(rolValue);

        // Se instancia al servicio de la capa logica de negocio
        LoginService productoServices = new LoginService();
        boolean ingreso = productoServices.actualizar(login);

        if(ingreso){
            request.setAttribute("respuesta", "Modificado con exito!!");
            request.getRequestDispatcher("Mostrar.jsp").forward( request, response);
        }else{
            request.setAttribute("respuesta", "Error");
            request.getRequestDispatcher("Mostrar.jsp").forward( request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
