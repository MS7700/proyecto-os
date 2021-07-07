/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

    private static Connection cn = null;
    private static Driver driver = new org.apache.derby.jdbc.ClientDriver();
    //Modificar estos valores
    private static String URLDerby = "jdbc:derby:PracticaTres;create=true";
    private static String usuario = "root";
    private static String contrasena = "1234";
    public static Connection getConexion() throws SQLException {
        if (cn == null) {
            iniciarConexion();
        }
        return cn;
    }

    public static void iniciarConexion() throws SQLException {
        DriverManager.registerDriver(driver);
        cn = DriverManager.getConnection(URLDerby, usuario, contrasena);
    }

    public static ResultSet ejecutarConsulta(String sql) throws Throwable {
        ResultSet rs = null;
        try {
            
            Statement st = cn.createStatement();
            rs = st.executeQuery(sql);
        } catch (Throwable e) {
            System.out.println("Ha fallado la consulta de datos");
            e.printStackTrace();
            throw e;
        }
        return rs;
    }
  
    public static void ejecutarSentencia(String sql) {
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Throwable e) {
            System.out.println("Ha fallado la sentencia de base de datos");
            e.printStackTrace();
        }
    }

}
