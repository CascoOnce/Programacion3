package Publicaciones_v03_b.publicaciones;

public abstract class FabricaDePublicaciones {
// Metodos
    // Articulo
    public abstract Publicacion crearArticulo(String nombre, String autores[], Integer año, String revista, Integer volumen, Integer numero, String mes);
    public abstract Publicacion crearArticulo(String nombre, String autor, Integer año, String revista, Integer volumen, Integer numero, String mes);
    // Libro
    public abstract Publicacion crearLibro(String nombre, String autores[], Integer año, String edicion, String lugar, String editorial);
    public abstract Publicacion crearLibro(String nombre, String autor, Integer año, String edicion, String lugar, String editorial);
    // Tesis
    public abstract Publicacion crearTesis(String nombre, String autores[], Integer año, Clase_de_Tesis clase, String departamento, String institucion, String ciudad, String estado);
    public abstract Publicacion crearTesis(String nombre, String autor, Integer año, Clase_de_Tesis clase, String departamento, String institucion, String ciudad, String estado);
}
