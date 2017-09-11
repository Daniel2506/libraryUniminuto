/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
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
public class daos {

    coneccion con = new coneccion();
    Connection cn = con.conexion();
    PreparedStatement pst = null;
    Statement stmt;
    ResultSet rs = null;

    public void consultar() {
        String sql = "SELECT * FROM usuario";
        try {
            pst = (PreparedStatement) cn.prepareStatement(sql);
//            pst.setString(1, .getText());
//            pst.setString(2, .getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "  ");

            } else {
                JOptionPane.showMessageDialog(null, "");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public void insertar() {
        try {

            PreparedStatement pps = (PreparedStatement) cn.prepareStatement("INSERT INTO usuario(nombre,direccion,telefono,fecha_nacimiento,numero_tarjeta)VALUES(?,?,?,?,?)");
//            pps.setString(1, .getText());
//            pps.setString(2, .getText());
//            pps.setString(3, .getText());
//            pps.setString(4, .getText());
//            pps.setString(5, .getText());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados");

        } catch (SQLException ex) {
            //     Logger.getLogger(va la clase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void insertarUser(usuario user ){
        System.out.println("" + user.getNombre() + "','"+user.getDireccion()+"','"+user.getFecha_nacimiento()+"','"+user.getTelefono()+"','"+user.getNumero_tarjeta()+"");
        try { 
            // sintaxis ('cristhian fonseca', 'cr12a#34asur ', '1596423', '1994-08-23', 123698),
            stmt = cn.createStatement();
            stmt.executeUpdate("INSERT INTO usuario VALUES('" + user.getNombre() + "','"+user.getDireccion()+"','"+user.getTelefono()+"','"+user.getFecha_nacimiento()+"','"+user.getNumero_tarjeta()+"')");
            System.out.println("Los valores han sido agregados a la base de datos ");
        } catch (SQLException ex) {
            Logger.getLogger(daos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Eliminar() {
        String sql = "DELETE FROM usuario "
                + "WHERE telefono = 1234567";
    }

    public void actualizar() {
        String sql = "UPDATE USUARIO SET nombre='', "
                + "WHERE telefono = '1234567'";
    }
}
