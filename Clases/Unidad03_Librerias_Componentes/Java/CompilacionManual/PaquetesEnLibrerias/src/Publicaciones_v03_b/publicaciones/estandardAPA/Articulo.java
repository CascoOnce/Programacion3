package Publicaciones_v03_b.publicaciones.estandardAPA;

import Publicaciones_v03_b.publicaciones.Publicacion;

public class Articulo extends Publicacion{
// Atributos
    private String revista;
    private Integer volumen;
    private Integer numero;
    private String mes;
// Metodos
    // Constructor
    public Articulo(String nombre, String autores[], Integer año, String revista, Integer volumen, Integer numero, String mes){
        super(nombre, autores, año);
        this.revista = revista;
        this.volumen = volumen;
        this.numero = numero;
        this.mes = mes;
    }
    public Articulo(String nombre, String autor, Integer año, String revista, Integer volumen, Integer numero, String mes){
        super(nombre, autor, año);
        this.revista = revista;
        this.volumen = volumen;
        this.numero = numero;
        this.mes = mes;
    }
    // Impresion
    @Override
    public void referenciar(){
        String referencia = "";
        for(int i=0; i<this.cantidad_autores; i++){
            if (i!=0){
                if (i==this.cantidad_autores-1){referencia += " and ";}
                else{referencia += ", ";}
            }
            referencia += this.autores.get(i).toString();                    
        }
        referencia += ", (" + año.toString() + "). " + this.nombre + ". " + this.revista;
        referencia += ", " + volumen.toString() + "(" + this.numero.toString() + ").";
        System.out.println(referencia);
    }
}
