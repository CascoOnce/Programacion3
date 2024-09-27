package pe.edu.pucp.softpub.person.daoImpl;

// Casco_Once

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mysql.db.DAOImpl;
import pe.edu.pucp.softpub.person.model.Especialidad;
import pe.edu.pucp.softpub.person.dao.EspecialidadDAO;

public class EspecialidadDAOImpl extends DAOImpl implements EspecialidadDAO{
// Atributos
    private Especialidad especialidad;
// Metodos
    public EspecialidadDAOImpl(){
        super("Especialidad");
        this.especialidad = null;
    }
    @Override
    public Integer insertar(Especialidad especialidad){
        this.especialidad = especialidad;
        return insertar();
    }
    @Override
    protected String obtenerListaAtributosParaInsert() {
        return "idEspecialidad, especialidad, facultad, nivel";
    }
    @Override
    protected String obtenerIncognitos() {
        return "?, ?, ?, ?";
    }
    @Override
    protected void obtenerListaValoresParaInsert(PreparedStatement pst) {
        try {
            pst.setInt(1, especialidad.getIdEspecialidad());
            pst.setString(2, especialidad.getEspecialidad());
            pst.setString(3, especialidad.getFacultad());
            pst.setString(4, especialidad.getNivel().toString());
        } catch (SQLException ex) {
            Logger.getLogger(EspecialidadDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
