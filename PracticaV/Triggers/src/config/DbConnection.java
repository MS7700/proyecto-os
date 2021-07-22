package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    Connection con;
    public DbConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", "root", "");
        }
        catch (Exception e) {
        }
    }
    public Connection GetConnection() {
        return con;
    }
}
