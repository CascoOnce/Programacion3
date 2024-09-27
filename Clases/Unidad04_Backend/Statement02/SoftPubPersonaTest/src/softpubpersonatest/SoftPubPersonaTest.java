package softpubpersonatest;

// Casco_Once

import pe.edu.pucp.softpub.person.model.Nivel;
import pe.edu.pucp.softpub.person.bo.SeccionBo;
import pe.edu.pucp.softpub.person.bo.EspecialidadBo;

public class SoftPubPersonaTest {
    public static void main(String[] args) {
        SeccionBOTest();
        EspecialidadBOTest();
    }
    private static void SeccionBOTest() {
        SeccionBo seccionBO = new SeccionBo();
        seccionBO.insertar("INF", "Informática", "Ingeniería");
        seccionBO.insertar("TEL", "Telecomunicaciones", "Ingeniería");
    }
    private static void EspecialidadBOTest() {
        EspecialidadBo especialidadBo = new EspecialidadBo();
        especialidadBo.insertar(1, "Ingeniería Informática", "Ciencias e Ingeniería", Nivel.PREGRADO);
        especialidadBo.insertar(2, "Maestría en Informática", "Escuela de Posgrado", Nivel.MAESTRIA);
    }
}
