package publicaciones_v04;

public class Autor {
// Atributos
    private String apellidos;
    private String nombres;
// Metodos
    // Constructor
    public Autor(String apellidos, String nombres){
        this.apellidos = apellidos;
        this.nombres = nombres;
    }
    // Impresion
    public String lineaAutor(){
        return nombres + " " + apellidos;
    }
}
