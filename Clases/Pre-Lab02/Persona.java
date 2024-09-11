public abstract class Persona implements IConsultable{
// Atributos
	protected String dni;
	protected String nombre;
	protected String apellidoPaterno;
	protected String apellidoMaterno;
// Metodos
	// Constructor
	public Persona(String dni, String nombre, String apellidoPaterno, String apellidoMaterno){
		this.dni = dni;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}
	// Setters & Getters
	public String getDni(){return this.dni;}
	public String getNombre(){return this.nombre;}
	public String getPaterno(){return this.apellidoPaterno;}
	public String getMaterno(){return this.apellidoMaterno;}
}