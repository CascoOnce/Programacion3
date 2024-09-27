package pe.edu.pucp.softpub.person.daoImpl;

// Casco_Once

import pe.edu.pucp.softpub.person.dao.SeccionDAO;
import pe.edu.pucp.softpub.person.model.Seccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mysql.config.DBManagerMySQL;

public class SeccionDAOImpl implements SeccionDAO{
// Atributos
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
// Metodos
    @Override
    public Integer insertar(Seccion seccion){
        int resultado = 0;
        try {
            con = DBManagerMySQL.getInstance().getConnection();
            con.setAutoCommit(false);
            String sql = "INSERT INTO Seccion(idSeccion, seccion, departamento) VALUES (?, ?, ?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, seccion.getIdSeccion());
            pst.setString(2, seccion.getSeccion());
            pst.setString(3, seccion.getDepartamento());
            resultado = pst.executeUpdate();
            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(SeccionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                con.close();
            } catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }
    
}