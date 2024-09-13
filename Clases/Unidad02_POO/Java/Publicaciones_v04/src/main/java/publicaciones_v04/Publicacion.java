package publicaciones_v04;

public abstract class Publicacion{
// Atributos
    public static Integer orden_presentacion = 1;
    protected String nombre;
    protected Autor autores[];
    protected Integer cantidad_autores;
    protected Integer año;
// Metodos
    // Constructor
    public Publicacion(String nombre, Autor[] autores, Integer cantidad_autores, Integer año){
        this.nombre = nombre;
        this.autores = autores;
        this.cantidad_autores = cantidad_autores;
        this.año = año;
    }
    public Publicacion(String nombre, Autor autor, Integer año){
        this.nombre = nombre;
        this.autores = new Autor[1];
        this.autores[0] = autor;
        this.cantidad_autores = 1;
        this.año = año;
    }
    // Impresion
    public abstract void referenciar();
}
