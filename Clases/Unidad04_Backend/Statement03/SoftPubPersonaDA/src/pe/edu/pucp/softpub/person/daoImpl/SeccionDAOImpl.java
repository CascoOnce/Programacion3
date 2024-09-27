package pe.edu.pucp.softpub.person.daoImpl;

// Casco_Once

import pe.edu.pucp.softpub.person.dao.SeccionDAO;
import pe.edu.pucp.softpub.person.model.Seccion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mysql.db.DAOImpl;

public class SeccionDAOImpl extends DAOImpl implements SeccionDAO{
// Atributos
    private Seccion seccion;
// Metodos
    public SeccionDAOImpl() {
        super("Seccion");
        seccion = null;
    }
    @Override
    public Integer insertar(Seccion seccion){
        this.seccion = seccion;
        return this.insertar();
    }
    @Override
    protected String obtenerListaAtributosParaInsert() {
        return "idSeccion, seccion, departamento";
    }
    @Override
    protected String obtenerIncognitos() {
        return "?, ?, ?";
    }
    @Override
    protected void obtenerListaValoresParaInsert(PreparedStatement pst) {
        try {
            pst.setString(1, seccion.getIdSeccion());
            pst.setString(2, seccion.getSeccion());
            pst.setString(3, seccion.getDepartamento());
        } catch (SQLException ex) {
            Logger.getLogger(SeccionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}