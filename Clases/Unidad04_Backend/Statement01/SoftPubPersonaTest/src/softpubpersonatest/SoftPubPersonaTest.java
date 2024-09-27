package softpubpersonatest;

// Casco_Once

import pe.edu.pucp.softpub.person.bo.SeccionBo;

public class SoftPubPersonaTest {
    public static void main(String[] args) {
        SeccionBo seccionBO = new SeccionBo();
        System.out.println(seccionBO.insertar("INF", "Informatica", "Ingenieria"));
        System.out.println(seccionBO.insertar("TEL", "Telecomunicaciones", "Ingenieria"));
    }
}
