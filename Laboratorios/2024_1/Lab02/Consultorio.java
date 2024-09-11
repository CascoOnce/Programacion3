class Consultorio extends AmbienteClinico{
// Atributos
	private String numero;
// Metodos
	// Constructor
	public Consultorio(double espacio, char torre, int numeroDePiso, String numero){
		super(espacio, torre, numeroDePiso);
		this.numero = numero;
	}
	// Devolver Informacion
	@Override
	public String devolverInformacion(){
		return "CONSULTORIO: " + numero + " - TORRE: " + getTorre() + " - PISO: " + getNumeroDePiso();
	}
}