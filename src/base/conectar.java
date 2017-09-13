/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.usuario;

/**
 *
 * @author User_
 */
public class conectar {

    private PreparedStatement psinsert;
    private ResultSet rs;
    private Statement stmm;
    private Connection con;

    public void insertar(libros l) throws SQLException {
        String url = "jdbc:mysql://localhost/biblioteca?user=root";
        con = DriverManager.getConnection(url);
        stmm = con.createStatement();

        psinsert = con.prepareStatement("INSERT INTO libros (id_libros,titulo,autor,editorial,cantidad,tiempo_limite,estado,referencia)" + "values(?,?,?,?,?,?,?,?)");
        psinsert.setInt(1, l.getId_libros());
        psinsert.setString(2, l.getTitulo());
        psinsert.setString(3, l.getAutor());
        psinsert.setString(4, l.getEditorial());
        psinsert.setInt(5, l.getCantidad());
        psinsert.setInt(6, l.getTiempo_limite());
        psinsert.setInt(7, l.getEstado());
        psinsert.setString(8, l.getReferencia());
        
        psinsert.executeUpdate();
    }
    
    public ArrayList<libros> consultar () {
        ArrayList<libros> list = new ArrayList();
        
        try {
            String url = "jdbc:mysql://localhost/biblioteca?user=root";
            String sql = "SELECT * FROM libros";
            con = DriverManager.getConnection(url);
            stmm = con.createStatement();
            psinsert = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            rs = psinsert.executeQuery();
            while (rs.next()) {    
                libros book = new libros();
                book.setId_libros(rs.getInt("id_libros")); 
                book.setTitulo(rs.getString("titulo")); 
                book.setAutor(rs.getString("autor")); 
                book.setCantidad(rs.getInt("cantidad")); 
                book.setTiempo_limite(rs.getInt("tiempo_limite"));
                list.add(book);
            }
            return list;
        } catch (Exception e) {
            return null;
        }
    }
}
