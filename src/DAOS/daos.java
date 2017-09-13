/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Interfaces.Menu;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

    public ArrayList<usuario> consultar() {
        ArrayList<usuario> list = new ArrayList<usuario>();
        String sql = "SELECT * FROM usuario";
        try {
            pst = (PreparedStatement) cn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {    
                usuario user = new usuario();
                user.setNombre(rs.getString("nombre")); 
                user.setDireccion(rs.getString("direccion")); 
                user.setTelefono(rs.getString("telefono")); 
                user.setFecha_nacimiento(rs.getString("fecha_nacimiento")); 
                user.setNumero_tarjeta(rs.getInt("numero_tarjeta"));
                list.add(user);
            }
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
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
        
    public boolean insertarUser(usuario user ){
        //System.out.println("" + user.getNombre() + "','"+user.getDireccion()+"','"+user.getFecha_nacimiento()+"','"+user.getTelefono()+"','"+user.getNumero_tarjeta()+"");
        try { 
            stmt = cn.createStatement();
            stmt.executeUpdate("INSERT INTO usuario VALUES('" + user.getNombre() + "','"+user.getDireccion()+"','"+user.getTelefono()+"','"+user.getFecha_nacimiento()+"','"+user.getNumero_tarjeta()+"')");
            //System.out.println("Los valores han sido agregados a la base de datos ");
        } catch (SQLException ex) {
            Logger.getLogger(daos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
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
