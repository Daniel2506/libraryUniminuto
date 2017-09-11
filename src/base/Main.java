/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.sql.SQLException;

/**
 *
 * @author daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
    libros l1 = new libros(5555,"estrellitas ninjas","cristhian","cristhian s.a",10,3,0,"no"); 
    conectar cn=new conectar();
    cn.insertar(l1);
    }
    
}
