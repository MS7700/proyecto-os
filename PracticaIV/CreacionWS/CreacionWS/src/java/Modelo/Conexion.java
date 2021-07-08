/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 *
 * @author hendr
 */
public class Conexion {
    Connection con;
    private static Driver driver = new org.apache.derby.jdbc.ClientDriver();
    //Modificar estos valores
    //private static String URLDerby = "jdbc:derby://localhost:1527/PracticaII";
    //private static String usuario = "myuser";
    //private static String contrasena = "12345";
    
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicaiv?zeroDateTimeBehavior=convertToNull","root","");
        }
        catch(Exception e){
        
        }
    }
    
    public Connection getConnection() {
        return con;
    }
    
}
