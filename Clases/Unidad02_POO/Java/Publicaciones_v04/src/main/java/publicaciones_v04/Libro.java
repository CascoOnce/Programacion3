package publicaciones_v04;

public class Libro extends Publicacion{
// Atributos
    private String edicion;
    private String lugar;
    private String editorial;
// Metodos
    // Constructor
    public Libro(String nombre, Autor[] autores, Integer cantidad_autores, Integer año, String edicion, String lugar, String editorial){
        super(nombre, autores, cantidad_autores, año);
        this.edicion = edicion;
        this.lugar = lugar;
        this.editorial = editorial;
    }
    public Libro(String nombre, Autor autor, Integer año, String edicion, String lugar, String editorial){
        super(nombre, autor, año);
        this.edicion = edicion;
        this.lugar = lugar;
        this.editorial = editorial;
    }
    @Override
    // Impresion
    public void referenciar(){
        String referencia = "[" + Publicacion.orden_presentacion + "] ";
        for(int i = 0; i < this.cantidad_autores; i++){
            if (i != 0){
                if (i == this.cantidad_autores - 1){referencia += " and ";}
                else{referencia += ", ";}
            }
            referencia += this.autores[i].lineaAutor();                    
        }
        referencia += ", " + this.nombre + ". " + this.edicion + "." + this.lugar;
        referencia += "." + this.editorial + ". " + this.año.toString() + ".";
        System.out.println(referencia);
    }
}
