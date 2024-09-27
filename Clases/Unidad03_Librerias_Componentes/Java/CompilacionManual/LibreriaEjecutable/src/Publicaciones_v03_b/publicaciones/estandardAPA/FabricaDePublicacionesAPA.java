package Publicaciones_v03_b.publicaciones.estandardAPA;

import Publicaciones_v03_b.publicaciones.Clase_de_Tesis;
import Publicaciones_v03_b.publicaciones.FabricaDePublicaciones;
import Publicaciones_v03_b.publicaciones.Publicacion;

public class FabricaDePublicacionesAPA extends FabricaDePublicaciones{
// Metodos
    // Articulo
    @Override
    public Publicacion crearArticulo(String nombre, String nombre_completo_autor, Integer año, String revista, Integer volumen, Integer numero, String mes) {
        return new Publicaciones_v03_b.publicaciones.estandardAPA.Articulo(nombre, nombre_completo_autor, año, revista, volumen, numero, mes);
    }
    @Override
    public Publicacion crearArticulo(String nombre, String[] nombres_completos_autores, Integer año, String revista, Integer volumen, Integer numero, String mes) {
        return new Publicaciones_v03_b.publicaciones.estandardAPA.Articulo(nombre, nombres_completos_autores, año, revista, volumen, numero, mes);
    }
    // Libro
    @Override
    public Publicacion crearLibro(String nombre, String nombre_completo_autor, Integer año, String edicion, String lugar, String editorial) {
        return new Publicaciones_v03_b.publicaciones.estandardAPA.Libro(nombre, nombre_completo_autor, año, edicion, lugar, editorial);
    }
    @Override
    public Publicacion crearLibro(String nombre, String[] nombres_completos_autores, Integer año, String edicion, String lugar, String editorial) {
        return new Publicaciones_v03_b.publicaciones.estandardAPA.Libro(nombre, nombres_completos_autores, año, edicion, lugar, editorial);
    }
    // Tesis
    @Override
    public Publicacion crearTesis(String nombre, String nombre_completo_autor, Integer año, Clase_de_Tesis clase, String departamento, String institucion, String ciudad, String estado) {
        return new Publicaciones_v03_b.publicaciones.estandardAPA.Tesis(nombre, nombre_completo_autor, año, clase, departamento, institucion, ciudad, estado);
    }
    @Override
    public Publicacion crearTesis(String nombre, String[] nombres_completos_autores, Integer año, Clase_de_Tesis clase, String departamento, String institucion, String ciudad, String estado) {
        return new Publicaciones_v03_b.publicaciones.estandardAPA.Tesis(nombre, nombres_completos_autores, año, clase, departamento, institucion, ciudad, estado);
    }
}
