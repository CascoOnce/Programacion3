package publicaciones_v01.publicaciones_v01;

/*
 * @author Casco_Once
*/

public class Publicacion {
// Atributos
    private String nombre;
    private String autores[];
    private Integer cantidad_autores;
    private Integer año;
// Metodos
    // Constructor
    public Publicacion(String nombre, String[] autores, Integer cantidad_autores, Integer año){
        this.nombre = nombre;
        this.autores = autores;
        this.cantidad_autores = cantidad_autores;
        this.año = año;
    }
    public Publicacion(String nombre, String autor, Integer año){
        this.nombre = nombre;
        this.autores = new String[1];
        this.autores[0] = autor;
        this.cantidad_autores = 1;
        this.año = año;
    }
    // Impresion
    public void referenciar(){
        String referencia = "[1] ";
        for(int i = 0; i < this.cantidad_autores; i++){
            if(i != 0){
                if(i == this.cantidad_autores - 1){referencia = referencia.concat(" and ");}
                else{referencia = referencia.concat(",  ");}
            }
            referencia = referencia.concat(this.autores[i]);
        }
        referencia = referencia.concat(". ");
        referencia = referencia.concat(this.nombre);
        referencia = referencia.concat(". ");
        referencia = referencia.concat(this.año.toString());
        referencia = referencia.concat(".");
        System.out.println(referencia);
    }
}
