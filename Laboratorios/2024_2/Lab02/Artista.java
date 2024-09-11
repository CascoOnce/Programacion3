import java.util.ArrayList;

public class Artista implements InfoProvider{
// Atributos
	private String nombre;
	private String nacionalidad;
	private ArrayList<Artista> artistas;
// Metodos
	// Constructor
	public Artista(String nombre, String nacionalidad){
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		artistas = new ArrayList<Artista>();
	}
	// Setters & Getters
	public void agregarArtista(Artista artista){artistas.add(artista);}
	// InfoProvider: Devolver Datos
	public String devolverDatos(){
		return "ARTISTA: " + nombre + '\n';
	}
}