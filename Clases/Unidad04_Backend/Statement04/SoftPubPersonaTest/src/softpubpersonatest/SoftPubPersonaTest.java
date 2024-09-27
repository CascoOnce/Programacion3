package softpubpersonatest;

// Casco_Once

import java.util.ArrayList;
import pe.edu.pucp.softpub.person.model.Nivel;
import pe.edu.pucp.softpub.person.bo.SeccionBo;
import pe.edu.pucp.softpub.person.model.Especialidad;
import pe.edu.pucp.softpub.person.bo.EspecialidadBo;

public class SoftPubPersonaTest {
    public static void main(String[] args) {
        //SeccionBOTest();
        EspecialidadBOTest();
    }
    private static void SeccionBOTest() {
        SeccionBo seccionBO = new SeccionBo();
        seccionBO.insertar("INF", "Informática", "Ingeniería");
        seccionBO.insertar("TEL", "Telecomunicaciones", "Ingeniería");
    }
    private static void EspecialidadBOTest() {
        EspecialidadBo especialidadBo = new EspecialidadBo();
        especialidadBo.modificar(2, "INGEni", "Ciencias", Nivel.PREGRADO);
        ArrayList<Especialidad> listaEspecialidad;
        listaEspecialidad = especialidadBo.listarTodos();
        for(Especialidad especialidad: listaEspecialidad){
            System.out.print(especialidad.getIdEspecialidad() + " - ");
            System.out.println(especialidad.getEspecialidad());
        }
        //especialidadBo.insertar(1, "Ingeniería Informática", "Ciencias e Ingeniería", Nivel.PREGRADO);
        //especialidadBo.insertar(2, "Maestría en Informática", "Escuela de Posgrado", Nivel.MAESTRIA);
    }
}