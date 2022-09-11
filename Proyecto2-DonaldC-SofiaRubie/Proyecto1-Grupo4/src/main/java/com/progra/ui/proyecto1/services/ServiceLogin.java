package com.progra.ui.proyecto1.services;

import com.progra.ui.proyecto1.entities.Login;

interface ServiceLogin {
    boolean validarAcceso(Login login);
    Login obtenerSesion(Login login);
    boolean insertarUsuario(Login Login);
    boolean eliminar(Login Login);
    Login consultar(Login login);
    boolean actualizar(Login login);
    boolean actualizarContrasena(Login login);
}