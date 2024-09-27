package pe.edu.pucp.softpub.person.model;

// Casco_Once

public class Especialidad {
// Atributos
    private Integer idEspecialidad;
    private String especialidad;
    private String facultad;
    private Nivel nivel;
// Metodos
    public Especialidad() {
        this.idEspecialidad = null;
        this.especialidad = null;
        this.facultad = null;
        this.nivel = null;
    }
    public Especialidad(Integer idEspecialidad, String especialidad, String facultad, Nivel nivel) {
        this.idEspecialidad = idEspecialidad;
        this.especialidad = especialidad;
        this.facultad = facultad;
        this.nivel = nivel;
    }
    public Integer getIdEspecialidad() {
        return idEspecialidad;
    }
    public void setIdEspecialidad(Integer idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getFacultad() {
        return facultad;
    }
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    public Nivel getNivel() {
        return nivel;
    }
    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }
}
