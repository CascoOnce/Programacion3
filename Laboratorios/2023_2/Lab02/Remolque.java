class Remolque extends Vehiculo{
// Atributos
	private double capacidadPeso;
// Metodos
	// Constructor
	public Remolque(Aerolinea aerolinea, String modelo, double velocidadMaxima, double capacidadPeso){
		super(aerolinea, modelo, velocidadMaxima);
		this.capacidadPeso = capacidadPeso;
	}
	// ConsultarDatos
	public String consultarDatos(){
		return getAerolinea().consultarDatos() + '\n' + "Remolque: " + getModelo() + " - Capacidad de Carga: " + capacidadPeso + "Kg.";
	}
}