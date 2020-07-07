/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author CASP
 */
public class Conn {
    Connection con;

    public Conn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/centromedico","root","Pass!!123");
            //en caso que fuera otro servidor se coloca la DDS o la IP del otro en lugar del localhost;
        } catch (Exception e) {
            System.err.println("Error : " + e);
        }
    }
    //Metodo
    public Connection getConnection(){
        return con;
    }
    
}
