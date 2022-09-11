package com.progra.ui.proyecto1.services;

import com.progra.ui.proyecto1.dao.LoginDAO;
import com.progra.ui.proyecto1.entities.Login;


public class LoginService implements ServiceManagerLogin {

	    private final LoginDAO loginDAO;
            
            public LoginService(){
                loginDAO = new LoginDAO();
            }
	 

	    public boolean validarAcceso(Login login){
	    	if(!loginDAO.validarAcceso(login)){
                    return false;
                }else{
                    return true;
                }
	    }
	    
	    public Login obtenerSesion(Login login){
	    	return loginDAO.obtenerSesion(login);
	    }

    public boolean insertarUsuario(Login login) {
        return loginDAO.insertarUsuario(login);
    }

    public boolean eliminar(Login login) {
        return loginDAO.eliminar(login);
    }
    public Login consultar(Login login){return loginDAO.listarUsuarios(login); }

    public boolean actualizar(Login login) {
        return loginDAO.actualizar(login);
    }
    public boolean actualizarContrasena(Login login) {
        return loginDAO.actualizarContrasena(login);
    }
}

