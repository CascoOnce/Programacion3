package pe.edu.pucp.softpub.person.bo;

// Casco_Once

import pe.edu.pucp.softpub.person.model.Seccion;
import pe.edu.pucp.softpub.person.dao.SeccionDAO;
import pe.edu.pucp.softpub.person.daoImpl.SeccionDAOImpl;

public class SeccionBo {
// Atributos
    private SeccionDAO seccionDAO;
// Metodos
    public SeccionBo(){
        this.seccionDAO = new SeccionDAOImpl();
    }
    public Integer insertar(String idSeccion, String nombre_seccion, String departamento){
        Seccion seccion = new Seccion(idSeccion, nombre_seccion, departamento);
        return seccionDAO.insertar(seccion);
    }
}
