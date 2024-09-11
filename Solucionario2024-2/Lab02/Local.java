class Local implements InfoProvider{
	private String nombre;
	private String direccion;
	private int capacidad;
	private TipoLocal tipoLocal;
	public Local(String nombre, String direccion, int capacidad, TipoLocal tipoLocal){
		this.nombre = nombre;
		this.direccion = direccion;
		this.capacidad = capacidad;
		this.tipoLocal = tipoLocal;
	}
	public String devolverDatos(){
		return "LOCAL: " + nombre + " - CAPACIDAD:" + capacidad + "\n";
	}
}