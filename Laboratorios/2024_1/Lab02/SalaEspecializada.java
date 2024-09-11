class SalaEspecializada extends AmbienteClinico{
// Atributos
	private String nombre;
	private boolean poseeImagenologia;
// Metodos
	// Constructor
	public SalaEspecializada(double espacio, char torre, int numeroDePiso, String nombre, boolean poseeImagenologia){
		super(espacio, torre, numeroDePiso);
		this.nombre = nombre;
		this.poseeImagenologia = poseeImagenologia;
	}
	// Devolver Informacion
	public String devolverInformacion(){
		String cadena = "SALA ESPECIALIZADA: " + nombre + " - TORRE: " + getTorre() + " - PISO: " + getNumeroDePiso() + " - EQ. IMAGENOLOGIA: ";
		if(poseeImagenologia){cadena += "SI";}
		else{cadena += "NO";}
		return cadena;
	}
}