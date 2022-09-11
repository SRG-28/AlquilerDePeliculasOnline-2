package com.progra.ui.proyecto1.dao;


import com.progra.ui.proyecto1.entities.Login;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Clase que aplica la logica de acceso de datos
 */
public class LoginDAO {
    /*Utilizamos la conexion por medio de un driver*/
    private final Connection connection;


    public LoginDAO(){
        connection = new com.progra.ui.proyecto1.dao.ConexionDBJNDI().getConnection();
    }

    /*Realiza una conexion a la base de
     * datos. Verifica si el usuario esta en la tabla
     * y devuelve verdadero o falso.
     */
    public boolean validarAcceso(Login login) {
        boolean resultadoConsulta= false;
        try {
            CallableStatement statement = connection.prepareCall("{call validarLogin (?,?)}");
            statement.setString("login_p", login.getUsuario());
            statement.setString("password_p", login.getPassword());
            ResultSet resultado = statement.executeQuery();
            if(resultado.next()){
                resultadoConsulta = resultado.getBoolean(1);
            }
            return resultadoConsulta;
        } catch (Exception ex) {
            ex.printStackTrace();
            return resultadoConsulta;
        }
    }

    /**
     * Aplica la logica de obtener un objeto de sesion
     * basado en los datos obtenidos de la consulta del
     * procedimiento almacenado en bases de datos.
     * @param login
     * @return
     */
    public Login obtenerSesion(Login login) {
        Login loginCorrecto = null;
        try {
            CallableStatement statement = connection.prepareCall("{call obtenerSesion (?,?)}");
            statement.setString("usuario_p", login.getUsuario());
            statement.setString("password_p", login.getPassword());
            ResultSet resultado = statement.executeQuery();
            if(resultado.next()){
                loginCorrecto = new Login();
                loginCorrecto.setUsuario(resultado.getString("usuario"));
                loginCorrecto.setPassword(resultado.getString("password"));
                loginCorrecto.setRol(resultado.getString("rol"));
                loginCorrecto.setNombre(resultado.getString("nombre"));
            }
            return loginCorrecto;
        } catch (Exception ex) {
            ex.printStackTrace();
            return loginCorrecto;
        }
    }

    public boolean insertarUsuario(Login login){
        try {
            CallableStatement statement = connection.prepareCall("{call insertarUsuario (?,?,?,?)}");
            statement.setString("usuario_p", login.getUsuario());
            statement.setString("password_p", login.getPassword());
            statement.setString("rol_p", login.getRol());
            statement.setString("nombre_p", login.getNombre());
            statement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean eliminar(Login login) {
        try {
            CallableStatement statement = connection.prepareCall("{call eliminaUsuario (?)}");
            statement.setString("usuario_p", login.getUsuario());
            statement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public Login listarUsuarios(Login login) {
        Login loginCorrecto = null;
        try {
            CallableStatement statement = connection.prepareCall("{call listaUsuarios (?)}");
            statement.setString("usuario_p", login.getUsuario());
            ResultSet resultado = statement.executeQuery();
            if (resultado.next()) {
                loginCorrecto = new Login();
                loginCorrecto.setId(resultado.getInt("codigo"));
                loginCorrecto.setNombre(resultado.getString("nombre"));
                loginCorrecto.setFechaCreacion(resultado.getDate("fechaCreacion"));
                loginCorrecto.setRol(resultado.getString("rol"));
                loginCorrecto.setUsuario(resultado.getString("usuario"));
                loginCorrecto.setPassword(resultado.getString("password"));
                loginCorrecto.setFechaLogeo(resultado.getDate("fechaLogeo"));

            }
            return loginCorrecto;
        } catch (Exception ex) {
            ex.printStackTrace();
            return loginCorrecto;
        }
    }

    public boolean actualizar(Login login) {
        try {
            CallableStatement statement = connection.prepareCall("{call modificaUsuario (?,?,?)}");
            statement.setString("usuario_p", login.getUsuario());
            statement.setString("rol_p", login.getRol());
            statement.setString("nombre_p", login.getNombre());
            statement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean actualizarContrasena(Login login) {
        try {
            CallableStatement statement = connection.prepareCall("{call modificaContrasena (?,?)}");
            statement.setString("usuario_p", login.getUsuario());
            statement.setString("password_p", login.getPassword());
            statement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
