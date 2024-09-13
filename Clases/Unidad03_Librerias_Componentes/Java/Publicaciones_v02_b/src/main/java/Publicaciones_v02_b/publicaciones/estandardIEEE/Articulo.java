package Publicaciones_v02_b.publicaciones.estandardIEEE;

import Publicaciones_v02_b.publicaciones.Publicacion;

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
        String referencia = "[" + Publicacion.orden_presentacion + "] ";
        for(int i=0; i<this.cantidad_autores; i++){
            if (i!=0){
                if (i==this.cantidad_autores-1){referencia = referencia.concat(" and ");}
                else{referencia = referencia.concat(", ");}
            }
            referencia += this.autores.get(i).toString();                    
        }
        referencia += ", \"" + this.nombre + "\", " + this.revista + ", vol. " + this.volumen.toString();
        referencia += ", no. " + this.numero.toString() + ", " + this.mes + ", " + this.año.toString() + ".";
        System.out.println(referencia);
    }
}
