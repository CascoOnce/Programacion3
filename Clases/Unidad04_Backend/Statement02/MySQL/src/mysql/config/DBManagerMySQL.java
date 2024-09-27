package mysql.config;

// Casco_Once

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBManagerMySQL {
// Atributos
    private String url;
    private Connection conexion;
    private String driver;
    private String usuario;
    private String contraseña;
    private static DBManagerMySQL dbManager = null;
// Metodos
    private DBManagerMySQL(){};
    public static DBManagerMySQL getInstance(){
        if(DBManagerMySQL.dbManager == null) createInstance();
        return DBManagerMySQL.dbManager;
    }
    private static void createInstance(){
        if(DBManagerMySQL.dbManager == null) DBManagerMySQL.dbManager = new DBManagerMySQL(); 
    }
    public Connection getConnection() throws SQLException{
        this.url = "jdbc:mysql://127.0.0.1:3306/soft_pub_test";
        this.driver = "com.mysql.cj.jdbc.Driver";
        this.usuario = "GitHub";
        this.contraseña = "BaseDeDatosGH";
        try {
            Class.forName(this.driver);
            this.conexion = DriverManager.getConnection(url, this.usuario, this.contraseña);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBManagerMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.conexion;
    }
}
