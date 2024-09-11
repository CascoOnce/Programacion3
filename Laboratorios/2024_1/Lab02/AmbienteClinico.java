abstract class AmbienteClinico implements IConsultable{
// Atributos
	private double espacio;
	private char torre;
	private int numeroDePiso;
// Metodos
	// Constructor
	public AmbienteClinico(double espacio, char torre, int numeroDePiso){
		this.espacio = espacio;
		this.torre = torre;
		this.numeroDePiso = numeroDePiso;
	}
	// Setters & Getters
	public double getEspacio(){return this.espacio;}
	public char getTorre(){return this.torre;}
	public int getNumeroDePiso(){return this.numeroDePiso;}
}