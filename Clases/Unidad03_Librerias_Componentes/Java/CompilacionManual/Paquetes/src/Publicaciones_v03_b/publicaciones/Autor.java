package Publicaciones_v03_b.publicaciones;

public class Autor {
// Atributos
    private String apellidos;
    private String nombres;
// Metodos
    // Constructor
    public Autor(String nombreCompleto){
        Integer posicionComa = nombreCompleto.indexOf(',');
        this.apellidos = nombreCompleto.substring(0, posicionComa).trim();
        this.nombres = nombreCompleto.substring(posicionComa + 1).trim();
    }
    // Impresion
    @Override
    public String toString(){
        String nombre = this.nombres;
        String abreviatura = "";
        Integer posicionBlanco;
        while(true){
            posicionBlanco = nombre.indexOf(' ');
            abreviatura += " " + nombre.substring(0, 1) + ".";
            if(posicionBlanco == -1) break;
            else nombre = nombre.substring(posicionBlanco + 1);
        }
        return this.apellidos + abreviatura;
    }
}
