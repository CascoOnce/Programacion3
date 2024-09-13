package publicaciones_v04;

public class Tesis extends Publicacion{
// Atributos
    private Clase_de_Tesis clase;
    private String departamento;
    private String institucion;
    private String ciudad;
    private String estado;
// Metodos
    // Constructor
    public Tesis(String nombre, Autor[] autores, Integer cantidad_autores, Integer año, Clase_de_Tesis clase, String departamento, String institucion, String ciudad, String estado){
        super(nombre, autores, cantidad_autores, año);
        this.clase = clase;
        this.departamento = departamento;
        this.institucion = institucion;
        this.ciudad = ciudad;
        this.estado = estado;
    }
    public Tesis(String nombre, Autor autor, Integer año, Clase_de_Tesis clase, String departamento, String institucion, String ciudad, String estado){
        super(nombre, autor, año);
        this.clase = clase;
        this.departamento = departamento;
        this.institucion = institucion;
        this.ciudad = ciudad;
        this.estado = estado;
    }
    @Override
    // Impresion
    public void referenciar(){
        String referencia = "[" + Publicacion.orden_presentacion + "] ";
        for(int i=0; i < this.cantidad_autores; i++){
            if (i!=0){
                if (i == this.cantidad_autores-1){referencia += " and ";}
                else{referencia += ", ";}
            }
            referencia += this.autores[i].lineaAutor();                    
        }
        referencia += ", " + this.nombre + ", ";
        switch(this.clase){
            case Clase_de_Tesis.LICENCIATURA -> referencia += "Tesis de Licenciatura";
            case Clase_de_Tesis.MAESTRIA -> referencia += "Tesis de Licenciatura";
            case Clase_de_Tesis.DOCTORADO -> referencia += "Tesis de Doctorado";
        }
        referencia += ", " + this.departamento + ", " + this.institucion + ", ";
        referencia += this.ciudad + ", " + this.estado + ", " + this.año.toString() + ".";
        System.out.println(referencia);
    }
}
