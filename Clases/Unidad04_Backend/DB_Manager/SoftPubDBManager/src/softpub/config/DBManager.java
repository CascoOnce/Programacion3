package softpub.config;

// Casco_Once

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import softpub.util.Cifrado;
import static softpub.util.Cifrado.descifrarMD5;

public class DBManager {
// Atributos
    private static final String ARCHIVO_CONFIGURACION = "jdbc.properties"; // Almacena los datos para hacer la conexion
    private Connection conexion;
    private String driver;
    private String tipo_de_driver;
    private String base_de_datos;
    private String nombre_de_host;
    private String puerto;
    private String usuario;
    private String contraseña;
    private static DBManager dbManager = null;
// Metodos
    private DBManager(){};
    public static DBManager getInstance(){
        if(DBManager.dbManager == null) createInstance();
        return DBManager.dbManager;
    }
    private static void createInstance(){
        if(DBManager.dbManager == null) DBManager.dbManager = new DBManager();
    }
    public Connection getConnection() throws SQLException{
        try {
            leer_archivo_de_propiedades();
            Class.forName(this.driver);
            this.conexion = DriverManager.getConnection(getURL(), this.usuario, Cifrado.descifrarMD5(this.contraseña));
//            this.conexion = DriverManager.getConnection(getURL(), this.usuario, this.contraseña);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.conexion;
    }
    private String getURL(){
        String url = "";
        url += this.tipo_de_driver + "://";
        url += this.nombre_de_host + ":" + this.puerto + "/" + this.base_de_datos;
        return url;
    }
    private void leer_archivo_de_propiedades(){
        Properties properties = new Properties();
        String nameFileConfig = "resources/" + ARCHIVO_CONFIGURACION;
        try {
            properties.load(new FileInputStream(new File(nameFileConfig)));
            this.driver = properties.getProperty("driver");
            this.tipo_de_driver = properties.getProperty("tipo_de_driver");
            this.base_de_datos = properties.getProperty("base_de_datos");
            this.nombre_de_host = properties.getProperty("nombre_de_host");
            this.puerto = properties.getProperty("puerto");
            this.usuario = properties.getProperty("usuario");
            this.contraseña = properties.getProperty("contrasenha");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
