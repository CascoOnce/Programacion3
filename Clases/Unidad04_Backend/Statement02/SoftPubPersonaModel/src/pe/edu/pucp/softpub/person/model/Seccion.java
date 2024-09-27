package pe.edu.pucp.softpub.person.model;

// Casco_Once

public class Seccion {
// Atributos
    private String idSeccion;
    private String seccion;
    private String departamento;
// Metodos
    public Seccion() {
        this.idSeccion = null;
        this.seccion = null;
        this.departamento = null;
    }
    public Seccion(String idSeccion, String seccion, String departamento) {
        this.idSeccion = idSeccion;
        this.seccion = seccion;
        this.departamento = departamento;
    }
    public String getIdSeccion() {
        return idSeccion;
    }
    public void setIdSeccion(String idSeccion) {
        this.idSeccion = idSeccion;
    }
    public String getSeccion() {
        return seccion;
    }
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
