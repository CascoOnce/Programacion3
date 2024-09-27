package pe.edu.pucp.softpub.person.daoImpl;

// Casco_Once

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import mysql.db.DAOImpl;
import pe.edu.pucp.softpub.person.model.Especialidad;
import pe.edu.pucp.softpub.person.dao.EspecialidadDAO;
import pe.edu.pucp.softpub.person.model.Nivel;

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
    public Integer modificar(Especialidad especialidad){
        this.especialidad = especialidad;
        return modificar();
    }
    @Override
    public ArrayList<Especialidad> listarTodos(){
        return super.listarTodos();
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
    @Override
    public Especialidad agregarObjetoALaLista(){
        Especialidad especialidad_local = new Especialidad();
        try {
            especialidad_local.setIdEspecialidad(rs.getInt("idEspecialidad"));
            especialidad_local.setEspecialidad(rs.getString("especialidad"));
            especialidad_local.setFacultad(rs.getString("facultad"));
            especialidad_local.setNivel(Nivel.valueOf(rs.getString("nivel")));
        } catch (SQLException ex) {
            Logger.getLogger(EspecialidadDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return especialidad_local;
    }
    @Override
    protected String obtenerProyeccionParaSelect() {
        return "idEspecialidad, especialidad, facultad, nivel";
    }
    @Override
    protected String obtenerListaValoresYAtributosParaUpdate() {
       return "especialidad = ?, facultad = ?, nivel = ? WHERE idEspecialidad = " + especialidad.getIdEspecialidad();
    }
    @Override
    protected void obtenerPredicadoParaLlavePrimaria(PreparedStatement pst) {
        try {
            pst.setString(1, especialidad.getEspecialidad());
            pst.setString(2, especialidad.getFacultad());
            pst.setString(3, especialidad.getNivel().toString());
        } catch (SQLException ex) {
            Logger.getLogger(EspecialidadDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
