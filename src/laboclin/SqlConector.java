/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboclin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class SqlConector {
    
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "Carlaandrea98";
    private static final String url = "jdbc:mysql://localhost:3306/laboratorio";

    
    public static Connection conectar(){
        Connection con = null;
        try{
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, pass);
            //if(con != null)
            //    JOptionPane.showMessageDialog(null, "Conexion exitosa!");
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexion " + e.getMessage());
        }
        return con;
    }
    
}
