package com.progra.ui.proyecto1;

import com.progra.ui.proyecto1.entities.Login;
import com.progra.ui.proyecto1.services.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/EliminarUsuarioSv"})
public class EliminarUsuarioSv extends HttpServlet {

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
        try{
            ArrayList<Login> productos;

            String usuario;
            usuario = request.getParameter("nombreUsuario");

            Login login = new Login();
            login.setUsuario(usuario);


            // Se instancia al servicio de la capa logica de negocio
            LoginService productoServices = new LoginService();
            boolean eliminado = productoServices.eliminar(login);

            if(eliminado){
                request.setAttribute("respuesta", "Eliminado con exito!!");
                request.getRequestDispatcher("Mostrar.jsp").forward( request, response);
            }else{
                request.setAttribute("respuesta", "Error");
                request.getRequestDispatcher("Mostrar.jsp").forward( request, response);
            }



        }catch(Exception e){
            request.getRequestDispatcher("error.jsp")
                    .forward( request, response);
            System.out.print(e.getMessage());
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
