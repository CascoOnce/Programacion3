package publicaciones_v02;

/*
 * @author nickc
 */

public class Articulo extends Publicacion{
// Atributos
    private String revista;
    private Integer volumen;
    private Integer numero;
    private String mes;
// Metodos
    // Constructor
    public Articulo(String nombre, String autores[], Integer cantidad_autores, Integer año, 
            String revista, Integer volumen, Integer numero, String mes){
        super(nombre, autores, cantidad_autores, año);
        this.revista = revista;
        this.volumen = volumen;
        this.numero = numero;
        this.mes = mes;
    }
    public Articulo(String nombre, String autor, Integer año, String revista, 
            Integer volumen, Integer numero, String mes){
        super(nombre, autor, año);
        this.revista = revista;
        this.volumen = volumen;
        this.numero = numero;
        this.mes = mes;
    }
    @Override
    // Impresion
    public void referenciar(){
        String referencia = "[1] ";
        for(int i=0; i<this.cantidad_autores; i++){
            if (i!=0){
                if (i==this.cantidad_autores-1){referencia = referencia.concat(" and ");}
                else{referencia = referencia.concat(", ");}
            }
            referencia = referencia.concat(this.autores[i]);                    
        }
        referencia = referencia.concat(", \"");
        referencia = referencia.concat(this.nombre);
        referencia = referencia.concat("\", ");
        referencia = referencia.concat(this.revista);
        referencia = referencia.concat(", vol. ");
        referencia = referencia.concat(this.volumen.toString());
        referencia = referencia.concat(", no. ");
        referencia = referencia.concat(this.numero.toString());
        referencia = referencia.concat(", ");
        referencia = referencia.concat(this.mes);
        referencia = referencia.concat(", ");
        referencia = referencia.concat(this.año.toString());
        referencia = referencia.concat(".");
        System.out.println(referencia);
    }
}
