package pe.edu.pucp.softpub.person.daoImpl;

// Casco_Once

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mysql.config.DBManagerMySQL;
import pe.edu.pucp.softpub.person.model.Especialidad;
import pe.edu.pucp.softpub.person.dao.EspecialidadDAO;

public class EspecialidadDAOImpl implements EspecialidadDAO{
// Atributos
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
// Metodos
    @Override
    public Integer insertar(Especialidad especialidad){
        int resultado = 0;
        try {
            con = DBManagerMySQL.getInstance().getConnection();
            con.setAutoCommit(false);
            String sql = "INSERT INTO Especialidad(idEspecialidad, especialidad, facultad, nivel)"
                    + " VALUES (?, ?, ?, ?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, especialidad.getIdEspecialidad());
            pst.setString(2, especialidad.getEspecialidad());
            pst.setString(3, especialidad.getFacultad());
            pst.setString(4, especialidad.getNivel().toString());
            resultado = pst.executeUpdate();
            con.commit();
        } catch (SQLException ex) {
            try {
                con.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(EspecialidadDAOImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(EspecialidadDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(EspecialidadDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resultado;
    }
}
