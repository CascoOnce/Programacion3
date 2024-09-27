package Publicaciones_v03_b;

// Casco_Once

import Publicaciones_v03_b.publicaciones.Publicacion;
import Publicaciones_v03_b.publicaciones.Clase_de_Tesis;
import Publicaciones_v03_b.publicaciones.FabricaDePublicaciones;
import Publicaciones_v03_b.publicaciones.estandardAPA.FabricaDePublicacionesAPA;
import Publicaciones_v03_b.publicaciones.estandardIEEE.FabricaDePublicacionesIEEE;

public class Publicaciones_v03_b {

    public static void main(String[] args) {
        FabricaDePublicaciones factoryIEEE = new FabricaDePublicacionesIEEE();
        FabricaDePublicaciones factoryAPA = new FabricaDePublicacionesAPA();
        Publicacion publicaciones[] = new Publicacion[3];
        publicaciones[0] = factoryIEEE.crearArticulo("A relational model of data for large shared data banks", "Codd, Edgar Frank", 1970, "Communications of the ACM", 13, 6, "junio");
        String autores[]= {"Gamma, Erich", "Helm, Richard", "Johnson, Ralph", "Vlissides, John"};        
        publicaciones[1] = factoryAPA.crearLibro("Design Patterns: Elements of Reusable Object-Oriented Software", autores, 1970, "1er edición", "Massachusetts", "Addison-Wesley Professional");
        publicaciones[2] = factoryIEEE.crearTesis("A system of logic based on ordinals", "Turing, Alan Mathison", 1938, Clase_de_Tesis.DOCTORADO, "Departamento de Matemáticas", "Universidad de Princeton", "Princeton", "NJ");                
        
        for (Publicacion publicacion : publicaciones) {
            publicacion.referenciar();
            Publicacion.orden_presentacion++;
        }
    }
}
