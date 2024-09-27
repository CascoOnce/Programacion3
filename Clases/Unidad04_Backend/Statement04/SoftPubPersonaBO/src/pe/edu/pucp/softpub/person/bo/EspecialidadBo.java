package pe.edu.pucp.softpub.person.bo;

// Casco_Once

import java.util.ArrayList;
import pe.edu.pucp.softpub.person.dao.EspecialidadDAO;
import pe.edu.pucp.softpub.person.daoImpl.EspecialidadDAOImpl;
import pe.edu.pucp.softpub.person.model.Especialidad;
import pe.edu.pucp.softpub.person.model.Nivel;

public class EspecialidadBo {
// Atributos
    private EspecialidadDAO especialidadDAO;
// Metodos
    public EspecialidadBo(){
        this.especialidadDAO = new EspecialidadDAOImpl();
    }
    public Integer insertar(Integer idEspecialidad, String especialidad, String facultad, Nivel nivel){
        Especialidad especialidadObj = new Especialidad(idEspecialidad, especialidad, facultad, nivel);
        return especialidadDAO.insertar(especialidadObj);
    }
    public Integer modificar(Integer idEspecialidad, String especialidad, String facultad, Nivel nivel){
        Especialidad especialidadObj = new Especialidad(idEspecialidad, especialidad, facultad, nivel);
        return especialidadDAO.modificar(especialidadObj);
    }
    public ArrayList<Especialidad> listarTodos(){
        return this.especialidadDAO.listarTodos();
    }
}
