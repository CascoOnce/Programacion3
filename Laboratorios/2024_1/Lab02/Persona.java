abstract class Persona implements IConsultable{
// Atributos
	private String DNI;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
// Metodos
	// Constructor
	public Persona(String DNI, String nombre, String apellidoPaterno, String apellidoMaterno){
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}
	// Getters & Setters
	public String getDNI(){return this.DNI;}
	public String getNombre(){return this.nombre;}
	public String getApellidoPaterno(){return this.apellidoPaterno;}
	public String getApellidoMaterno(){return this.apellidoMaterno;}
}