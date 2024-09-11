public class Local implements InfoProvider{
// Atributos
	private TipoLocal tipo;
	private String nombre;
	private String direccion;
	private Integer capacidad;
// Metodos
	// Constructor
	public Local(String nombre, String direccion, Integer capacidad, TipoLocal tipo){
		this.nombre = nombre;
		this.direccion = direccion;
		this.capacidad = capacidad;
		this.tipo = tipo;
	}
	// InfoProvider: Devolver Datos
	public String devolverDatos(){
		return "LOCAL: " + nombre + " - CAPACIDAD:" + capacidad + '\n';
	}
}