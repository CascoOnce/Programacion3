public abstract class AmbienteClinico implements IConsultable{
// Atributos
	protected double espacio;
	protected char torre;
	protected Integer piso;
// Metodos
	// Constuctor
	public AmbienteClinico(double espacio, char torre, Integer piso){
		this.espacio = espacio;
		this.torre = torre;
		this.piso = piso;
	}
	// Setters & Getters
	public double getEspacio(){return this.espacio;}
	public char getTorre(){return this.torre;}
	public Integer getPiso(){return this.piso;}
}