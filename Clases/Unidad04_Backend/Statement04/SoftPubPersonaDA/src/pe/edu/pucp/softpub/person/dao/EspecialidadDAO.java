package pe.edu.pucp.softpub.person.dao;

// Casco_Once

import java.util.ArrayList;
import pe.edu.pucp.softpub.person.model.Especialidad;

public interface EspecialidadDAO {
    public Integer insertar(Especialidad especialidad);
    public Integer modificar(Especialidad especialidad);
//    public Integer eliminar(Especialidad especialidad);
    public ArrayList<Especialidad> listarTodos();
//    public Seccion obtenerPorId(String idEspecialidad);
}
