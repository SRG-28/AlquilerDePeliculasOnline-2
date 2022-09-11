package com.progra.ui.proyecto1.services;

import com.progra.ui.proyecto1.entities.Login;


public interface ServiceManagerLogin extends ServiceLogin {
	 	public boolean validarAcceso(Login Login);
	 	public Login obtenerSesion(Login Login);
		public boolean insertarUsuario(Login Login);
		public boolean eliminar(Login Login);
		public Login consultar(Login login);
		public boolean actualizar(Login login);
		public boolean actualizarContrasena(Login login);
}