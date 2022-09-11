package com.progra.ui.proyecto1;

import com.progra.ui.proyecto1.entities.Login;
import com.progra.ui.proyecto1.services.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ListarUsuariosServlet", value = "/ListarUsuariosServlet")
public class ListarUsuariosServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String error="";
        try{
            String usuario;
            usuario = request.getParameter("nombreUsuario");

            Login login = new Login();
            login.setUsuario(usuario);
            HttpSession session = request.getSession();

            // Se instancia al servicio de la capa logica de negocio
            LoginService loginServices = new LoginService();
            Login loginSesion = new Login();
            loginSesion=loginServices.consultar(login);

            session.setAttribute("codigo", loginSesion.getId());
            session.setAttribute("nombre", loginSesion.getNombre());
            session.setAttribute("fechaCreacion", loginSesion.getFechaCreacion());
            if(loginSesion.getRol().equals("admin")){
                session.setAttribute("rol", "Administrador");
            }else{
                session.setAttribute("rol", "Usuario");
            }
            session.setAttribute("usuario", loginSesion.getUsuario());
            session.setAttribute("password", loginSesion.getPassword());
            session.setAttribute("fechaLogeo", loginSesion.getFechaLogeo());

            request.getRequestDispatcher("listarUsuario.jsp").forward( request, response);

        }catch(Exception e){
            System.out.print(e.getMessage());
            request.setAttribute("respuesta", "Error");
            request.getRequestDispatcher("Mostrar.jsp").forward( request, response);
        }finally {
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
