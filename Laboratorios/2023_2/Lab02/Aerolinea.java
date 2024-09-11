class Aerolinea extends Empresa{
// Atributos
	private String callsign;
	private boolean programaFidelidad;
// Metodos
	// Constructor
	public Aerolinea(String nombre, String callsign, boolean programaFidelidad){
		super(nombre);
		this.callsign = callsign;
		this.programaFidelidad = programaFidelidad;
	}
	// Consultar de Datos
	@Override
	public String consultarDatos(){
		return "Aerolinea: " + getNombre() + " - " + callsign + " - Programa Fidelidad: " + programaFidelidad;
	}
}