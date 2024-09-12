package publicaciones_v02;

/*
 * @author nickc
 */

public class Libro extends Publicacion{
// Atributos
    private String edicion;
    private String lugar;
    private String editorial;
// Metodos
    // Constructor
    public Libro(String nombre, String autores[], Integer cantidad_autores, Integer año, 
            String edicion, String lugar, String editorial){
        super(nombre, autores, cantidad_autores, año);
        this.editorial = editorial;
        this.lugar = lugar;
        this.editorial = editorial;
    }
    public Libro(String nombre, String autor, Integer año, String edicion, String lugar,
            String editorial){
        super(nombre, autor, año);
        this.editorial = editorial;
        this.lugar = lugar;
        this.editorial = editorial;
    }
}
