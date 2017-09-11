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
            JOptionPane.showMessageDialog(null, "conectado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);

        }
        return cn;
    }
        
    public void insertar(usuario user ){
        System.out.println("" + user.getNombre() + "','"+user.getDireccion()+"','"+user.getFecha_nacimiento()+"','"+user.getTelefono()+"','"+user.getNumero_tarjeta()+"");
        try { 
            // sintaxis ('cristhian fonseca', 'cr12a#34asur ', '1596423', '1994-08-23', 123698),
            stmt = cn.createStatement();
            stmt.executeUpdate("INSERT INTO usuario VALUES('" + user.getNombre() + "','"+user.getDireccion()+"','"+user.getTelefono()+"','"+user.getFecha_nacimiento()+"','"+user.getNumero_tarjeta()+"')");
            System.out.println("Los valores han sido agregados a la base de datos ");
        } catch (SQLException ex) {
            Logger.getLogger(coneccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
