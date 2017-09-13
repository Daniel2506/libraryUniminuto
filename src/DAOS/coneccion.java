/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.usuario;

/**
 *
 * @author User_
 */
public class coneccion {

    Connection cn;
    private static Statement stmt;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");
            //JOptionPane.showMessageDialog(null, "conectado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);

        }
        return cn;
    }
        
}
