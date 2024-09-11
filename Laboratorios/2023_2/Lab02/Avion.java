class Avion extends Vehiculo{
// Atributos
	private int capacidadPasajeros;
// Metodos
	// Constructor
	public Avion(Aerolinea aerolinea, String modelo, double velocidadMaxima, int capacidadPasajeros){
		super(aerolinea, modelo, velocidadMaxima);
		this.capacidadPasajeros = capacidadPasajeros;
	}
	// Consultar Datos
	public String consultarDatos(){
		return "Avion: " + getModelo() + " - Capacidad Max. Pasajeros: " + capacidadPasajeros;
	}
}