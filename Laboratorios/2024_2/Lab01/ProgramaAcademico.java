abstract class ProgramaAcademico implements IConsultable{
// Atributos
	private static int indice = 1;
	private int idProgramaAcademico;
	private String nombre;
	private String clave;
	private char modalidad;
	private double precio;
// Metodos
	// Constructor
	public ProgramaAcademico(String nombre, String clave, char modalidad, double precio){
		this.idProgramaAcademico = indice;
		this.nombre = nombre;
		this.clave = clave;
		this.modalidad = modalidad;
		this.precio = precio;
		indice++;
	}
	// Setters & Getters
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public void setClave(String clave){
		this.clave = clave;
	}
	public String getClave(){
		return clave;
	}
	public void setPrecio(double precio){
		this.precio = precio;
	}
	public double getPrecio(){
		return precio;
	}
}