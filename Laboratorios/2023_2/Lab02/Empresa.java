abstract class Empresa implements Consultable{
// Atributos
	private String nombre;
// Metodos
	// Constructor
	public Empresa(String nombre){
		this.nombre = nombre;
	}
	// Setters & Getters
	public void setNombre(String nombre){this.nombre = nombre;}
	public String getNombre(){return this.nombre;}
}