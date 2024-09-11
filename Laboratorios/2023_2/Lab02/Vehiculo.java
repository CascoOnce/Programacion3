abstract class Vehiculo implements Consultable{
// Atributos
	private Aerolinea aerolinea;
	private String modelo;
	private double velocidadMaxima;
// Metodos
	// Constructor
	public Vehiculo(Aerolinea aerolinea, String modelo, double velocidadMaxima){
		this.aerolinea = aerolinea;
		this.modelo = modelo;
		this.velocidadMaxima = velocidadMaxima;
	}
	// Setters & Getters
	public void setAerolinea(Aerolinea aerolinea){this.aerolinea = aerolinea;}
	public Aerolinea getAerolinea(){return this.aerolinea;}
	public void setModelo(String modelo){this.modelo = modelo;}
	public String getModelo(){return this.modelo;}
	public void setVelocidadMaxima(double velocidadMaxima){this.velocidadMaxima = velocidadMaxima;}
	public double getVelocidadMaxima(){return this.velocidadMaxima;}
}