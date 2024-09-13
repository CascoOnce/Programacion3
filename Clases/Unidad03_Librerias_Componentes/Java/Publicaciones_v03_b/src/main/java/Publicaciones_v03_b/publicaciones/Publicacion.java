package Publicaciones_v03_b.publicaciones;

import java.util.ArrayList;

public abstract class Publicacion{
// Atributos
    public static Integer orden_presentacion = 1;
    protected String nombre;
    protected ArrayList<Autor> autores;
    protected Integer cantidad_autores;
    protected Integer año;
// Metodos
    // Constructor
    public Publicacion(String nombre, String autores[], Integer año){
        this.nombre = nombre;
        this.autores = new ArrayList<Autor>();
        for(String nombres:autores){
            Autor nombreAutor = new Autor(nombres);
            this.autores.add(nombreAutor);
        }
        this.cantidad_autores = this.autores.size();
        this.año = año;
    }
    public Publicacion(String nombre, String autor, Integer año){
        this.nombre = nombre;
        this.autores = new ArrayList<Autor>();
        Autor nombreAutor = new Autor(autor);
        this.autores.add(nombreAutor);
        this.cantidad_autores = 1;
        this.año = año;
    }
    // Impresion
    public abstract void referenciar();
}
