class Aeropuerto implements Consultable{
// Atributos
	private String nombre;
	private String direccion;
	private TipoAeropuerto tipo;
	private Ciudad ciudad;
	private Operadora operadora;
// Metodos
	// Constructor
	public Aeropuerto(String nombre, String direccion, TipoAeropuerto tipo, Ciudad ciudad, Operadora operadora){
		this.nombre = nombre;
		this.direccion = direccion;
		this.tipo = tipo;
		this.ciudad = ciudad;
		this.operadora = operadora;
	}
	// Consultar Datos
	public String consultarDatos(){
		return "Aeropuerto: " + nombre + " - " + ciudad.getNombre() + " - " + tipo + '\n' + operadora.consultarDatos();
	}
}