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
@WebServlet(name = "CambiarContrasenaSv", urlPatterns = {"/CambiarContrasenaSv"})
public class CambiarContrasenaSv extends HttpServlet {

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

        String nombreUsuario, passwordAntigua, password, password2;

        nombreUsuario = request.getParameter("userName");
        passwordAntigua = request.getParameter("password");
        password = request.getParameter("newPassword");
        password2 = request.getParameter("newPasswordConfirm");


        // se instancia al constructor de producto.
        Login login = new Login();
        login.setUsuario(nombreUsuario);
        login.setPassword(password);

        // Se instancia al servicio de la capa logica de negocio
        LoginService loginServices = new LoginService();
        boolean ingreso;

        if(password.equals(password2) && !password.equals(passwordAntigua)){
            ingreso = loginServices.actualizarContrasena(login);
        }else{
            ingreso = false;
        }

        if(ingreso){
            request.setAttribute("respuesta", "Contraseña modificada con exito!!");
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

