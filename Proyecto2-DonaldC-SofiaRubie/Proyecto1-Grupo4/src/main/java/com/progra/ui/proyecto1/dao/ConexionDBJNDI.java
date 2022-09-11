package com.progra.ui.proyecto1.dao;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexionDBJNDI {
	
    private DataSource dataSource;
 
    public ConexionDBJNDI() {
        try {
            InitialContext context = new InitialContext();
            dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mysql"); 
        } catch (NamingException ex) {
            Logger.getLogger(ConexionDBJNDI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public Connection getConnection() {
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(ConexionDBJNDI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
